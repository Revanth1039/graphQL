package com.example.demo.controller;



import com.example.demo.service.CaseService;
import graphql.ExecutionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/case")
public class CaseController {

	private CaseService caseService;
	
	public CaseController(CaseService caseService) {
		this.caseService = caseService;
	}

	@PostMapping
	public ResponseEntity<Object> getAllCases(@RequestBody String query) {
		
		ExecutionResult result = caseService.getCases(query);
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}

//	@PostMapping("/addCase")
//	public ResponseEntity<Object> getPersonbyuserName(@RequestBody String query) {
//		ExecutionResult result = graphQL.execute(query);
//		return new ResponseEntity<Object>(result, HttpStatus.OK);
//	}
//	

}
