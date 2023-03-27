package day6;
//in case of foreach loop we donot need to initialize test condition and do increment

//in every iteration on line 13  p array values will be stored in k one by one 
public class ForeachExample {

	public static void main(String[] args) {

     
		
		 float p[]= {23.2f,23,45,56,67.2f};
	     
	     for( float k: p )	 System.out.print ("   "+ k);

	     System.out.println();
	     

     String m[]= {"neha","ashu","gagan"};
     
     for(String n:m)   	 System.out.print (" "+ n);
     
     
	}

}
