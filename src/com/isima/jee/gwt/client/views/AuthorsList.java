package com.isima.jee.gwt.client.views;

import java.util.List;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.isima.jee.gwt.client.Home;
import com.isima.jee.ws.Author;

public class AuthorsList extends View {
	
	private VerticalPanel names;
	
	private List<Author> authors;
	
//	public ClickHandler LoadEvent = new ClickHandler() {
//		public void onClick(ClickEvent event) {
//			Home.s.get(new AsyncCallback<Entity>() {
//				public void onSuccess(Entity result) {
//					e = result;
//					fill();
//				}
//				public void onFailure(Throwable caught) {
//					e = null;
//				}
//			});
//		}
//	};
	
	public AuthorsList( String id) {
		setPanel(id);
	}

	public void create() {
		names = new VerticalPanel();		
		authors = null;
	}

	public void load() {
		Home.s.allAuthors(new AsyncCallback<List<Author>>() {
			public void onSuccess(List<Author> result) {
				authors = result;
				fill();
			}
			public void onFailure(Throwable caught) {
				authors = null;
				fill();
			}
		});
	}

	public void fill() {
		if(authors != null){
			for(Author a : authors){
				Hyperlink l = new Hyperlink(a.getFirstName(), "p:author_details,n:"+ a.getNum());
				names.add(l); 
			}
		} else{
			names.add(new Label("pas d'auteur"));
		}
	}

	public void show() {
		p.add(names);
	}

}
