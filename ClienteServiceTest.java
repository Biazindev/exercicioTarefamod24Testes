package br.com.tbiazin.testes;
import br.com.tbiazin.testes.Dao.IClienteDao;
import br.com.tbiazin.testes.Dao.ClientDao;
import br.com.tbiazin.testes.Dao.ClientDaoMock;
import br.com.tbiazin.testes.service.ClientService;

import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
	
	@Test
	public void salvarTeste() {
		ClientDaoMock mockDao = new ClientDaoMock();
		ClientService service = new ClientService(mockDao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test
	public void buscarTeste() {
		ClientDaoMock mockDao = new ClientDaoMock();
		ClientService service = new ClientService(mockDao);
		String retorno = service.buscar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test
	public void excluirTeste() {
		ClientDaoMock mockDao = new ClientDaoMock();
		ClientService service = new ClientService(mockDao);
		String retorno = service.excluir();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test
	public void atualizarTeste() {
		ClientDaoMock mockDao = new ClientDaoMock();
		ClientService service = new ClientService(mockDao);
		String retorno = service.atualizar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroSalvarTeste() {
	    IClienteDao dao = new ClientDao();
	    ClientService service = new ClientService(dao);
	    service.salvar();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroBuscarTeste() {
	    IClienteDao dao = new ClientDao();
	    ClientService service = new ClientService(dao);
	    service.buscar();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroExcluirTeste() {
	    IClienteDao dao = new ClientDao();
	    ClientService service = new ClientService(dao);
	    service.excluir();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroAtualizarTeste() {
	    IClienteDao dao = new ClientDao();
	    ClientService service = new ClientService(dao);
	    service.atualizar();
	}

}
