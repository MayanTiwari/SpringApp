package demo.helloworld;

public class Car {

	private String Name;

	@Override
	public String toString() {
		return "Car [Name=" + Name + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
