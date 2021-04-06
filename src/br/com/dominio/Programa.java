package br.com.dominio;

import java.math.BigDecimal;

import br.com.dominio.model.Produto;
import br.com.dominio.service.CalculoPreco;
import br.com.dominio.service.CalculoPrecoComBrinde;
import br.com.dominio.service.CalculoPrecoComFrete;
import br.com.dominio.service.CalculoPrecoComum;

public class Programa {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setNome("CD Legião Urbana");
		produto.setQuantidade(1);
		produto.setValor(new BigDecimal("40.00"));
		
		/*
		 *  Adicionando dinâmicamente os Objectos -> a partir do preco comum, pode se adicionar frete e brind de forma dinâmica. Adicionando os objectos. 
		 *  Isso só é possívelo pois aas classes (CalculoPrecoComBrinde; CalculoPrecoComFrete e CalculoPrecoComum) são subClasses da mesma interface
		 * */ 
		CalculoPreco calculo = new CalculoPrecoComBrinde (new CalculoPrecoComFrete(new CalculoPrecoComum()));
		
		BigDecimal preco = calculo.valorFinal(produto);
		
		System.out.println("R$ "+preco.doubleValue());

	}

}
