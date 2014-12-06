package com.isima.jee.gwt.client.views;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.isima.jee.gwt.client.widgets.Form;

public class BooksAdd extends View {
	private Panel innerPanel;
	private Form form;
	private TextBox titleTxt;
	private TextBox priceTxt;
	private TextArea descrTxt;
	private Button submitBtn;	
	
	public BooksAdd(String id) {
		setPanel(id);
	}
	
	public void create() {
		innerPanel = new HTMLPanel("");
		form = new Form();
		titleTxt = form.addTextField("Titre");
		priceTxt = form.addTextField("Prix");
		descrTxt = form.addTextArea("Description");
		submitBtn = form.addSubmit("Ajouter");
	}
	public void load() {

	}
	public void fill() {

	}
	public void show() {
		innerPanel.add(new HTMLPanel("h1","Ajouter un livre"));
		innerPanel.add(form);
		p.add(innerPanel);
	}

}
