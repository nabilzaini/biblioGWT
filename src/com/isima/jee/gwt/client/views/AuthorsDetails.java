package com.isima.jee.gwt.client.views;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.isima.jee.gwt.client.Home;
import com.isima.jee.gwt.client.URL;
import com.isima.jee.ws.Author;

public class AuthorsDetails extends View {
	private Label lastName;
	private Label lastNameT;
	private Label firstName;
	private Label firstNameT;
	private Label address;
	private Label addressT;
	private VerticalPanel panelV;
	private HorizontalPanel panelH1;
	private HorizontalPanel panelH2;
	private HorizontalPanel panelH3;
	
	private Author author;
	public AuthorsDetails(String id){
		setPanel(id);
		
	}

	@Override
	public void create() {
		lastName = new Label();
		lastNameT = new Label();
		
		firstName = new Label();
		firstNameT = new Label();
		
		address = new Label();
		addressT = new Label();
		
		panelH1 = new HorizontalPanel();
		panelH1.setStyleName("modal-body");
		
		panelH2 = new HorizontalPanel();
		panelH2.setStyleName("modal-body");
		
		panelH3 = new HorizontalPanel();
		panelH3.setStyleName("modal-body");
		
		panelV = new VerticalPanel();
		panelV.setStyleName("modal-body");
		
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
		lastName.setText("Nom :");
		lastNameT.setText(author.getLastName());
		panelH1.add(lastName);
		panelH1.add(lastNameT);
		
		firstName.setText("Prénom :");
		firstNameT.setText(author.getFirstName());
		panelH2.add(firstName);
		panelH2.add(firstNameT);
		
		address.setText("Adresse :");
		addressT.setText(author.getAdress());
		panelH3.add(address);
		panelH3.add(addressT);
		
		panelV.add(panelH1);
		panelV.add(panelH2);
		panelV.add(panelH3);
		
	}

	@Override
	public void show() {
		p.add(panelV);
	}

}
