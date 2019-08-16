package com.bijay.onlinevotingsystem.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bijay.onlinevotingsystem.dao.BallotDao;
import com.bijay.onlinevotingsystem.dao.BallotDaoImpl;
import com.bijay.onlinevotingsystem.dto.Ballot;

@WebServlet("/BallotController")
public class BallotController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BallotDao ballotDao = new BallotDaoImpl();
	RSA rsa = new RSA();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("ballot.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Ballot ballot = new Ballot();

		/*ballot.setVoterId(Integer.parseInt(request.getParameter("voterid")));
		ballot.setPartyName(request.getParameter("party"));
		ballotDao.saveBallotInfo(ballot);
		*/
		//String voterId = request.getParameter("voterid");
		String partyName= request.getParameter("party");
		
		//String voteId = request.getParameter(id);
		
		byte[] castedVote = rsa.encrypt(partyName.getBytes());
		ballot.setPartyName(castedVote);
		ballotDao.saveBallotInfo(ballot);
		
		
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		request.setAttribute("votingSuccessMsg", "Voting Successful !!");
		rd.include(request, response);
	}
}