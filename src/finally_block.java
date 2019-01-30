
public class finally_block {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		
		
		
		
		try{
			
			//DB Connection - successfully
			// executing some queries
			// validating the data and comparing from websites
			// Closing connectoin
		//	int i[] = new int[4];
			
			//i[5] = 100;
		//	System.out.println("Close dbconnection in try block");
				
			
		}catch(Throwable t){
			
			System.out.println("Error occurred");
			
		}finally{
			
			System.out.println("Closing the DB Connection in finally block");
			
		}
		

	}

}
