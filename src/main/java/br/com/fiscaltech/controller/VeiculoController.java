package br.com.fiscaltech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiscaltech.model.Veiculo;
import br.com.fiscaltech.service.VeiculoService;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping
    public List<Veiculo> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Veiculo save(@RequestBody Veiculo veiculo) {
    	return service.save(veiculo);
    }

    @GetMapping("/{placa}")
    public Veiculo findByPlaca(@PathVariable String placa) {
        return service.findByPlaca(placa);
    }

    @PutMapping
    public Veiculo edit(@RequestBody Veiculo veiculo) {
    	return service.edit(veiculo);
    }

    @DeleteMapping(value = "/{placa}")
    public String delete(@PathVariable String placa) {
    	return service.remove(placa);
    }    
    
}
