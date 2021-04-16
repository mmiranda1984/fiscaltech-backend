package br.com.fiscaltech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiscaltech.model.Cor;
import br.com.fiscaltech.service.CorService;

@RestController
@RequestMapping("/cores")
public class CorController {

	@Autowired
    private CorService service;

    @GetMapping
	public List<Cor> getAll(){
    	return service.getAll();
	}

    @GetMapping("/{id}")
    public Cor findById(@PathVariable Long id) {
        return service.findById(id);
    }

}
