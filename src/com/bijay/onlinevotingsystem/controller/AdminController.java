package com.bijay.onlinevotingsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bijay.onlinevotingsystem.dao.AdminDao;
import com.bijay.onlinevotingsystem.dao.AdminDaoImpl;
import com.bijay.onlinevotingsystem.dao.BallotDao;
import com.bijay.onlinevotingsystem.dao.BallotDaoImpl;
import com.bijay.onlinevotingsystem.dao.VoterDao;
import com.bijay.onlinevotingsystem.dao.VoterDaoImpl;
import com.bijay.onlinevotingsystem.dto.Admin;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminDao adminDao = new AdminDaoImpl();
	VoterDao voterDao = new VoterDaoImpl();
	BallotDao ballotDao = new BallotDaoImpl();
	Admin admin = new Admin();
	SHA256 sha = new SHA256();

	private static final String ADMIN_REGISTRATION_FORM = "adminRegistrationForm.jsp";
	private static final String ADMIN_LIST = "adminlist.jsp";
	private static final String VOTER_LIST = "voterlist.jsp";
	private static final String BALLOT_LIST = "ballotlist.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("actions");
		String forward = "";
		if (action.equals("admin_new")) {
			forward = ADMIN_REGISTRATION_FORM;
		} else if (action.equals("admin_list")) {
			request.setAttribute("admins", adminDao.getAllAdminInfo());
			forward = ADMIN_LIST;
		} else if (action.equals("admin_edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			request.setAttribute("admin", adminDao.getAdminInfoById(id));
			forward = ADMIN_REGISTRATION_FORM;
		} else if (action.equals("admin_delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			adminDao.deleteAdminInfo(id);
			request.setAttribute("admins", adminDao.getAllAdminInfo());
			forward = ADMIN_LIST;
		} else if (action.equals("voter_list")) {
			request.setAttribute("voters", voterDao.getAllVoterInfo());
			forward = VOTER_LIST;
		} else if (action.equals("voter_delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			voterDao.deleteVoterInfo(id);
			request.setAttribute("voters", voterDao.getAllVoterInfo());
			forward = VOTER_LIST;
		} else if (action.equals("ballot_list")) {
			request.setAttribute("ballots", ballotDao.getAllBallotInfo());
			forward = BALLOT_LIST;
		}

		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		admin.setAdminName(request.getParameter("aname"));
		admin.setPassword(sha.getSHA(request.getParameter("pass")));
		/*
		 * String pass = sha.getSHA(password); admin.setPassword(pass);
		 */

		// editbyid garepaxi, id samet data janxa. so this line is needed
		String adminId = request.getParameter("id");
		if (adminId == null || adminId.isEmpty()) {
			adminDao.saveAdminInfo(admin);
		} else {
			admin.setId(Integer.parseInt(adminId));
			adminDao.updateAdminInfo(admin);
		}

		RequestDispatcher rd = request.getRequestDispatcher("adminlogin.jsp");
		request.setAttribute("registrationSuccessMsg", "Successfully Registered !!");
		rd.include(request, response);
	}
}