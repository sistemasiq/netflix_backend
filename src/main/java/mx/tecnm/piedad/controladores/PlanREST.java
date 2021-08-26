package mx.tecnm.piedad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tecnm.piedad.dao.PlanJDBC;
import mx.tecnm.piedad.modelos.Plan;

@RestController
@RequestMapping("/planes")
public class PlanREST {
	
	@Autowired
	PlanJDBC planJDBC;
	
	@GetMapping
	public ResponseEntity<?> obtenerPlanes(){
		List<Plan> resultado = planJDBC.consultarPlanes();
		return new ResponseEntity<List<Plan>>(resultado, HttpStatus.OK);
	}

}
