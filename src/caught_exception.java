
public class caught_exception {


	public static void main(String[] args) throws InterruptedException  {
		
		
		
		int i[] = new int[4];
		
		i[4] = 100;
		System.out.println("i is"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		
	}

}
