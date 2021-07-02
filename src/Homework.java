
public class Homework {
	int i=1;
	
	public static void main(String[]args) {
		Homework h=new Homework();
		System.out.println(" assending order using for loop");
		h.assending();
		System.out.println(" decending order using for loop");
		h.decending();
		System.out.println(" odd numbers using for loop");
		odd();
		System.out.println(" even numbers using for loop");
		even();
		System.out.println("1 to 1000 numbers using while loop");
		numbers();
		
	}
     void assending() {
    	 Homework h=new Homework();
	    for(int i=1; i<=100; i++) {
	     System.out.println(h.i);
	 }
	 
	 }
    void decending() {
	   for( int i=100;i>=1;i--) {
		   System.out.println(i);
    }
   }
   static void odd() {
	   for(int i=1;i<=100;i++)
	   {
		   if(i%2!=0)
		   {
			   System.out.println(i);
	    }
	  }
  }
   static void even() {
	   for(int i=1;i<=100;i++)
	   {
		   if(i%2==0)
		   {
			   System.out.println(i);
			     
		    }
	   }
   } 
   static void numbers() {
	   int i=1;
	   System.out.println("output is");
	   while(i<=1000) {
	   System.out.println(i);
	   i++;
	   }
	   }
	   
	   
   }
 

