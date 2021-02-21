package com.project.jpa.mysql.SpringBoot.JPA.Mysql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpa.mysql.SpringBoot.JPA.Mysql.Model.Cliente;
import com.project.jpa.mysql.SpringBoot.JPA.Mysql.Repository.Clientes;


@RestController
@RequestMapping("api/JPA/Mysql/clientes")
public class ClientesController {
	
	@Autowired
	private Clientes clientes;
	
	@GetMapping
	public List<Cliente> listar(){
		System.out.println("Quantidade de Registros de Clientes : " + clientes.count());
		return (clientes.findAll());
	}
}