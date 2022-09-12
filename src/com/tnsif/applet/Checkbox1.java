package com.tnsif.applet;
import java.applet.Applet;

import java.awt.TextField;
import java.awt.Event;
import java.awt.Label;
import java.awt.Checkbox; 

public class Checkbox1 extends Applet {
	
	TextField t;
	Checkbox c1,c2,c3,c4;
	
	
	public void init() {
		add(c1 = new Checkbox("1"));
		add(c2 = new Checkbox("2"));
		add(c3 = new Checkbox("3"));
		add(c4 = new Checkbox("4"));
		add(t = new TextField(10));
	
	}
	public boolean action(Event e, Object o) {
		int sum = 0;
		if(c1.getState())
			sum = sum + 1;
		if(c2.getState())
			sum = sum + 2;
		if(c3.getState())
			sum = sum + 3;
		if(c4.getState())
			sum = sum + 4;
		
		t.setText(String.valueOf(sum));
		
		return false;
		
	}

	
}
