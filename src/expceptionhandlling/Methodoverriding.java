 package expceptionhandlling;

public class Methodoverriding {
  
	public static void main(String[] args) throws InterruptedException {
		
		 try{
		int a[]= new int [4]; a[4]=100;
		 System.out.println(a[5]);
		 Thread.sleep(1000); 
		
		 }
		 catch(InterruptedException e)
		 {
			 System.out.println("after the try block");
			 //e.printStackTrace();
			 //e.getMessage();
			 
		 }
		 finally{
			 System.out.println("after catch block");
		 }
	
	
	   //try
	   //{
	    Thread.sleep(1000);
	   //}
	   //finally{
		   
	   //}
	    Thread.sleep(1000);

	}
}

