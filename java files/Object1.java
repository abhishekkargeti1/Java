class Mahesh 
{
	int x;  // instance(Object) member variable
	private static int y;  // instance(Object) member variable
void f1()
{
	y=5;
}
void fun1()    // instance(Object) member functions
{
	System.out.println("Fun1");
}
void fun2()
{
	System.out.println("Fun2");
}
}
class Object1
{
public static void main(String []arugs)
{
	Mahesh e1 = new Mahesh(); //object method
	e1.f1();
	System.out.println("Hello");
	
	
	
}
}