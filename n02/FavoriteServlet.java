package n02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import beans.Favorite;

@WebServlet(urlPatterns = { "/n02/favorite" })
public class FavoriteServlet extends HttpServlet {

	public void doPost(
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {


		String name = request.getParameter("name");
		String url = request.getParameter("url");

		HttpSession session = request.getSession();

		List<Favorite> list =
				(List<Favorite>)session.getAttribute("list");

		if(list == null) {
			list = new ArrayList<>();
		}

		Favorite f = new Favorite();

		f.setName(name);
		f.setUrl(url);

		list.add(f);

		session.setAttribute("list", list);

		response.sendRedirect("favorites.jsp");
	}
}