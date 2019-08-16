package com.bijay.onlinevotingsystem.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bijay.onlinevotingsystem.dao.VoterDao;
import com.bijay.onlinevotingsystem.dao.VoterDaoImpl;
import com.bijay.onlinevotingsystem.dto.Voter;

@WebServlet("/VoterController")
@MultipartConfig
public class VoterController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	VoterDao voterDao = new VoterDaoImpl();
	SHA256 sha = new SHA256();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("voterRegistrationForm.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * System.out.println(request.getParameter("vname"));
		 * System.out.println(request.getParameter("ctzno"));
		 * System.out.println(request.getParameter("disname"));
		 * System.out.println(request.getParameter("dob"));
		 * System.out.println(request.getParameter("gender"));
		 * System.out.println(request.getParameter("department"));
		 * System.out.println(Arrays.toString(request.getParameterValues("subject")));
		 * System.out.println(request.getPart("photo"));
		 * System.out.println(request.getParameter("email"));
		 */

		Voter voter = new Voter();

		voter.setVoterName(request.getParameter("vname"));
		voter.setPassword(sha.getSHA(request.getParameter("pass")));
		/*String password = request.getParameter("pass");
		voter.setPassword(sha.getSHA(password));*/
		voter.setStateNo(Integer.parseInt(request.getParameter("stno")));
		voter.setDistrictName(request.getParameter("disname"));
		voter.setEmail(request.getParameter("email"));
		voter.setGender(request.getParameter("gender"));

		// for date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date d = sdf.parse(request.getParameter("dob"));
			voter.setDob(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/*
		 * for check-box (multiple options) String[] subjects =
		 * request.getParameterValues("subject"); String subject = ""; for (String sub :
		 * subjects) { subject = subject + sub + "/"; } voter.setSubject("subject");
		 */

		// for image
		System.out.println(request.getPart("photo"));
		voter.setImgUrl("");

		voterDao.saveVoterInfo(voter);

		RequestDispatcher rd = request.getRequestDispatcher("voterlogin.jsp");
		request.setAttribute("registrationSuccessMsg", "Successfully Registered !!");
		rd.include(request, response);

	}
}
