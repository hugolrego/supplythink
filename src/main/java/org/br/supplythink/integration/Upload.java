package org.br.supplythink.integration;

import java.util.Date;

public class Upload {

	private Date data; 
	private int produto;
	private double produtoMedia;
	private double produtoRecebido;
	
	private int localEstoque;
	private double localEstoqueMedia;
	private double localEstoqueRecebido;

	private int movimEstoque;
	private double movimEstoqueMedia;
	private double movimEstoqueRecebido;

	private int movimVenda;
	private double movimVendaMedia;
	private double movimVendaRecebido;
	
	public Upload( Date data){
		this.data = data; 

		this.produtoMedia = randon();
		this.produtoRecebido = randon();
		if(produtoRecebido >produtoMedia){
			this.produto = 1;	
		}else{
			this.produto = 0;
		}
		
		this.localEstoqueMedia = randon();
		this.localEstoqueRecebido = randon();
		if(localEstoqueRecebido >localEstoqueMedia){
			this.localEstoque = 1;	
		}else{
			this.localEstoque = 0;
		}
		
		this.movimEstoqueMedia = randon();
		this.movimEstoqueRecebido = randon();
		if(movimEstoqueRecebido >movimEstoqueMedia){
			this.movimEstoque = 1;	
		}else{
			this.movimEstoque = 0;
		}

		this.movimVendaMedia = randon();
		this.movimVendaRecebido = randon();
		if(movimVendaRecebido >movimVendaMedia){
			this.movimVenda = 1;	
		}else{
			this.movimVenda = 0;
		}

	}
	
	private int randon(){
		return ( int ) ( 10 + Math.random() * 100 );
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

	public double getProdutoMedia() {
		return produtoMedia;
	}

	public void setProdutoMedia(double produtoMedia) {
		this.produtoMedia = produtoMedia;
	}

	public double getProdutoRecebido() {
		return produtoRecebido;
	}

	public void setProdutoRecebido(double produtoRecebdo) {
		this.produtoRecebido = produtoRecebdo;
	}
	
	public double getLocalEstoqueMedia() {
		return localEstoqueMedia;
	}

	public void setLocalEstoqueMedia(double localEstoqueMedia) {
		this.localEstoqueMedia = localEstoqueMedia;
	}

	public double getLocalEstoqueRecebido() {
		return localEstoqueRecebido;
	}

	public void setLocalEstoqueRecebido(double localEstoqueRecebido) {
		this.localEstoqueRecebido = localEstoqueRecebido;
	}

	public double getMovimEstoqueMedia() {
		return movimEstoqueMedia;
	}

	public void setMovimEstoqueMedia(double movimEstoqueMedia) {
		this.movimEstoqueMedia = movimEstoqueMedia;
	}

	public double getMovimEstoqueRecebido() {
		return movimEstoqueRecebido;
	}

	public void setMovimEstoqueRecebido(double movimEstoqueRecebido) {
		this.movimEstoqueRecebido = movimEstoqueRecebido;
	}

	public double getMovimVendaMedia() {
		return movimVendaMedia;
	}

	public void setMovimVendaMedia(double movimVendaMedia) {
		this.movimVendaMedia = movimVendaMedia;
	}

	public double getMovimVendaRecebido() {
		return movimVendaRecebido;
	}

	public void setMovimVendaRecebido(double movimVendaRecebido) {
		this.movimVendaRecebido = movimVendaRecebido;
	}
	
	
}
