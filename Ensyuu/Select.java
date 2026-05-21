package chapter6;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(urlPatterns = { "/chapter6/select" })
public class Select extends HttpServlet {
	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		try {

			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup(
					"java:/comp/env/jdbc/book");
			Connection con = ds.getConnection();

			String count = request.getParameter("count");
			String payment = request.getParameter("payment");
			String review = request.getParameter("review");
			String mail = request.getParameter("mail");

			PreparedStatement st = con.prepareStatement(
					"insert into quantity(count,payment,review,mail) values(?,?,?,?)");

			st.setString(1, count);
			st.setString(2, payment);
			st.setString(3, review);
			st.setString(4, mail);

			int line = st.executeUpdate();

			if (line > 0) {
				out.println("登録成功");
			}
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
}
