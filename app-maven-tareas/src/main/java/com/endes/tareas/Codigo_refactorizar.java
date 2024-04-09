package com.endes.tareas;

public class Codigo_refactorizar {
	
	class Task {
		public String title;
		public boolean isCompleted;
		public Task(String title) {
		this.title = title;
		this.isCompleted = false;
		}
		}
		class TaskManager {
		private List<Task> tasks = new ArrayList<>();
		public void addTask(String title) {
		Task newTask = new Task(title);
		tasks.add(newTask);
		System.out.println("\"" + title + "\" task has been added.");
		}
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
		System.out.println("- " + task.title + " [Status: " + (task.isCompleted
		? "Completed" : "Pending") + "]");
		}
		}
		}
		public class Main {
		public static void main(String[] args) {
		TaskManager manager = new TaskManager();
		manager.addTask("Complete the report");
		manager.addTask("Call Mike");
		manager.completeTask("Call Mike");
		
		
		manager.printTasks();
		}
		}

}
