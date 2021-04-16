package br.com.fiscaltech.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="cad_veiculo")
public class Veiculo implements Serializable {

	private static final long serialVersionUID = -5183624245863311120L;

	@Id
	@NotNull
	@Column(name="placa")
	private String placa;
	
	@Column(name="ano_modelo")
	private Integer anoModelo;
	
	@Column(name="ano_fabricacao")
	private Integer anoFabricacao;
	
	@Column(name="atualizado_em")
	private Date atualizadoEm;
	
	@Column(name="ativo")
	private Boolean ativo;
	
	@OneToOne
	@JoinColumn(name="id_cor")
	private Cor cor;

}
