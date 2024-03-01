package com.sgm.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
@RequestMapping("Home");

public String home() {
	System.out.println("Sakshi");
}
}
