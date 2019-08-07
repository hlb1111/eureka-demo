package org.eureka.demo.producer.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(name = "IndexServlet",urlPatterns = "/notice")
public class NoticeServlet extends HttpServlet {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private static final long serialVersionUID = -1133851334330014298L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.debug(req.getQueryString());
		resp.getWriter().print("hello NoticeServlet菰黑粉菌科");
        resp.getWriter().flush();
        resp.getWriter().close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	
	
}
