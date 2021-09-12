

public interface Subject {

	public void addUser(AndroidStatusObserver observer);

	public void removeUser(AndroidStatusObserver observer);

	public void notifyAllObservers();

}
