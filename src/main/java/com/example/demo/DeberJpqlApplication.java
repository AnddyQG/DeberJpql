package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Auto;
import com.example.demo.service.IAutoService;

@SpringBootApplication
public class DeberJpqlApplication implements CommandLineRunner{
@Autowired
private IAutoService autoService;
	public static void main(String[] args) {
		SpringApplication.run(DeberJpqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * 
		Auto auto = new Auto();
		auto.setMarca("MAZDA");
		auto.setModelo("Deportivo");
		auto.setPlaca("1721");
		this.autoService.insertar(auto);
		
		Auto auto2 = new Auto();
		auto2.setMarca("MAZDA");
		auto2.setModelo("Convertible");
		auto2.setPlaca("3432");
		this.autoService.insertar(auto2);
		
		Auto auto3 = new Auto();
		auto3.setMarca("BMW");
		auto3.setModelo("Deportivo");
		auto3.setPlaca("1710");
		this.autoService.insertar(auto3);
		
		
		*/
		System.out.println("Busquedas Query");
		Auto autoQ=this.autoService.buscarPorPlaca("1721");
		System.out.println(autoQ);
		
		List<Auto>autoQ1 =this.autoService.buscarPorMarca("MAZDA");
		System.out.println(autoQ1);
		
		
		System.out.println("Busquedas por TypedQuery");
		Auto autoT=this.autoService.buscarPorPlacaTyped("3432");
		System.out.println(autoT);
		
		Auto autoT2=this.autoService.buscarPorPlacaYMarcaTyped("1710", "BMW");
		System.out.println(autoT2);
		
		List<Auto> autoT3= this.autoService.buscarPorMarcaTyped("MAZDA");
		System.out.println(autoT3);
		
	}

}
