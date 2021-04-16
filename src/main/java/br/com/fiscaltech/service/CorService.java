package br.com.fiscaltech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiscaltech.exception.FiscalTechException;
import br.com.fiscaltech.model.Cor;
import br.com.fiscaltech.repository.CorRepository;

@Service
public class CorService {

	@Autowired
	CorRepository repository;
	
	public List<Cor> getAll() {
		return repository.findAll();
	}

	public Cor findById(Long id) {
		Cor cor = repository.findOne(id);
		if (cor == null) {
			throw new FiscalTechException("not found");
		}
		return cor;
	}
}
