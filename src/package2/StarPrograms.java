package package2;

public class StarPrograms
{
	public static void main(String[] args) {
		
	
	//Star(*) program using  Nested For loop
	
//	1)
		
//	for(int i=1; i<=5; i++)
//	{
//		
//		
//		for(int j=1; j<=5; j++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
		//System.out.println("end of program");
//		out put
//		*****
//		*****
//		*****
//		*****
//		*****
		
//    2)
		
//		for(int i=1; i<=5; i++)
//		{
//			
//			
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		//System.out.println("end of program");
		//output-
//		*
//		**
//		***
//		****
//		*****
//	
//		3)
//		for(int i=1; i<=5; i++)
//			{
//				
//				
//				for(int j=5; j>=i; j--)
//				{
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//			System.out.println("end of program");
			
	  //output
//			* * * * * 
//			* * * * 
//			* * * 
//			* * 
//			* 
		
		
		//4)

//		for(int i=1; i<=5; i++)
//			{
//				
//				
//				for(int j=1; j<=i; j++)
//				{
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//			//System.out.println("end of program");
//		
//		for(int i=1; i<=5; i++)
//			{
//				
//				
//				for(int j=4; j>=i; j--)
//				{
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//			System.out.println("end of program");
		
		//output
//			* 
//			* * 
//			* * * 
//			* * * * 
//			* * * * * 
//			* * * * 
//			* * * 
//			* * 
//			* 
//
//			end of program

		//5)
		
//		for(int i=1; i<=5; i++)
//			{
//				
//				
//				for(int j=5; j>=i; j--)
//				{
//					System.out.print(" ");
//				}
//				for(int h=1;h<=i;h++)
//				{
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//				
		
		//output
		
//	      * 
//	     * * 
//	    * * * 
//	   * * * * 
//	  * * * * * 

		
		//6)
//        for(int i=1; i<=5; i++)
//		{
//			
//			
//			for(int j=5; j>=i; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int h=1;h<=i;h++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//			for(int j=5; j>=i; j--)
//			{
//				System.out.print("");
//			}
//			System.out.println();
//			
//		}
	
		
		//output--
//         * 
//
//        * * 
//
//       * * * 
//
//      * * * * 
//
//     * * * * * 
}
}