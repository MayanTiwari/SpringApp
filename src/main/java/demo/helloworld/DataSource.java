package demo.helloworld;

public class DataSource {

	@Override
	public String toString() {
		return "DataSource [dbpassword=" + dbpassword + ", database=" + database + ", dbuser=" + dbuser + "]";
	}
	private String dbpassword;
	private String database;
	private String dbuser;
	
	public void setDbpassword(String dbpassword) {
		this.dbpassword = dbpassword;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}
	
}
