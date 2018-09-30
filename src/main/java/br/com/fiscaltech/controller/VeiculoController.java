package br.com.fiscaltech.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiscaltech.model.Veiculo;
import br.com.fiscaltech.repository.VeiculoRepository;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @RequestMapping(method=RequestMethod.GET, value="/listar")
    public List<Veiculo> listar() {
        return veiculoRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/gravar")
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
    	veiculo.setAtualizadoEm(new Date(new java.util.Date().getTime()));
    	veiculo.setAtivo(Boolean.TRUE);
    	veiculoRepository.save(veiculo);
        return veiculo;
    }

    @RequestMapping(method=RequestMethod.GET, value="/obter/{placa}")
    public Veiculo obterVeiculoPorPlaca(@PathVariable String placa) {
        return veiculoRepository.findByPlaca(placa);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/editar/{placa}")
    public Veiculo editar(@PathVariable String placa, @RequestBody Veiculo veiculo) {
        Veiculo entidade = veiculoRepository.findByPlaca(placa);
        if (entidade != null) {
        	entidade.setAnoModelo(veiculo.getAnoModelo());
        	entidade.setAnoFabricacao(veiculo.getAnoFabricacao());
        	entidade.setAtualizadoEm(new Date(new java.util.Date().getTime()));
        	entidade.setCor(veiculo.getCor());
        	veiculoRepository.save(entidade);
	        return entidade;
        } else {
        	return null;
        }
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/excluir/{placa}")
    public String excluir(@PathVariable String placa) {
        Veiculo entidade = veiculoRepository.findByPlaca(placa);
        if (entidade != null) {
        	entidade.setAtivo(Boolean.FALSE);
        	veiculoRepository.save(entidade);
        }
        return null;
    }    
    
}
