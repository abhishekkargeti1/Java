class test5
{
	public static void main(String []args)
	{
		String s1 =new String("Abhishek"); // Here two object creates one in heap and second in SCP(String Constant Pool).
						  // SCP is not eligiable for garbage collector because implicitly it is referred maintain by JVM.
						 //  In Heap s1 referred the object ("Abhishek").
						// from 1.7 and above version SCP area present in Heap only .
						// before 1.7 SCP present in method area/PermGen.   
		




		String s2 = "Abhishek"; // here only one object create in SCP .
					// in SCP s2 referred ("Abhishek").
					// from 1.7 and above version SCP area present in Heap only .
					// before 1.7 SCP present in method area/PermGen. 
	}

}