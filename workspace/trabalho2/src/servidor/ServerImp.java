package servidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Map;
import comum.Arquivo;
import comum.Cliente;
import comum.IServer;
import comum.TipoFiltro;

public class ServerImp extends UnicastRemoteObject implements IServer {

	public ServerImp() throws RemoteException {
		super();
		
	}

	@Override
	public void registrarCliente(Cliente c) throws RemoteException {
		

	}

	@Override
	public void publicarListaArquivos(Cliente c, List<Arquivo> lista) throws RemoteException {
		
	}

	@Override
	public Map<Cliente, List<Arquivo>> procurarArquivo(String query, TipoFiltro tipoFiltro, String filtro)
			throws RemoteException {
		
		return null;
	}

	@Override
	public byte[] baixarArquivo(Cliente cli, Arquivo arq) throws RemoteException {
		
		return null;
	}

	@Override
	public void desconectar(Cliente c) throws RemoteException {
	
	}
	public static void main(String[] args) throws RemoteException {
		IServer op;
		ServerImp servidor = new ServerImp();
		
		try {
			op = (IServer) UnicastRemoteObject.exportObject(servidor, 0);
			Registry reg = LocateRegistry.createRegistry(2020);
			reg.rebind(IServer.NOME_SERVICO, op);
			System.out.println("servidor ativo");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
