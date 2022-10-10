
public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager =new CustomerManager(new Customer(),new TeacherCreditManager());
		customerManager.GiveCredit();
		
		
		
		
		
		/*
		CreditManager creditManager=new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer =new Customer();
		customer.City="Giresun";
		customer.Id=1;
		
		Person person =new Person();
		person.FirstName="Furkan";
		person.Id=500;
		
		Company company =new Company();
		company.CompanyName="Arçelik";
		company.TaxNumber="10025";
		company.Id=1000;
		
		CustomerManager customerManager=new CustomerManager(customer);
		customerManager.Delete();
		customerManager.Save();
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
		customerManager2.Delete();
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		/*
		CustomerManager customerManager2=new CustomerManager();
		customerManager.Delete();
		customerManager.Save();
		*/
		
		
		
		
		
		
		
		
		

	}

}
