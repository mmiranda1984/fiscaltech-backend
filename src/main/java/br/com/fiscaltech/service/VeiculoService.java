package br.com.fiscaltech.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiscaltech.exception.FiscalTechException;
import br.com.fiscaltech.model.Veiculo;
import br.com.fiscaltech.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	VeiculoRepository repository;

	public List<Veiculo> getAll() {
		return repository.findAll();
	}
	
	public Veiculo findByPlaca(String placa) {
		Veiculo veiculo = repository.findOne(placa);
		if (veiculo == null) {
			throw new FiscalTechException("not found");
		}
		return veiculo;
	}
	
	public Veiculo save(Veiculo veiculo) {
    	veiculo.setAtualizadoEm(new Date(new java.util.Date().getTime()));
    	veiculo.setAtivo(Boolean.TRUE);
    	return repository.save(veiculo);
	}
	
	public Veiculo edit(Veiculo veiculo) {
        findByPlaca(veiculo.getPlaca());
        save(veiculo);
	    return veiculo;
	}
	
	public String remove(String placa) {
		Veiculo veiculo = findByPlaca(placa);
		repository.delete(veiculo);
		return placa;
	}
}
