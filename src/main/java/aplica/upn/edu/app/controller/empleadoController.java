package aplica.upn.edu.app.controller;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import aplica.upn.edu.app.model.Empleado;
@Controller
public class empleadoController {
	@RequestMapping(value="/empleados",method=RequestMethod.GET)
	public ModelAndView irHome() {

		ModelAndView MV= new ModelAndView();

		MV.setViewName("empleados");
		return MV;         //Retorna el nombre del archivo jsp de la vista 
		//Por lo tanto debemos crear un archivo llamado home.jsp
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		List<Empleado> empleados=getLista();
		//peliculas.add("A");
		//peliculas.add("B");
		//peliculas.add("C");

		model.addAttribute("Vempleados",empleados);
		return "empleados";
	}

	private List<Empleado>getLista(){
		SimpleDateFormat formatter =new SimpleDateFormat("dd-MM-yyyy");
		List<Empleado> lista =null;
		try {
			lista = new LinkedList<>();
			Empleado e = new Empleado();
			e.setId(1); e.setNombre("Anthony"); e.setApellido("Castañeda");
			e.setCargo("programador"); e.setFechaInicio(formatter.parse("02-05-2018"));
			e.setFechaFin(formatter.parse("02-05-2018"));
			e.setEstado("Activo");e.setTelefono(123); 
			e.setImagen("empleado.png");
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
