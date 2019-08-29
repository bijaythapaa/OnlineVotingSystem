package com.bijay.onlinevotingsystem.controller;

import com.bijay.onlinevotingsystem.controller.PieChartData;
import com.bijay.onlinevotingsystem.controller.PieChartData.KeyValue;
import com.bijay.onlinevotingsystem.dao.BallotDao;
import com.bijay.onlinevotingsystem.dao.BallotDaoImpl;
import com.bijay.onlinevotingsystem.dto.Ballot;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PieChartServlet")
public class PieChartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BallotDao ballotDao = new BallotDaoImpl();
	RSA rsa = new RSA();

	public PieChartServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<KeyValue> pieDataList = PieChartData.getPieDataList();

		// pieDataList.forEach(e ->{
		// System.out.println(e.getKey()+" "+e.getValue());
		// });

		request.setAttribute("pieDataList", pieDataList);
		RequestDispatcher rd = request.getRequestDispatcher("pichart.jsp");
		rd.forward(request, response);


		// List<KeyValue> pieDataList = PieChartData.getPieDataList();
		// request.setAttribute("pieDataList", pieDataList);
		// RequestDispatcher rd = request.getRequestDispatcher("/servlet.jsp");
		// rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
