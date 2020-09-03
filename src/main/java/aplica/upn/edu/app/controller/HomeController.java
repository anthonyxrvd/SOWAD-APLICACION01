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
			p.setImagen("logo.png"); p.setEstatus("Activa");p.setDuracion(180);

			Pelicula p2 = new Pelicula();
			p2.setId(2); p2.setTitulo("QWERY"); p2.setClasificacion("A");
			p2.setGenero("Horror"); p2.setFechaEstreno(formatter.parse("02-05-2020"));
			p2.setImagen("cinema.png"); p2.setEstatus("A");p2.setDuracion(180);
			lista.add(p);
			lista.add(p2);
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
