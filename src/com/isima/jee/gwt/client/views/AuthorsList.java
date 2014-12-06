package com.isima.jee.gwt.client.views;

import java.util.List;

import javax.swing.table.TableColumn;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.isima.jee.gwt.client.Home;
import com.isima.jee.ws.Author;

public class AuthorsList extends View {
	
	private FlexTable list;
	private Button detail;
	private Button edit;
	private Button delete;
	private HorizontalPanel panelH;
	
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
		list = new FlexTable();
		list.setStyleName("table table-bordered table-striped dataTable no-foote");
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
			int i = 0, j = 0;
			list.setText(i, j++, "Nom");
			list.setText(i, j++, "Prénom");
			list.setText(i++, j++, "Adresse");
			
			for (Author a : authors) {
				j = 0;
			//	Hyperlink l = new Hyperlink(a.toString(), "p:author_details,n:"+ a.getNum());
				list.setText(i, j++, a.getLastName());
				list.setText(i, j++, a.getLastName());
				list.setText(i, j++, a.getLastName());
				panelH = new HorizontalPanel();
				panelH.add(new Hyperlink("Détail", "p:author_details,n:"+ a.getNum()));
				panelH.add( new Hyperlink("Modifier", "p:author_edit,n:"+ a.getNum()));
				panelH.add(new Button("Supprimer"));			
				list.setWidget(i, j++, 	panelH);
				i++;
			}
		
		} else{
			
		}
	}

	public void show() {
		p.add(list);
	}

}
