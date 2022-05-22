package ar.edu.unju.fi.Tp5_grupo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
@GetMapping("/inicio")
public String getIndexPage () {
	return "Index";
}
	
}
