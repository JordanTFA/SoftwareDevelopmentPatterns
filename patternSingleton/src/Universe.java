
public class Universe {
	
	private static Universe uniqueInstance;
	
	private Universe(){}
	
	public static synchronized Universe getInstance(){
		
		if(uniqueInstance == null){
			uniqueInstance = new Universe();
			System.out.println("Instance Created");
		}else{
			System.out.println("Instance already exists");
		}
		return uniqueInstance;
	}
	
}


// This ensures there is exactly ONE instance