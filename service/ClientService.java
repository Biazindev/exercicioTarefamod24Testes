/**
 * 
 */
package br.com.tbiazin.testes.service;
import br.com.tbiazin.testes.Dao.*;

/**
 * @autor Tiago.Biazin
 */
public class ClientService {
	
	private IClienteDao ClientDao;
	
	public ClientService(IClienteDao ClientDao) {
		
		//ClientDao = new ClientDao();
		//ClientDao = new ClientDaoMock();
		this.ClientDao = ClientDao;
	}
	
		public String salvar() {
			ClientDao.salvar();
			return "Sucesso";
			
		}
		
		public String buscar() {
			ClientDao.buscar();
			return "Sucesso";
		}
		
		public String excluir() {
			ClientDao.excluir();
			return "Sucesso";
		}
		
		public String atualizar() {
			ClientDao.atualizar();
			return "Sucesso";
		}
		
		
}
