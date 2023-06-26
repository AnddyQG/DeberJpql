package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IAutoRepo;
import com.example.demo.repo.modelo.Auto;
@Service
public class AutoServiceImpl implements IAutoService{
@Autowired
private IAutoRepo autoRepo;
	@Override
	public Auto buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontrarPorPlaca(placa);
	}

	@Override
	public List<Auto> buscarPorMarca(String marca) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontarPorMarca(marca);
	}

	@Override
	public Auto buscarPorPlacaTyped(String placa) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontrarPorPlacaTyped(placa);
	}

	@Override
	public List<Auto> buscarPorMarcaTyped(String marca) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontarPorMarcaTyped(marca);
	}

	@Override
	public Auto buscarPorPlacaYMarcaTyped(String placa, String marca) {
		// TODO Auto-generated method stub
		return this.autoRepo.encontrarPorPlacaYMarcaTyped(placa, marca)
				;
	}

	@Override
	public void insertar(Auto auto) {
		// TODO Auto-generated method stub
		this.autoRepo.agregar(auto);
	}

}
