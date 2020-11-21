package com.cg.oicrs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class ClaimCreationController
 */
public class ClaimCreationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static Logger logger=LogManager.getLogger(ClaimCreationController.class);
	
	
	public ClaimCreationController() {
		
		super();
		
	}
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String claimReason=request.getParameter("claimReason");
		String accidentLocationStreet=request.getParameter("accidentLocationStreet");
		String accidentCity=request.getParameter("acccidentCity");
		String accidentState=request.getParameter("accidentState");
		int accidentZip=Integer.parseInt(request.getParameter("accidentZip"));
		String claimType=request.getParameter("claimType");
		
		if(!(claimReason.isEmpty() || accidentLocationStreet.isEmpty() || accidentCity.isEmpty() || accidentState.isEmpty() || accidentZip==0 || claimType.isEmpty())) {
			RequestDispatcher requestDis=request.getRequestDispatcher("ClaimDetailsSuccess.jsp");
		}	
	}	
}
