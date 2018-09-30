package br.com.fiscaltech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiscaltech.model.Cor;
import br.com.fiscaltech.repository.CorRepository;

@RestController
@RequestMapping("/cores")
public class CorController {

    @Autowired
    private CorRepository corRepository;

    @RequestMapping(method=RequestMethod.GET, value="/listar")
	public List<Cor> listar(){
    	return corRepository.findAll();
	}

    @RequestMapping(method=RequestMethod.GET, value="/obter/{id}")
    public Cor obterCorPorId(@PathVariable Integer id) {
        return corRepository.findByIdcor(id);
    }

}
