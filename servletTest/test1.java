package servletTest;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/servletTest/test1"})
public class test1 extends HttpServlet{
	
	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException,IOException{
		
		response.setContentType("text/html; cherset=UTF-8");
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>\n"
				+ "<html>\n"
				+ "<head>\n"
				+ "<meta charset=\"UTF-8\">\n"
				+ "<title>フォーム</title>\n"
				+ "</head>\n"
				+ "<body>");
		
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		String company=request.getParameter("company");
		String mailadress=request.getParameter("mailadress");
		String toiawase=request.getParameter("toiawase");
		String mailmaga=request.getParameter("mailmaga");
		String shiryou=request.getParameter("shiryou");

		String[] shiryou =request.getParameterValues("shiryou");
		if(shiryou=) {
			for(String item : shiryou) {
				out.println("この度は資料請求いただきありがとうございます。以下のリンクから資料ダウンロードが可能です。")
			out.println("/https:～～～");
			}
			
			
		}
		
		out.println("</body>");
		out.println("</html>");
	}
}