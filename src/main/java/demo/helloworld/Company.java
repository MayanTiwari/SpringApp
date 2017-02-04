package demo.helloworld;

public class Company {

	private String companyName;

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	} 
}
