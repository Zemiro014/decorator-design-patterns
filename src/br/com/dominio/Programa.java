package br.com.dominio;

import java.math.BigDecimal;

import br.com.dominio.model.Produto;
import br.com.dominio.service.CalculoPreco;
import br.com.dominio.service.CalculoPrecoComFrete;
import br.com.dominio.service.CalculoPrecoComum;

public class Programa {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setNome("CD Legi�o Urbana");
		produto.setQuantidade(1);
		produto.setValor(new BigDecimal("40.00"));
		
		CalculoPreco calculo = new CalculoPrecoComFrete(new CalculoPrecoComum());
		
		BigDecimal preco = calculo.valorFinal(produto);
		
		System.out.println("R$ "+preco.doubleValue());

	}

}