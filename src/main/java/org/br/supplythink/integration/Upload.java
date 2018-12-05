package org.br.supplythink.integration;

import java.util.Date;

public class Upload {

	private Date data; 
	private int produto;
	private int localEstoque;
	private int movimEstoque;
	private int movimVenda;
	
	public Upload( Date data, int produto,int localEstoque,int movimEstoque, int movimVenda){
		this.data = data; 
		this.produto = produto;
		this.localEstoque = localEstoque;
		this.movimEstoque = movimEstoque;
		this.movimVenda = movimVenda;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	public int getProduto() {
		return produto;
	}
	public void setProduto(int produto) {
		this.produto = produto;
	}
	public int getLocalEstoque() {
		return localEstoque;
	}
	public void setLocalEstoque(int localEstoque) {
		this.localEstoque = localEstoque;
	}
	public int getMovimEstoque() {
		return movimEstoque;
	}
	public void setMovimEstoque(int movimEstoque) {
		this.movimEstoque = movimEstoque;
	}
	public int getMovimVenda() {
		return movimVenda;
	}
	public void setMovimVenda(int movimVenda) {
		this.movimVenda = movimVenda;
	}
	
	
	
}
