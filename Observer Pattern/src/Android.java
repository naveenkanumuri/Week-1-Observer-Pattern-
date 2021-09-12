

import java.util.ArrayList;
import java.util.List;

public class Android implements Subject{

	
	private String androidName;
	
	private List<AndroidStatusObserver> users = new ArrayList<AndroidStatusObserver>();
	
	private boolean UpdateAvailble = false;
	
	@Override
	public void notifyAllObservers() {
		 System.out.println("Android will notify all Andriod Phone users when updates are available. ");
		 for(AndroidStatusObserver user:users){
			 user.update(androidName);
		 }
		
	}
 
	 

	 

	public void updateRegisterdCustomers(boolean isUpdateAvailble) {
		 
		if(isUpdateAvailble){
			notifyAllObservers();
			
		}else{
			System.out.println("No Updates");
		}
		
		
	}

	@Override
	public void addUser(AndroidStatusObserver observer) {
		this.users.add(observer);
		
	}

	@Override
	public void removeUser(AndroidStatusObserver observer) {
		this.users.remove(observer);
		
	}

	public boolean isUpdateAvailble() {
		return UpdateAvailble;
	}

	public void setUpdateAvailble(boolean updateAvailble) {
		UpdateAvailble = updateAvailble;
	}



	public String getAndroidName() {
		return androidName;
	}



	public void setAndroidName(String androidName) {
		this.androidName = androidName;
	}

	
	
}
