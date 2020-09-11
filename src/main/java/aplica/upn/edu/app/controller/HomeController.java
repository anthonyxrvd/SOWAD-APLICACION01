package aplica.upn.edu.app.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Util.Utiles;
import aplica.upn.edu.app.model.Pelicula;

@Controller
public class HomeController {
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView irHome() {

		ModelAndView MV= new ModelAndView();

		MV.setViewName("home");
		return MV;         //Retorna el nombre del archivo jsp de la vista 
		//Por lo tanto debemos crear un archivo llamado home.jsp
	}
	
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public String buscar(@RequestParam("fecha") String fecha,Model model) {
		List<String> listaFechas=Utiles.getNextDays(4);
		List<Pelicula> peliculas =getLista();
		model.addAttribute("fechas",listaFechas);
		model.addAttribute("fechaBusqueda",fecha);
		model.addAttribute("Vpeliculas",peliculas);
		return "home";	
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		
		List<String> listaFechas = Utiles.getNextDays(4);
		List<Pelicula> peliculas=getLista();
		//peliculas.add("A");
		//peliculas.add("B");
		//peliculas.add("C");
		model.addAttribute("fechaBusqueda",dateformat.format(new Date()));
		model.addAttribute("Vpeliculas",peliculas);
		model.addAttribute("fechas",listaFechas);
		return "home";
	}
	

	private List<Pelicula>getLista(){
		SimpleDateFormat formatter =new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> lista =null;
		try {
			lista = new LinkedList<>();
			Pelicula p = new Pelicula();
			p.setId(1); p.setTitulo("ABC"); p.setClasificacion("A");
			p.setGenero("Suspenso"); p.setFechaEstreno(formatter.parse("09-09-2020"));
			p.setImagen("logo.png"); p.setEstatus("Activa");p.setDuracion(210);

			Pelicula p2 = new Pelicula();
			p2.setId(2); p2.setTitulo("QWERY"); p2.setClasificacion("A");
			p2.setGenero("Horror"); p2.setFechaEstreno(formatter.parse("12-09-2020"));
			p2.setImagen("logo.png"); p2.setEstatus("Z");p2.setDuracion(180);
			lista.add(p);
			lista.add(p2);
			return lista;
		}
		catch(Exception e){
			return null;
		}

	}

	 @RequestMapping(value="/detail/{id}/{fecha}",method=RequestMethod.GET)
    public String mostrarDetalle(Model model,@PathVariable("id")int id,@PathVariable("fecha")String fecha) {
    	String tituloPelicula = "Anabelle";
    	int duracion=136;
    	double precio =50;
    	model.addAttribute("titulo",tituloPelicula);
    	model.addAttribute("duracion",duracion);
    	model.addAttribute("precio",precio);
    	model.addAttribute("fecha",fecha);
    	return "detalle";
    }
	 
	 /*@RequestMapping(value="/noticias/noti",method=RequestMethod.GET)
		public String login() {
			
			return "noticias/formNoticia";
		}*/

}
