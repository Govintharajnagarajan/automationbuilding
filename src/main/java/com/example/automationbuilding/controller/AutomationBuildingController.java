package com.example.automationbuilding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationBuildingController {
	@GetMapping(value="/get")
public String getall() {
		return "hellow";
	}
}
