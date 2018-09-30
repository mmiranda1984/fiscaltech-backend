package br.com.fiscaltech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cad_cor")
public class Cor {

	@Id
	@Column(name="id_cor")
	private Integer idcor;
	@Column(name="descricao")
	private String descricao;
	
	public Integer getIdcor() {
		return idcor;
	}
	
	public void setId_cor(Integer idcor) {
		this.idcor = idcor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
