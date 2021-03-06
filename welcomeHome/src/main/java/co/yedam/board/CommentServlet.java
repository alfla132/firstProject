package co.yedam.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/CommentServlet")
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CommentServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/xml;charset=utf-8");
		response.setCharacterEncoding("utf-8");

		PrintWriter out = response.getWriter();
		String cmd = request.getParameter("cmd");

		if (cmd == null) {
			out.println(errorXML("cmd null"));

		} else if (cmd.equals("selectJson")) {
			response.setContentType("text/json;charset=utf-8");
			List<HashMap<String, Object>> list = //
					CommentDAO.getInstance().selectAll();

			Gson gson = new GsonBuilder().create();
			String json = gson.toJson(list);
			out.print(json);

		} else if (cmd.equals("selectAll")) { // 1) 한건조회
			try {
				List<HashMap<String, Object>> list = //
						CommentDAO.getInstance().selectAll();

				StringBuffer sb = new StringBuffer();
				sb.append("<result>");
				sb.append("<code>success</code>");
				sb.append("<data>");
				for (HashMap<String, Object> map : list) {
					sb.append("<row>");
					sb.append("  <id>" + map.get("id") + "</id>");
					sb.append("  <name>" + map.get("name") + "</name>");
					sb.append("  <content>" + map.get("content") + "</content>");
					sb.append("</row>");
				}
				sb.append("</data>");
				sb.append("</result>");
				out.print(sb.toString());
			} catch (Exception e) {
				out.print(errorXML(e.getMessage()));
			}

		} else if (cmd.equals("insert")) { // 2) 한건입력.
			try {
				String name = request.getParameter("name");
				String content = request.getParameter("content");
				Comment comment = new Comment();
				comment.setName(name);
				comment.setContent(content);
				HashMap<String, Object> map = CommentDAO.getInstance().insert(comment);

				out.println(dataXML(map));

			} catch (Exception e) {
				out.print(errorXML(e.getMessage()));
			}
		} else if (cmd.equals("insertJson")) {
			response.setContentType("text/json;charset=utf-8");

			String name = request.getParameter("name");
			String content = request.getParameter("content");
			Comment comment = new Comment();
			comment.setName(name);
			comment.setContent(content);
			HashMap<String, Object> map = CommentDAO.getInstance().insert(comment);

			Gson gson = new GsonBuilder().create();
			out.print(gson.toJson(map));

		} else if (cmd.equals("update")) {
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String content = request.getParameter("content");
			Comment comment = new Comment();
			comment.setId(id);
			comment.setName(name);
			comment.setContent(content);
			HashMap<String, Object> map = //
					CommentDAO.getInstance().update(comment);

			out.println(dataXML(map));
		} else if (cmd.equals("delete")) {
			String id = request.getParameter("id");
			HashMap<String, Object> map = //
					CommentDAO.getInstance().delete(id);

			out.print(dataXML(map));

		}
	}

	private String dataXML(HashMap<String, Object> map) {
		StringBuffer sb = new StringBuffer();
		sb.append("<result>");
		sb.append("<code>success</code>");
		sb.append("<data>");
		sb.append("  <id>" + map.get("id") + "</id>");
		sb.append("  <name>" + map.get("name") + "</name>");
		sb.append("  <content>" + map.get("content") + "</content>");
		sb.append("</data>");
		sb.append("</result>");
		return sb.toString();
	}

	private String errorXML(String msg) {
		StringBuffer sb = new StringBuffer();
		sb.append("<result>");
		sb.append("<code>error</code>");
		sb.append("<data>" + msg + "</data>");
		sb.append("</result>");

		return sb.toString();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
