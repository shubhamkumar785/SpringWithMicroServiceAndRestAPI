package com.spring.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Fee-provider")
public class FeeController {
	@GetMapping("/paynow/{fee}")
	public String payFee(@PathVariable int fee) {
		return "Fee Payment For" + fee + " is Successful";
	}
}
