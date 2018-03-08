
public interface Crud {
	
	public void add(IsCrudable object);
	
	public void update(IsCrudable object, int iD);
	
	public void remove(int iD);
	
}
