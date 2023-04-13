package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements ITaskService {
	
	@Autowired
	private ITaskDao taskDao;
	
	
	public void addTask(Task task) {
		taskDao.save(task);
	}
	
	/**
	 * Method to get all the task
	 * @return
	 */
	public List<Task> getTask() {
		return (List<Task>) taskDao.findAll();
	}
}
