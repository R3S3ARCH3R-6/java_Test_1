package example1;

public class Demo1 {

	public static void main(String[] args) {
		
		/* Intro Notes:
		 *  all src code is written in a .java file
		 *  
		 *  this will generate an executable file in the java compiler
		 *  
		 *  .class file is typically called as a ...
		 *  
		 *  ...
		 *  
		 *  java interpreter does line-by-line exec starting with file nam,e?
		 *  
		 *  ...
		 *  
		 *  java comes with package sys
		 *  
		 *  we can make packages for certain files/classes
		 *  all validation code can be made here as a result
		 *  
		 *  ...
		 *  
		 *  we always separate our code into smaller units so it is understandable
		 *  
		 *  no garbage values/auto garbage collection
		 *  we don't need to add anything to clean mem, unlike C
		 */
		
		/*
		 * data type - where you are asking java to allocate
		 * 
		 *  Java provides 8 primitive data types with default values to it
		 *  
		 *  dataType               size         defaultValue
		 *  -------------------------------------------------
		 *  byte                   1 byte           0
		 *  short                  2 bytes          0
		 *  int                    4 bytes          0
		 *  long                   8 bytes          0
		 *  
		 *  float                  4 bytes          0.0000f
		 *  double                 8 bytes          0.0000d  in Java, any decimal val is considered a double by default
		 *  
		 *  char                   2 bytes          '\u00000' (uni-code charset() supports 17 countries' languages)
		 *  boolean                1 bit            false
		 *  
		 *  there is no datatype for the date, we have a data class (not a primitive)
		 *  String is a class, not a datatype, it is an obj.
		 *  
		 *  objects point to the address of the mem. of where the data is stored
		 *  primitives holds the value within themselves
		 *
		 *  if it is written in uppercase, it is a class or an interface (Ex: String, Object)
		 */
		
		int x = 100;
		System.out.println("value of x = " + x);
		
		float f1 = 12.344f;	//floats help save mem. size
			//floats are smaller than doubles
			//can only have a certain range of decimal points
		System.out.println("value of f1 = " + f1);

		double d1 = 889.99;
		System.out.println("value of d1 = " + d1);
		
		String s = "Vinay";	//this is an obj
		System.out.println("Helloooo " + s);
		
		char c = 'H';
		System.out.println("value of c is" + c);
		
		long l = 1234567890L;	//having an L at the end is the best practice
			//long cannot contain characters
			//L is used to determine that the number is a long
		System.out.println("Value of 1 is " + l);
		
		boolean b=true;
			//boolean ref: 0 or 1
			//we are using true or false
			//can be an expression too
		System.out.println("value of b is " + b);
		
		//syso, ctrl+space  <-- speeds up process of writing System.out.println();
		
		
	}

}
