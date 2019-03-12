//package com.cch;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.ServletOutputStream;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class FileServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	public FileServlet() {
//		super();
//	}
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String file = request.getParameter("file"); // 客户端传递的需要下载的文件名
//		response.setCharacterEncoding("utf-8");
//		response.setHeader("Content-Disposition", "attachment; filename=" + file);
//		String path = request.getServletContext().getRealPath("/log/") + File.separatorChar + file; // 默认认为文件在当前项目的根目录
//		try (FileInputStream fis = new FileInputStream(path); ServletOutputStream out = response.getOutputStream()) {
//			byte[] bt = new byte[1024];
//			int length = 0;
//			while ((length = fis.read(bt)) != -1) {
//				out.write(bt, 0, length);
//			}
//		}
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//}
