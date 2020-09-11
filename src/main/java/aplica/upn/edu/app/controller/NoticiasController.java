package aplica.upn.edu.app.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aplica.upn.edu.app.dao.NoticiaDao;
import aplica.upn.edu.app.model.Noticia;

@Controller
@RequestMapping("/noticias")
public class NoticiasController {
	@Autowired
	private NoticiaDao noticiaDao;
	
	@GetMapping(value="/create")
	public String crear() {
		return "noticias/formNoticia";
	}
	@PostMapping(value="/save")
	public String saveNoticia(Noticia noticia,
			@RequestParam("titulo") String titulo,
			@RequestParam("detalle") String detalle) {
		try {
		Noticia not = new Noticia();
		not.setTitulo(titulo);
		not.setDetalle(detalle);
		not.setFecha(new Date());
		not.setEstatus("Activo");
		noticiaDao.insertarNoticia(not);
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		return "noticias/formNoticia";
	}

}
