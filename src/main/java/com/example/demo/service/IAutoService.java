package com.example.demo.service;

import java.util.List;

import com.example.demo.repo.modelo.Auto;

public interface IAutoService {

	public Auto buscarPorPlaca(String placa);

	public List<Auto> buscarPorMarca(String marca);

	public Auto buscarPorPlacaTyped(String placa);

	public List<Auto> buscarPorMarcaTyped(String marca);

	public Auto buscarPorPlacaYMarcaTyped(String placa, String marca);

	public void insertar(Auto auto);
}
