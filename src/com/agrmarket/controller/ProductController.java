package com.agrmarket.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agrmarket.dao.ProductDao;
import com.agrmarket.model.Product;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String option = request.getParameter("option");
		
		if(option.equals("newProduct")) {
			System.out.print("opcion de crear usuario");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/NewProduct.jsp");
			requestDispatcher.forward(request, response);
		} else if(option.equals("productList")) {
			ProductDao productdao = new ProductDao();
			List<Product> lista = new ArrayList<>();
			try {
				lista = productdao.getAllProducts();
				for(Product product: lista) {
					System.out.print(product);
				}
				request.setAttribute("productlist", lista);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/Listar.jsp");
				requestDispatcher.forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		else if(option.equals("productUpdate")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/productUpdate.jsp");
			requestDispatcher.forward(request, response);
			
		}
		
		else if(option.equals("productDelete")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/findProduct.jsp");
			requestDispatcher.forward(request, response);
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String option = request.getParameter("option");
		if(option.equals("save")) {
			ProductDao productdao = new ProductDao();
			Product product = new Product();
			product.setCode(Integer.parseInt(request.getParameter("code")));
			product.setDescription(request.getParameter("description"));
			product.setBrand(request.getParameter("brand"));
			product.setPresentation(request.getParameter("presentation"));
			product.setPrice(Integer.parseInt(request.getParameter("price")));
			product.setLocation(Integer.parseInt(request.getParameter("location")));
			try {
				productdao.save(product);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if(option.equals("editar")) {
			ProductDao productDao = new ProductDao();
			Product productEdit = new Product();
			int code = Integer.parseInt(request.getParameter("code"));
			
			try {
				productEdit.setCode(Integer.parseInt(request.getParameter("editcode")));
				productEdit.setDescription(request.getParameter("editdescription"));
				productEdit.setBrand(request.getParameter("editbrand"));
				productEdit.setPresentation(request.getParameter("editpresentation"));
				productEdit.setPrice(Integer.parseInt(request.getParameter("editprice")));
				productEdit.setLocation(Integer.parseInt(request.getParameter("editlocation")));
				productDao.edit(productEdit, code);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
