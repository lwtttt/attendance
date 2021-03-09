package com.etc.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.etc.entity.Clock;
import com.etc.service.ClockService;
import com.etc.service.impl.ClockServiceImpl;

/**
 * 
 * @author etc 打卡操作
 */
@WebServlet("/AddClockService")
public class AddClockService extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * request.setCharacterEncoding("utf-8");
		 * response.setContentType("text/html;charset=utf-8");
		 * 
		 * 通过session进行获取，可以在xml中直接获取ֵ
		 * 
		 * Clock clock = new Clock(); clock.setUserId(userId); ClockService cs = new
		 * ClockServiceImpl(); int result = cs.AddClock(clock); 为重定向
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
