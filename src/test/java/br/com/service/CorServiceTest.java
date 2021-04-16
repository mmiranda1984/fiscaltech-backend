package br.com.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.fiscaltech.Application;
import br.com.fiscaltech.exception.FiscalTechException;
import br.com.fiscaltech.model.Cor;
import br.com.fiscaltech.service.CorService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class CorServiceTest {
	
	final static int totalRegistrosPreInseridos = 4;
	
	@Autowired
	CorService corService;

	@Test
	public void deveValidarTotalRegistrosPreInseridos() {
		List<Cor> listaCores = corService.getAll();
		assertEquals(totalRegistrosPreInseridos, listaCores.size());
	}

	@Test
	public void deveConseguirObterDadosDeUmaCorPreInserida() {
		Cor cor = corService.findById(1L);
		assertEquals(1L, cor.getId().longValue());
		assertEquals("AZUL", cor.getDescricao().toUpperCase());
	}

	@Test(expected = FiscalTechException.class)
	public void deveRetornarExcecaoParaUmaCorNaoExistente() {
		corService.findById(-1L);
	}
	
}
