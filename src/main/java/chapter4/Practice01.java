package chapter4;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/chapter4/practice01" })
public class Practice01 extends HttpServlet {

	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");

		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy年MM月dd日(E) HH時mm分ss秒",
				Locale.JAPANESE);

		out.println(
				"現在の時刻は："+
				sdf.format(date)+
				"です");

		out.println("</body>");
		out.println("</html>");
	}
}
