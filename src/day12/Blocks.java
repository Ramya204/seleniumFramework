package day12;
class parent{
	parent(){
		System.out.println("i'm parent constructor");
	
	}
	{
		System.out.println("I'm initializer block inside parent class");
	}
}

public class Blocks extends parent{
static{
	System.out.println("im static");
}
{
System.out.println("I'm initializer block inside Blocks class");	
}

	public Blocks() {
		super();
		System.out.println("i'm default constructor");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blocks b=new Blocks();

	}

}
