
public class Company extends Customer {
	
	public String CompanyName;
	public String TaxNumber;
	
	public Company() {
		
	}
	
	public Company(int id, String city, String companyName, String taxNumber) {
		super();
		CompanyName = companyName;
		TaxNumber = taxNumber;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getTaxNumber() {
		return TaxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}
	
	
	


}
