package com.projeto.syscomn.domain;

import java.time.LocalDate;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.syscomn.interfaces.CnpjGroup;
import com.projeto.syscomn.interfaces.CpfGroup;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Administrador extends Pessoa{
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dtaAdmissao;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dtaDemissao;
	
	private String status;

	public Administrador() {
		super();
	}

	public Administrador(Integer idPessoa, String nomePessoa,
			@CPF(groups = CpfGroup.class) @CNPJ(groups = CnpjGroup.class) String cpfCnpjPessoa, String telefonePessoa,
			String emailPessoa, LocalDate dtaNascimentoPessoa, String enderecoPessoa, String statusPessoa,
			String rgPessoa, String observacaoPessoa, String login, String senha, Integer tipoPessoa,
			Assinante assinante) {
		super(idPessoa, nomePessoa, cpfCnpjPessoa, telefonePessoa, emailPessoa, dtaNascimentoPessoa, enderecoPessoa,
				statusPessoa, rgPessoa, observacaoPessoa, login, senha, tipoPessoa, assinante);
	}
		
}
