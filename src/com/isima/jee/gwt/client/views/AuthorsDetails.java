package com.isima.jee.gwt.client.views;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.isima.jee.gwt.client.Home;
import com.isima.jee.gwt.client.URL;
import com.isima.jee.ws.Author;

public class AuthorsDetails extends View {
	private Label name;
	private Author author;
	public AuthorsDetails(String id){
		setPanel(id);
		
	}

	@Override
	public void create() {
		name = new Label();
		author = null;
	}

	@Override
	public void load() {
		String n = URL.getParameter("n");
		if(n != null)
			 Home.s.getAuthor(Integer.parseInt(n), new AsyncCallback<Author>() {
				
				public void onSuccess(Author result) {
					author = result;
					fill();
				}
				public void onFailure(Throwable caught) {
					author = null;
					fill();
				}
			});
	}

	@Override
	public void fill() {
		name.setText(author.getFirstName());
	}

	@Override
	public void show() {
		p.add(name);
	}

}
