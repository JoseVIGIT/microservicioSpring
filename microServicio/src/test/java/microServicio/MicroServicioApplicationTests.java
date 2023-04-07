package microServicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import microServicio.Servicio.MiServicio;

@SpringBootTest
class MicroServicioApplicationTests {

	@Autowired
	MiServicio servicio;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void pruebaAPI() {
		String txtGenerado = "";
		String txtEsperado = "";
		
		txtGenerado = servicio.mostrarMd5("");
		assertEquals(txtEsperado, txtGenerado, "mostrarMD5");
		txtGenerado = servicio.mostrarMd5("CadenaTest");
		txtEsperado = "686bd6439abc7ed13382377e3f849604";
		assertEquals(txtEsperado, txtGenerado, "mostrarMD5(CadenaTest)");
	}

}
