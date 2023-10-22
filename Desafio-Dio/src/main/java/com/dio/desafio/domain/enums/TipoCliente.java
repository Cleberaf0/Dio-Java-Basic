package com.dio.desafio.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Fisica"),
	PESSOAJURIDICA(2, "Pessoa Juridica");

	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao; //nao retorna apos declarar no tipo enum
	}
	
	public static TipoCliente toEnum(Integer cod) { //converte para o enum
		if (cod == null) { //verifica se o cod e nulo
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) { //faz uma busca entre os objetos x a os valores do tipo cliente
			if(cod.equals(x.getCod())){ //se o codigo retorna igual a valor de cod retorna o valor de cod como x 
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}
