package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		System.out.println("处理GET请求...");
		PrintWriter out=resp.getWriter();
		out.println("get请求，hello servlet");
		
		//得到表单数据
		String name=req.getParameter("name");
		out.println("您的姓名是"+name);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		System.out.println("处理Post请求...");
		PrintWriter out=resp.getWriter();
		out.println("post请求，hello servlet");
		out.print("</br>");
		//得到表单数据
		String name=req.getParameter("name");
		out.println("您的姓名是"+name);
		
		req.getSession().setAttribute("name", name);
		
		//页面跳转
		req.getRequestDispatcher("../show.jsp").forward(req, resp);
	
	}

}
