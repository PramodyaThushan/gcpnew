package com.test.gcp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.gcp.model.ResponseModel;


@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value="/hello-get",method=RequestMethod.GET)
	public ResponseEntity<?> testMethod(){
		return new ResponseEntity<Object>(new ResponseModel(200,"Test GET method",null),HttpStatus.OK);
	}
	
	@RequestMapping(value="/hello-post",method=RequestMethod.POST)
	public ResponseEntity<?> getTestMethod() {
		return new ResponseEntity<Object>(new ResponseModel(200,"Test POST method",null),HttpStatus.OK);
	}

}
