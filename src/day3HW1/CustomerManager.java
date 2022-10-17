package day3HW1;

public class CustomerManager {
	
	private Customer _customer;
	private CreditManager _creditManager;
	
	public CustomerManager(Customer customer,CreditManager creditManager) {
		 _customer = customer;
		 _creditManager=creditManager;
	}
	
	public void Save() {
		System.out.println("M��teri kaydedildi: "+ _customer.getId() );
	}
	public void Delete() {
		System.out.println("M��teri silindi: "+ _customer.getId() );
	}
	
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi.");
	}
}
