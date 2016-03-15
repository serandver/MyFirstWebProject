package servlets;

import com.google.gson.Gson;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet Implementation
 */

@WebServlet("/update")
public class Servlet extends HttpServlet{
    private static final long serialVersionIUD = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, Object> map = new HashMap<>();
        boolean isValid = false;
        String userName = req.getParameter("userName");
        if (userName != null && userName.trim().length()!=0) {
            isValid=true;
            map.put("userName", userName);
        }
        map.put("isValid", isValid);
        write(resp, map);
    }

    private void write(HttpServletResponse resp, Map<String, Object> map) throws IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(new Gson().toJson(map));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String textA = "Hello, ";
        String textB = "Mother Fucker World!";
        req.setAttribute("textA", textA);
        req.setAttribute("textB", textB);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}
