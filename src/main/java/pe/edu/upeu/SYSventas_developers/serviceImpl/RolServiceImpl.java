package pe.edu.upeu.SYSventas_developers.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.SYSventas_developers.dao.RolDao;
import pe.edu.upeu.SYSventas_developers.entity.Rol;
import pe.edu.upeu.SYSventas_developers.service.RolService;

@Service
public class RolServiceImpl implements RolService{
	@Autowired
	private RolDao rolDao;

	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}
	

}
