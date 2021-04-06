package br.com.dominio.model;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private int quantidade;
	private BigDecimal valor;
	
	public double getValorTotal(double imposto) {
		BigDecimal valorTotal = valor.add(new BigDecimal(imposto));
		valorTotal = valorTotal.multiply(new BigDecimal(quantidade));
		
		return valorTotal.doubleValue();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}
	
	
	
}
