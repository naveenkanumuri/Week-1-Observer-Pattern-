

public class TestObserver {

	public static void main(String[] args) throws InterruptedException {

		
		PhoneUsers c1 = new PhoneUsers();
		c1.setCustName("MI");
		PhoneUsers c2 = new PhoneUsers();
		c2.setCustName("RealMe");

		System.out.println("Android Phones list---> " + c1.getCustName() + "," + c2.getCustName());

		Android phone = new Android();
		phone.setUpdateAvailble(false);
		phone.addUser(c1); 
		phone.addUser(c2);

		phone.setAndroidName("Android 10");
		phone.updateRegisterdCustomers(phone.isUpdateAvailble());
		System.out.println("After 5 days Android updates are available");
		Thread.sleep(6000);

		phone.setUpdateAvailble(true);

		phone.updateRegisterdCustomers(phone.isUpdateAvailble());

	}

}
