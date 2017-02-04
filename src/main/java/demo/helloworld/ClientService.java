package demo.helloworld;

public class ClientService {

	private static ClientService clientService = new ClientService();
	private ClientService(){}
	
	public static ClientService createInstance(){
		return clientService;
	}

	@Override
	public String toString() {
		return "ClientService []";
	}
	
}
