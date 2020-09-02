package aplica.upn.edu.app.controller;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import aplica.upn.edu.app.model.Pelicula;

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
    	List<Pelicula> peliculas=getLista();
    	//peliculas.add("A");
    	//peliculas.add("B");
    	//peliculas.add("C");
    	
    	model.addAttribute("Vpeliculas",peliculas);
    	return "home";
    }
    
    private List<Pelicula>getLista(){
    	SimpleDateFormat formatter =new SimpleDateFormat("dd-MM-yyyy");
    	List<Pelicula> lista =null;
    	try {
    		lista = new LinkedList<>();
    	    Pelicula p = new Pelicula();
    	    p.setId(1); p.setTitulo("ABC"); p.setClasificacion("A");
    	    p.setGenero("Horror"); p.setFechaEstreno(formatter.parse("02-05-2018"));
            lista.add(p);
            return lista;
    	}
    	catch(Exception e){
    		return null;
    	}
    	
    }
    
    
   /* @RequestMapping(value="/detalle")
    public String mostrarDetalle(Model model) {
    	String tituloPelicula = "Anabelle";
    	int duracion=136;
    	double precio =50;
    	model.addAttribute("titulo",tituloPelicula);
    	model.addAttribute("duracion",duracion);
    	model.addAttribute("precio",precio);
    	return "detalle";
    	
    }*/
    
}
