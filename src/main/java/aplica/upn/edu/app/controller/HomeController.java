package aplica.upn.edu.app.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value="/home",method=RequestMethod.GET)
    public ModelAndView irHome() {
    	
    	ModelAndView MV= new ModelAndView();
    	
    	MV.setViewName("home");
    	return MV;         //Retorna el nombre del archivo jsp de la vista 
    	                       //Por lo tanto debemos crear un archivo llamado home.jsp
    }
    
    @RequestMapping(value="/",method=RequestMethod.GET)
    public String mostrarPrincipal(Model model) {
    	List<String> peliculas = new LinkedList<>();
    	peliculas.add("A");
    	peliculas.add("B");
    	peliculas.add("C");
    	
    	model.addAttribute("Vpeliculas",peliculas);
    	return "home";
    }
    
    
    @RequestMapping(value="/detail")
    public String mostrarDetalle(Model model) {
    	String tituloPelicula = "Anabelle";
    	int duracion=136;
    	double precio =50;
    	model.addAttribute("titulo",tituloPelicula);
    	model.addAttribute("duracion",duracion);
    	model.addAttribute("precio",precio);
    	return "detalle";
    	
    }
    
}
