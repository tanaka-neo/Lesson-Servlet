package Ensyuu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import bean.Purchase;
import dao.PurchaseDAO;
import tool.Page;

@WebServlet(urlPatterns = { "/chapter6/select" })
public class Select extends HttpServlet {
	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		try {

			String count = request.getParameter("count");
			String payment = request.getParameter("payment");
			String review = request.getParameter("review");
			String mail = request.getParameter("mail");

			Purchase p=new Purchase();
			
			p.setCount(count);
			p.setPayment(payment);
			p.setReview(review);
			p.setMail(mail);

			PurchaseDAO dao=new PurchaseDAO();
			
			int line = dao.insert(p);

			if (line > 0) {
				out.println("登録成功");
			
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
}
