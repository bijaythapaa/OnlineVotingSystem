package com.bijay.onlinevotingsystem.controller;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.servlet.http.HttpServlet;

public class SendMail extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Outgoing Mail (SMTP) Server requires TLS or SSL: smtp.gmail.com (use
	 * authentication) Use Authentication: Yes Port for TLS/STARTTLS: 587
	 */
	

	public static void sendMail(String toEmail, int x) {
		final String fromEmail = "**your-mail**";
		final String password = "**password**";
		int otp=x;
		
		
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
		prop.put("mail.smtp.port", "587"); // TLS Port
		prop.put("mail.smtp.auth", "true"); // enable authentication
		prop.put("mail.smtp.starttls.enable", "true");

		Authenticator auth = new Authenticator() {
			// override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getInstance(prop, auth);
		
		MailUtil.sendEmail(session, toEmail, "TLSEmail Testing Subject", "Your OTP is:" + otp );
	}

	/*
	public static void main(String[] args) {
		final String fromEmail = "**your-mail**"; // requires valid gmail id
		final String password = "**password**"; // correct password for gmail id
		final String toEmail = "**your-mail**"; // can be any email id

		System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
		props.put("mail.smtp.port", "587"); // TLS Port
		props.put("mail.smtp.auth", "true"); // enable authentication
		props.put("mail.smtp.starttls.enable", "true"); // enable STARTTLS

		// create Authenticator object to pass in Session.getInstance argument
		Authenticator auth = new Authenticator() {
			// override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getInstance(props, auth);
		MailUtil.sendEmail(session, toEmail, "TLSEmail Testing Subject", "Your OTP is: ");
	}
	*/
}
