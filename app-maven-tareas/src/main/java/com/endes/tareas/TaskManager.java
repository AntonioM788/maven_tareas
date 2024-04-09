package com.endes.tareas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author Antonio
 * @version 1.0.
 */
public class TaskManager implements TaskManagerInterface{//Implemento la Interface TaskManager
	
	private Map <Task> tasks = new HashMap<String, Task>(); //Cambio la lista por un Mapa
	
	public void addTask(String title) {//Añadir tareas
	Task newTask = new Task(title);
	tasks.add(newTask);
	
	System.out.println("\"" + title + "\" task has been added.");
	}
	
	/**
	 * Este método cambia a completada una tarea.
	 * @param title El titulo de la Tarea
	 * 
	 */
	public void completeTask(String title) {
		for (Task task : tasks) {
		if (task.title.equals(title)) {
		task.isCompleted = true;
		System.out.println("\"" + title + "\" task is now completed.");
		return;
		}
		}
		System.out.println("Task not found: " + title);
		}
		public void printTasks() {
		System.out.println("Tasks list:");
		for (Task task : tasks) {
		System.out.println("- " + task.title + " [Status: " + (task.isCompleted) "Completed" : "Pending") + "]");
		}
		}
		}


