package com.isima.jee.gwt.client.views;

import com.google.gwt.user.client.ui.Label;

public class AuthorsAdd extends View {
	private Label hello;
	
	public AuthorsAdd(String id) {
		setPanel(id);
	}

	@Override
	public void create() {
		hello = new Label("Hello");
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
	}

	@Override
	public void fill() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		p.add(hello);
	}

}
