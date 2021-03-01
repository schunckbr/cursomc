package com.schunck.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schunck.cursomc.domain.Pedido;
import com.schunck.cursomc.exceptions.ObjectNotFoundException;
import com.schunck.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
		
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! + Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}
}
