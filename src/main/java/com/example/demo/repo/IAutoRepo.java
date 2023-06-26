package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Auto;

public interface IAutoRepo {

	public Auto encontrarPorPlaca(String placa);
	public List<Auto> encontarPorMarca(String marca);
	public Auto encontrarPorPlacaTyped(String placa);
	public List<Auto> encontarPorMarcaTyped(String marca);
	
	public Auto encontrarPorPlacaYMarcaTyped(String placa,String marca);
	
	public void agregar(Auto auto);
	
}
