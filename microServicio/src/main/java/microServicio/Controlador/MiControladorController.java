package microServicio.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import microServicio.Servicio.MiServicio;

@RestController
//@RequestMapping("/md5")
public class MiControladorController {

	@Autowired
	MiServicio miServicio;
	
	@Operation(summary = "Mostrar", description = "MD5 vacio", tags = { "MD5" })
	@GetMapping("mostrar/")	
	public String genera () {
		return miServicio.mostrarMd5("");
	}
	
	@Operation(summary = "Mostrar", description = "MD5 de ID indicado", tags = { "MD5" })
	@GetMapping("mostrar/{id}")	
	public String generaMD5 (@PathVariable String id) {
		return miServicio.mostrarMd5(id);
	}
}
