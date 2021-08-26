package mx.tecnm.piedad.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import mx.tecnm.piedad.modelos.Plan;

@Repository
public class PlanJDBC {
	
	@Autowired
	JdbcTemplate conexion;
	
	public List<Plan> consultarPlanes(){
		String sql = "SELECT * FROM planes";
		return conexion.query(sql, new PlanRM());
	}

}
