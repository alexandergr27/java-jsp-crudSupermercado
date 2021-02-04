package com.agrmarket.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agrmarket.dao.ProductDao;
import com.agrmarket.model.Product;

/**
 * Servlet implementation class FindProduct
 */
@WebServlet("/FindProduct")
public class FindProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productCode = Integer.parseInt(request.getParameter("productcode"));
		//System.out.print(productCode);
		ProductDao productDao = new ProductDao();
		Product product = new Product();
		try {
			product = productDao.getOneProduct(productCode);
			request.setAttribute("product", product);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/editProduct.jsp");
			requestDispatcher.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deletecode = Integer.parseInt(request.getParameter("deletecode"));
		ProductDao productDao = new ProductDao();
		try {
			productDao.delete(deletecode);
			System.out.print("eliminadoooo  :(");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
