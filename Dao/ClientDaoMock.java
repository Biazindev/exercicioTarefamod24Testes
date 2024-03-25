package br.com.tbiazin.testes.Dao;

import br.com.tbiazin.testes.IClientDao;

public class ClientDaoMock implements IClienteDao, IClientDao {

	@Override
	public String salvar() {
		// TODO Auto-generated method stub
		return "Success";
	}
	
	public  String buscar() {
		return "Sucesso";
		// TODO Auto-generated method stub
		
	}
	public String excluir() {
		return "Sucesso";
		// TODO Auto-generated method stub
		
	}
	
	public String atualizar() {
		return "Sucesso";
		// TODO Auto-generated method stub
		
	}
}
