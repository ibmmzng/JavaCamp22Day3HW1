package day3HW1;

public abstract class BaseCreditManager implements CreditManager {
	
	public abstract void Calculate(); // Abstract(Tamamlanmamış seçeneği sunuyor.) 
	
	public  void Save() {
		System.out.println("Kaydedildi.");
		
	}

}
