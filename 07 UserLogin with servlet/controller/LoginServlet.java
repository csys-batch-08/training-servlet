package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daoImple.ConnectionUtil;
import daoImple.UserDaoImpl;
import model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		long mobile = Long.parseLong(req.getParameter("mobile"));

		UserDaoImpl userDao = new UserDaoImpl();
		User user = userDao.validateUser(mobile);

		if (user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("CurrentUser", user);
			resp.sendRedirect("welcome.jsp");
		} else {
			PrintWriter pw = resp.getWriter();
			pw.write("Invalid User");

		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
