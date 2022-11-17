package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.ICajasDAO;
import com.crud.api.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService{

	@Autowired
	ICajasDAO iCajasDAO;
	
	@Override
	public List<Cajas> listarCajas() {
		
		return iCajasDAO.findAll();
	}
	
	@Override
	public Cajas guardarCajas(Cajas caja) {
		
		return iCajasDAO.save(caja);
	}

	@Override
	public Cajas cajaXID(String numreferencia) {
		
		return iCajasDAO.findById(numreferencia).get();
	}

	@Override
	public Cajas actualizarCajas(Cajas caja) {
		
		return iCajasDAO.save(caja);
	}

	@Override
	public void eliminarCajas(String numreferencia) {
		
		iCajasDAO.deleteById(numreferencia);
		
	}
}
