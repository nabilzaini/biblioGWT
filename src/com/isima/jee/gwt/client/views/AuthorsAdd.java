package com.isima.jee.gwt.client.views;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.isima.jee.gwt.client.Home;

public class AuthorsAdd extends View {
	private Label lastName;
	private Label firstName;
	private Label address;
	private TextBox lastNameT;
	private TextBox firstNameT;
	private TextBox addressT;
	private Button submit;
	private int n;

	private HorizontalPanel panelH1;
	private HorizontalPanel panelH2;
	private HorizontalPanel panelH3;
	private HorizontalPanel panelH4;
	
	private VerticalPanel panelV;
	
	public AuthorsAdd(String id) {
		setPanel(id);
	}
	public ClickHandler handler = new ClickHandler() {
		public void onClick(ClickEvent event) {
			Home.s.addAuthor(lastNameT.getText(), firstNameT.getText(), addressT.getText(), new AsyncCallback<Integer>() {
				public void onSuccess(Integer result) {
					n = result;				
				}
				public void onFailure(Throwable caught) {
					n = -1;
				}
			});
			
		}
	};
	public void create() {
		panelH1 = new HorizontalPanel();
		panelH2 = new HorizontalPanel();
		panelH3 = new HorizontalPanel();
		panelH4 = new HorizontalPanel();
		panelV = new VerticalPanel();
		
		lastName = new Label("Nom");
		lastName.setStyleName("col-sm-2 control-label");
		firstName = new Label("Prénom");
		firstName.setStyleName("col-sm-2 control-label");
		
		address = new Label("Adresse");
		address.setStyleName("col-sm-2 control-label");
		lastNameT = new TextBox();
		lastNameT.setStyleName("form-control");
		firstNameT = new TextBox();
		firstNameT.setStyleName("form-control");
		addressT = new TextBox();
		addressT.setStyleName("form-control");
		submit = new Button("Valider");
		submit.setStyleName("btn btn-primary");
		submit.addClickHandler(handler);
		
		panelH1.add(lastName);
		panelH1.add(lastNameT);
		
		panelH2.add(firstName);
		panelH2.add(firstNameT);
		
		panelH3.add(address);
		panelH3.add(addressT);
		
		panelH4.add(submit);
		
		panelV.add(panelH1);
		panelV.add(panelH2);
		panelV.add(panelH3);
		panelV.add(panelH4);
		
		n = -1;
	}

	public void load() {
	
		
	}
	public void fill() {

	}

	public void show() {
		p.add(panelV);
	}

}
