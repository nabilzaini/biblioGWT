package com.isima.jee.gwt.client;

import java.util.HashMap;

import com.google.gwt.user.client.Window;

public class URL {
		
	private static HashMap<String, String> params;
	
	public static void updateParameters(){
		Home.log("updating parameters");
		params = new HashMap<String, String>();
		String url = Window.Location.getHref();
		if(url.indexOf('#') != -1){
			url = url.substring(url.indexOf('#') + 1);
			String[] array = url.split(",");
			for(String s : array){
				Home.log(s);
				String[] pair = s.split(":");
				params.put(pair[0], pair[1]);
			}
		}
	}
	public static String getParameter(String name){
		return params.get(name);
	}
}
