package demo.helloworld;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

	private Car theCar;
	private Hostel hostel;
	Person person;
	private Company company;
	private ClientService clientService;
	
	  
	
	@Autowired
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	@Autowired
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public Hostel getHostel() {
		return hostel;
	}

	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}

	public HelloWorld(Car car) {
		theCar = car;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void sayHello() {
		System.out.println("Hello");
		System.out.println(person);
		System.out.println(theCar);
		System.out.println(hostel);
		System.out.println(company);
		System.out.println(clientService);
	}
}
