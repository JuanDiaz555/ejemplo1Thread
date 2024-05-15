package ejemplo1_Thread;

public class procesos extends Thread {

	public procesos(String nameProces) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void listValues() {
		for(int i=0;i<5;i++) {
			System.out.println(getName()+": "+i);
		}
	}
	public void run() {
		listValues();
	}
}
