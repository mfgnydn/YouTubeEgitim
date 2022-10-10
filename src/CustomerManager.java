

public class CustomerManager {
	
	private Customer _customer;
	private Person _person;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		super();
		this._customer = customer;
		_creditManager = creditManager;
	}


	public CustomerManager(Person person) {
		super();
		this._person = person;
	}
	

	public void Save() {
		
		//System.out.println("Müşteri Kaydedildi : ");
		System.out.println("Müşteri Kaydedildi :" );
	}
	
	public void Delete() {
		
		//System.out.println("Müşteri Silindi : " + _person.FirstName);
	}
	
	public void GiveCredit() {
		
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
		
		_creditManager.Save();
	}



}
