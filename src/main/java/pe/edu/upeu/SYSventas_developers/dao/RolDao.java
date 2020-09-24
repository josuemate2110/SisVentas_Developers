package pe.edu.upeu.SYSventas_developers.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.SYSventas_developers.entity.Rol;

public interface RolDao {
	
	int create(Rol r);
	int update(Rol r);
	int delete(int id);
	Rol read(int id);
	List<Map<String,Object>> readAll();

	

}
