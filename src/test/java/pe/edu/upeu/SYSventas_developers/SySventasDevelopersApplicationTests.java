package pe.edu.upeu.SYSventas_developers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.SYSventas_developers.dao.RolDao;
import pe.edu.upeu.SYSventas_developers.entity.Rol;
import pe.edu.upeu.SYSventas_developers.service.RolService;

@SpringBootTest
class SySventasDevelopersApplicationTests {
	@Autowired
	//variable declara para llamar 
	private RolService rolService;

	@Test
	void contextLoads() {
		//Prueba de metodo registrar 
		/*Rol r = new Rol();
		r.setNomrol("Administrador");
		System.out.println(rolDao.create(r));
		*/
		
		//testeo de el readAll
		System.out.println(rolService.readAll());
	}

}
