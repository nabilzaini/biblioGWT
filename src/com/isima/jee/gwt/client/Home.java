package com.isima.jee.gwt.client;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.isima.jee.gwt.client.service.ServiceInterface;
import com.isima.jee.gwt.client.service.ServiceInterfaceAsync;
import com.isima.jee.gwt.client.views.AuthorsAdd;
import com.isima.jee.gwt.client.views.AuthorsDetails;
import com.isima.jee.gwt.client.views.AuthorsList;
import com.isima.jee.gwt.client.views.View;



public class Home implements EntryPoint {
	public static ServiceInterfaceAsync s = GWT.create(ServiceInterface.class);
	private static HashMap<String, View> views;
	private static Logger logger;

	public static void init(){
		logger = Logger.getLogger("");
		
		views = new HashMap<String, View>();
		views.put("author_list", new AuthorsList("content"));
		views.put("author_add", new AuthorsAdd("content"));
		views.put("author_details", new AuthorsDetails("content"));
		views.put("author_edit", new AuthorsDetails("content"));
		
		URL.updateParameters();
	}
	public void onModuleLoad() {
		init();
		load();
		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			public void onValueChange(ValueChangeEvent<String> event) {
				log("URL changed !");
				URL.updateParameters();
				load();
			}
		});
	}
	public void load(){
		String viewName = URL.getParameter("p");
		if(viewName == null)
			viewName = "authors_list";
		Home.show(viewName);
	}
	public static void show(String name){
		View v = Home.views.get(name);
		if(v != null)
			v.render();
	}
	public static void log(String msg){
		logger.log(Level.INFO, msg);
	}
}
