package com.finanzas.personal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
		@GetMapping("/home")
		public String Index() {
			
			
			return "index";
		}
}
