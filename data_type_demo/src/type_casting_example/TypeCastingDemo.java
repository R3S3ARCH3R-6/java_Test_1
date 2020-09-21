package type_casting_example;

public class TypeCastingDemo {

	public static void main(String[] args) {
		/*
		 * TypeCasting
		 * Conversion of 1 data type to another is known as typecasting
		 * 
		 * 1) implicit casting(taken care by compiler itself) - when we assign smaller data types to larger data types
		 * compiler does this implicitly
		 * Please not that all the number fam (int, short, long, and byte) are considered as smaller than float and double
		 * 
		 * 2) Explicit Casting (programmer should do it ) - when we convert larger types into smaller ones (done in C too)
		 * data type is called explicit casting
		 * 
		 * */
		
		//implicit ex:
		int x = 1000;	//4 bytes
		double d1 = x;	//this can only be done in Java, not any of the C languages?
			//double is 8 bytes (larger than int)
		System.out.println("Value of d1 = " + d1);
		
		float f1 = x; //float is 4 bytes, still it is considered larger than int & long, so this is done implicitly
		System.out.println("value of f1 = " + f1);
		
		char c = 'A'; //char is 2 bytes
		int y = c;	//chars can be turned into ints b/c of the A
		System.out.println("value of y " + y);	//this will print the ASCII code of char 'A' ('A' = 65)
		
		y = 100;	//4 bytes
		//we will convert this to a char
		//c=y;	//compiler doesn't like this
		//correct change
		c = (char)y;	//4bytes to 2 bytes <-- explicit casting done by programmer (this is in C++ and C# too if I am not mistaken)
			//this results in the char 'd'
		System.out.println("value of c after explicit casting is: " + c);
		
		float f = 99.88f;
		int z= (int)f; //this results in 99 
			//we're truncating the decimal
		System.out.println("value of z is " + z); //this results in 99
		
		int a = 99;
		long p = a;
		System.out.println("value of p is " + p);
		int q = (int)p;
		System.out.println("value of q is " + q);
	
		//WORA - Write Once Run Anywhere
		//i can run the same code anywhere
		//garbage collector takes care of everything
		//compiler/Java compiler
		//Java interpreter compiles code after "main"
		//Android uses Java?
		//fastest compiler
		//JIT - just-in-time compiler is in Java
		//Java ...
		//Java is an OOP lang (strong OOP lang)
		//learn more about OOP later in class
		//by default, app is secured when we ...
		//whatever the dev needs to compile code, we get it through the JDK (JAva dev kit)
			//ex: classes being used or primitives used
		//Java has many solutions to dev issues
		//many have been done in a dev kit by Java
		//JRE - Java Runtime Environment
		//JRE has java interpreter
		//JDK has Java compiler
		//to run Java prog on any OS, (and every OS has its own way of running things)
		//JVM - Java Virtual Machine enables us to run Java on any OS
		//virtualization - create virtual mem/environment by OS
		//JVM helps create the same environment everywhere, making it platform indep, stabley
		//Java is dev friendly, secure, largest in prog (for more than 20 yrs), portable
		//3 bil devices run on Java
		//ex: 3 bil developers in the Java dev field 
		//bottom-to-top approach
		//C/C++ ==> we must declare everything on the top before you instantiate/declare/use them
		//in Java, we can declare a var wherever and access wherever
		//Java API has multithreading (parallel programming)
		//Eclipse is a multi-threaded application
		//compiler keeps going on the background and helps give us suggestions when we are prog in it
		//this helps make user/dev experience better
		//tells us what we're doing wrong too
		//2 or more tasks getting exec parallely in the IDE
		//the helps speed-up performance too
	}

}
