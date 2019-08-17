package com.bijay.onlinevotingsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OTP")
public class OTP extends HttpServlet {

	VoterLoginController vlcon = new VoterLoginController();
	public int otp2 = vlcon.giveOtp();
	private static final long serialVersionUID = 1L;

	public OTP() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("OTP.jsp");
		System.out.println("otp is:" + otp2);
		rd.include(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int otp1 =Integer.parseInt(request.getParameter("votp"));
		
		if (otp1==otp2) {
			RequestDispatcher rd = request.getRequestDispatcher("ballot.jsp");
			rd.forward(request, response);
		}
	}
}
