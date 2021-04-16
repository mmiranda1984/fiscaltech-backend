package br.com.fiscaltech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="cad_cor")
public class Cor implements Serializable {

	private static final long serialVersionUID = -1479808222790201274L;

	@Id
	@NotNull
	@Column(name="id")
	private Long id;
	
	@Column(name="descricao")
	private String descricao;
	
}
