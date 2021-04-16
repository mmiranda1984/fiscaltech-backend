package br.com.fiscaltech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiscaltech.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, String> {

}
