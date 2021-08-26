package mx.tecnm.piedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.tecnm.piedad.modelos.Plan;

public class PlanRM implements RowMapper<Plan> {

	@Override
	public Plan mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plan plan = new Plan();
		plan.setId(rs.getInt("id"));
		plan.setDescripcion(rs.getString("descripcion"));
		plan.setPrecio_mensual(rs.getFloat("precio_mensual"));
		plan.setCalidad_video(rs.getString("calidad_video"));
		plan.setResolucion(rs.getString("resolucion"));
		plan.setCantidad_dispositivos(rs.getInt("cantidad_dispositivos"));
		return plan;
	}

}
