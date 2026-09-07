package indhirakumar;

public class ClassObjects {
	String myname=null;
	int a;
	 
	void setmyname(String myname){
		this.myname=myname;
		System.out.println(myname);
	}
	void setno(int a) {
		this.a=a;
		System.out.println(a);
	}
	public static void main(String[] args) {
		ClassObjects obj=new ClassObjects();
		obj.setmyname("ik");
		System.out.println(obj.myname);
		obj.setno(8);
		System.out.println(obj.a);
	}

}