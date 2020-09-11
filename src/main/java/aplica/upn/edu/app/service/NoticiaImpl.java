package aplica.upn.edu.app.service;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import aplica.upn.edu.app.dao.NoticiaDao;
import aplica.upn.edu.app.model.Noticia;

public class NoticiaImpl implements NoticiaDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource=dataSource;
	}

	@Override
	public int insertarNoticia(Noticia noticia) {
		String query = "insert into noticia(titulo,detalle,fecha,estatus)"
				+"values(?,?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] inputs = new Object[]
				{
						noticia.getTitulo(),
						noticia.getDetalle(),
						noticia.getFecha(),
						noticia.getEstatus()
				};
		
		return jdbcTemplate.update(query,inputs);
	}

}
