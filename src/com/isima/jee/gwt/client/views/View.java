package com.isima.jee.gwt.client.views;

import com.google.gwt.user.client.ui.RootPanel;

public abstract class View {
	protected RootPanel p;
	public void setPanel(String id){
		p = RootPanel.get(id);
		if(p == null)
			p = RootPanel.get();
	}
	public abstract void create(); // create widgets
	public abstract void load(); // load needed data
	public abstract void fill(); // fill widgets with corresponding data
	public abstract void show(); // show the view in the corresponding panel
	public void clear() {
		p.clear();
	}

	public void reload() {
		clear();
		load();
		show();
	}

	public void render() {
		create();
		reload();
	}
}
