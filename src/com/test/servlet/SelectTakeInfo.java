package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.impl.TakeLookInfoMapperImpl;
import com.test.entity.Customer;
import com.test.entity.Emp;
import com.test.entity.House;
import com.test.entity.Takelookinfo;

/**
 * Servlet implementation class SelectTakeInfo
 */
public class SelectTakeInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectTakeInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TakeLookInfoMapperImpl dao = new TakeLookInfoMapperImpl();
		Takelookinfo t = dao.selectTakeLook("李大坤");
		request.setCharacterEncoding("UTF-8");  
        // 设置输出编码  
        response.setCharacterEncoding("UTF-8");  
        response.setContentType("text/html;charset=UTF-8");  
        PrintWriter out = response.getWriter(); 
        
        Emp e = t.getEmp();
        Customer c = t.getCustomer();
        House h = t.getHouse();
        
        out.print(e.getEmpName()+"<hr>");
        out.print(c.getName()+"<br>");
        out.print(h.getHousename()+"<hr>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
