package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoController {
	private ProdutoDAO produtoDAO;
	
	public ProdutoController() {
		Connection con = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(con);
	}

	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
		System.out.println("Deletando produto");
	}

	public void salvar(Produto produto) {
		this.produtoDAO.salvar(produto);
		System.out.println("Salvando produto");
	}

	public List<Produto> listar() {
		return this.produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome, descricao, id);
		System.out.println("Alterando produto");
	}
}
