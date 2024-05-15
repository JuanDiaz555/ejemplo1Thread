package ejemplo1_Thread;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		procesos pc1=new procesos("Proceso 1:");
		procesos pc2=new procesos("Proceso 2:");
		procesos pc3=new procesos("Proceso 3:");
		
		pc1.start();
		pc2.start();
		pc3.start();
	}

}
