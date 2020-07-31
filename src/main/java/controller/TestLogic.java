package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class TestLogic {

@Autowired
public TestDao testDao = null;

@GetMapping("current_time")
public String current_time() {
	String time = null;
	time = testDao.current_time();
	return time;
}
	
	
}
