	package br.com.tbiazin.testes;
	
	import org.junit.Assert;
	import org.junit.Test;
	
	import br.com.tbiazin.testes.Dao.ContratoDao;
	import br.com.tbiazin.testes.Dao.IContratoDao;
	import br.com.tbiazin.testes.mock.ContratoDAOMock;
	import br.com.tbiazin.testes.service.ContratoService;
	import br.com.tbiazin.testes.service.IContratoService;
	
	public class ContratoServiceTeste {
	
		@Test
		public void salvarTest() {
		    IContratoDao dao = new ContratoDAOMock(); 
		    IContratoService service = new ContratoService(dao); 
		    String retorno = service.salvar(); 
		    Assert.assertEquals("Sucesso", retorno); 
		}
		
		@Test
		public void buscarTest() {
		    IContratoDao dao = new ContratoDAOMock(); 
		    IContratoService service = new ContratoService(dao); 
		    String retorno = service.buscar(); 
		    Assert.assertEquals("Sucesso", retorno); 
		}
		
		@Test
		public void excluirTest() {
		    IContratoDao dao = new ContratoDAOMock(); 
		    IContratoService service = new ContratoService(dao); 
		    String retorno = service.excluir(); 
		    Assert.assertEquals("Sucesso", retorno); 
		}
		
		
		@Test
		public void atualizarTest() {
		    IContratoDao dao = new ContratoDAOMock(); 
		    IContratoService service = new ContratoService(dao); 
		    String retorno = service.atualizar(); 
		    Assert.assertEquals("Sucesso", retorno); 
		}
	    @Test(expected = UnsupportedOperationException.class)
	    
	    public void esperarErroNoSalvarComBancoDeDadosTeste() {
	        IContratoDao dao = new ContratoDao();
	        IContratoService service = new ContratoService(dao);
	        service.salvar();
	    }
	    
	@Test(expected = UnsupportedOperationException.class)
	    
	    public void esperarErroNoBuscarComBancoDeDadosTeste() {
	        IContratoDao dao = new ContratoDao();
	        IContratoService service = new ContratoService(dao);
	        service.buscar();
	    }
	@Test(expected = UnsupportedOperationException.class)
	
	public void esperarErroNoExcluirComBancoDeDadosTeste() {
	    IContratoDao dao = new ContratoDao();
	    IContratoService service = new ContratoService(dao);
	    service.excluir();
	}
	
@Test(expected = UnsupportedOperationException.class)
    
    public void esperarErroNoAtualizarComBancoDeDadosTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.atualizar();
    }

	
	
	}
