package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.unju.fi.model.Alumno;

@Controller
public class IndexController {
@GetMapping("/inicio")
public Model getIndexPage(Model model) {
	Alumno unAlumno = new Alumno("carlos", "gutierrez", "carlos-guti.com");
		return "Index";
	}
		
	
}
