package com.example.demo;

import java.util.List;

public interface ITaskService {
	
	public void addTask(Task task);

	public List<Task> getTask();
	
}
