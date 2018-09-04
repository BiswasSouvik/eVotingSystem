package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.Adloginlogic;
import logic.Adsignuplogic;
import dao.AdloginDao;
import dao.Dao;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Controller.Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:").append(request.getContextPath());

		String name=request.getParameter("textName");
		int param=Integer.parseInt(request.getParameter("param"));
		System.out.println(param);
		switch (param)
		{
		case 1:
			Dao dao= new Dao();
			dao.setName(name);
			dao.setEmail(request.getParameter("email"));
			dao.setPassword(request.getParameter("Password"));
			Adsignuplogic ob=new Adsignuplogic();
			if(ob.meth(dao)==true)
			{
				response.sendRedirect("Adlogin.jsp");
			}
			else
			{
				response.sendRedirect("error.jsp");
			}
			break;
		case 2:
			AdloginDao dao1=new AdloginDao();
			dao1.setEmail(request.getParameter("email"));
			dao1.setPassword(request.getParameter("password"));
			Adloginlogic obj=new Adloginlogic();
			if(obj.meth(dao1)==true)
			{
				response.sendRedirect("Addinfo.jsp");
			}
			else
			{
				response.sendRedirect("error.jsp");
			}
			
		}
	}

}
