package day12;

public class Constructor {
int i=100;
String j;
	public Constructor() {
		
		this(12,"j");
		
		System.out.println("im default");
	}
	private Constructor(int i,String j){
	
		this.i=i;
		this.j=j;
		System.out.println("i'm parameterized");
	}

	void display(){
		System.out.println(i+" "+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor con=new Constructor();
con.display();
	}

}
