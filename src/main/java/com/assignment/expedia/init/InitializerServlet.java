package com.assignment.expedia.init;

import com.assignment.expedia.manager.DataManager;
import com.assignment.expedia.manager.Manager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitializerServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
        Manager l_component_manager =   new DataManager();
        l_component_manager.manage();
	}
	
}
