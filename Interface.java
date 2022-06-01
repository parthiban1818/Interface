package oops;
 
 interface One {
	  
	 int a=10;
	void method1();
	default void defaultMethod() {
		 System.out.println("defalut meyhod in 1st interface");
	}
	static void staticMethod() {
		 two.staticMethod();
		System.out.println("static methd in 1st interface");
	}
}
 
 interface two{
	 int a=30;
	 void method1();
	 int method2();
	   default void defaultMethod2() {
		 System.out.println("default method in interface 2");
	 }
	   static void staticMethod() {
			System.out.println("static methd in 2nd interface");
		}
 }
 
  abstract class Parent implements One,two {
    // int a=20;
	   Parent() {
		  
		  
	  }
	@Override
	public int method2() {
		System.out.println("Parent class mathod 2() ");
		return 0;
	}
     public void defaultMethod() {
    	  two.super.defaultMethod2();
    	 System.out.println("parent class default method");
     }
	@Override
	public void method1() {
		
		System.out.println("Parent class mathod 1() ");
		
	}
	 
 }
public class Interface  extends Parent{

	public static void main(String[] args) { 
        // One.staticMethod();
          Interface p=new Interface();
         // p.defaultMethod();p.defaultMethod2();p.method1();p.method2();
         // System.out.println(One.a);
          p.defaultMethod();
           
	}
 
	public int method2() { 
		super.method2();
		System.out.println("interface class mathod 2() ");
		return 0;
	}
 
	public void method1() { 
		System.out.println("Interface class method 1");
	}
	 
	  
}
