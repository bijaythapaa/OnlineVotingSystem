package com.bijay.onlinevotingsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bijay.onlinevotingsystem.dao.VoterDao;
import com.bijay.onlinevotingsystem.dao.VoterDaoImpl;

@WebServlet("/vLoginController")
public class VoterLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	VoterDao voterDao = new VoterDaoImpl();
	SHA256 sha = new SHA256();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * one servlet le another servlet ma request garda doGet() ma aauxa. so for
		 * logout, session use garera login page ma dispatch garxau.
		 */

		HttpSession session = request.getSession();
		session.invalidate();

		RequestDispatcher rd = request.getRequestDispatcher("voterlogin.jsp");
		request.setAttribute("loggedOutMsg", "Log Out Successful !!");
		rd.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// to get values from the login page
		String userName = request.getParameter("uname");
		String password = sha.getSHA(request.getParameter("pass"));

		// validation
		if (voterDao.loginValidate(userName, password)) {

			// to display the name of logged-in person in home page

			HttpSession session = request.getSession();
			session.setAttribute("username", userName);

			RequestDispatcher rd = request.getRequestDispatcher("ballot.jsp");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("voterlogin.jsp");
			request.setAttribute("loginFailMsg", "Invalid Username or Password !!");
			request.setAttribute("forgotPassMsg", "Forgot password??");
			rd.include(request, response);
			String forgetpass = request.getParameter("forgotPass");
			// System.out.println(forgetpass);
			if (forgetpass == null) {
				rd = request.getRequestDispatcher("resetPassword.jsp");
				rd.forward(request, response);
			}
		}
	}
}