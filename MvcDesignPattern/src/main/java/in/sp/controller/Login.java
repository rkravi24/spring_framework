package in.sp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.sp.beans.User;
import in.sp.dbCon.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String email = req.getParameter("email1");
		String pass = req.getParameter("pass1");
		
		try {
			Connection con = DbConnection.getConection();
			
			String select_query = "select * from user where email = ? and pass = ?";
			
			PreparedStatement ps = con.prepareStatement(select_query);
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet rs = (ResultSet) ps.executeQuery();
			if(rs.next()){
				
				User user  = new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCity(rs.getString("city"));
				
				HttpSession  session = req.getSession();
				session.setAttribute("session_user", user);
				
				RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
				rd.forward(req, resp);
				
			}else {
				out.println("<h3 style='color:red'>Email id or password didnt match</h3>");
				RequestDispatcher rd = req.getRequestDispatcher(".login.html");
				rd.include(req, resp);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
