package com.example.web;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.*;

public class BierAuswahl extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String c = request.getParameter("farbe");
		BierExperte be = new BierExperte();
		List result = be.getMarken(c);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Empfohlendes Bier<br>");

		Iterator it = result.iterator();
		while (it.hasNext()) {
			out.println("<br>Probieren Sie mal: " + it.next());
		}
	}
}
