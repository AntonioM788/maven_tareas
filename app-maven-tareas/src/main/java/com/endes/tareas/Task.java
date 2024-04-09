package com.endes.tareas;

import java.util.ArrayList;
import java.util.List;

public class Task {
	
	private String title;
	private boolean isCompleted;
	
	public Task(String title) {
	this.title = title;
	this.isCompleted = false;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {//Añado Getters and Setters.
		this.title = title;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	
	
}
