package basicJava;

public class VariablesAndDatatype {
	
	//Variables:    
	//2 types:
	//1: Global :-
	
	// Datatype variableName = value;
	
	String stName = "Williams"; //Declared variable with value
	
	int age = 30; 
	
	char gender = 'M';
	
	double height;
	
	static float ssn;
	
	public static void tv() {
		
		String tvName = "Sony"; //Local variable.
		
		System.out.println(tvName);
		
		
		}
	
	public static void main(String[] args) {
		
		// object creation:
		// ClassName objectName = new ConstructorOfTheClass();
		//non-static
		VariablesAndDatatype obj = new VariablesAndDatatype();
		
		System.out.println(obj.age +" \n " + obj.gender + "\n" + obj.stName);
		
		//static
		VariablesAndDatatype.tv();
		VariablesAndDatatype.ssn = 111111.111111f;
		System.out.println("Students ssn number is " + VariablesAndDatatype.ssn  );
		
		//modify:
		
		obj.stName = "James";
		System.out.println(obj.stName);
		
		obj.stName = "Alex";
		System.out.println(obj.stName);
		
		obj.height = 6.5;
		System.out.println(" The Height of the student is " + obj.height);
		
		
		
		
		
	}
	

	
	

}
