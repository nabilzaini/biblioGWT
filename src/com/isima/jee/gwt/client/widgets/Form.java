package com.isima.jee.gwt.client.widgets;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Form implements IsWidget {
	private HTMLPanel container;
	
	public Form() {
		container = new HTMLPanel("");
		container.setStyleName("form-horizontal");
	}
		
	public TextBox addTextField(String name){
		Label lbl = new Label(name);
		lbl.setStyleName("col-sm-2 control-label");

		TextBox txt = new TextBox();
		txt.setStyleName("form-control");
		HTMLPanel inputPanel = new HTMLPanel("");
		inputPanel.setStyleName("col-sm-10");
		inputPanel.add(txt);
		
		HTMLPanel panel = new HTMLPanel("");
		panel.setStyleName("form-group");
		panel.add(lbl);
		panel.add(inputPanel);
		
		container.add(panel);
		return txt;
	}
	
	public TextArea addTextArea(String name){
		Label lbl = new Label(name);
		lbl.setStyleName("col-sm-2 control-label");

		TextArea txt = new TextArea();
		txt.setStyleName("form-control");
		HTMLPanel inputPanel = new HTMLPanel("");
		inputPanel.setStyleName("col-sm-10");
		inputPanel.add(txt);
		
		HTMLPanel panel = new HTMLPanel("");
		panel.setStyleName("form-group");
		panel.add(lbl);
		panel.add(inputPanel);
		
		container.add(panel);
		return txt;
	}
	
	public Button addSubmit(String value){
		Button submit = new Button(value);
		submit.setStyleName("btn btn-primary");
		HTMLPanel spanel = new HTMLPanel("");
		spanel.setStyleName("col-sm-offset-2 col-sm-10");
		spanel.add(submit);
		
		HTMLPanel panel = new HTMLPanel("");
		panel.setStyleName("form-group");
		panel.add(spanel);
		
		container.add(panel);
		return submit;
	}
	
	public Widget asWidget() {
		return container;
	}

}
