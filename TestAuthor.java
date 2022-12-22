package Test2;



public class TestAuthor {

	public static void main(String[] args) {
		Author a=new Author();
		System.out.println(a);
		
		Author a1=new Author("Bhavana","Madas"); 
		a1.setfirstName("Bhavana");
		a1.setlastName("Madas");
		System.out.println(a1.getfirstName());
		System.out.println(a1.getlastName());
		
		
		Author a2=new Author("Bhavana","Madas","Secret"); 
		
		System.out.println(a2.toString());
		

	}

}


//•	This time create an object with default constructor. What is your observation?
//ans.firstly we have to create author constructor then we can call it 