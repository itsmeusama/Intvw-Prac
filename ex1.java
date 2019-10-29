import java.util.Scanner;

import java.util.ArrayList;

public class ex1
{
/*
	ArrayList<String> inputline = new ArrayList<>();
   	while (sc.hasNext()) {
     	inputline.add(sc.nextLine());}
   	 return lines.toArray(new String[lines.size()]);
*/
	/*	public String IsMirror()
	{
		System.out.println("Enter a Sentence: ");
                Scanner sc = new Scanner(System.in);
		String line=sc.nextLine();

	


	}			
*/
	public static void main(String args[])
	{
		System.out.println("Enter a Sentence: ");
                Scanner sc = new Scanner(System.in);
                String line=sc.nextLine();
		String test[]=line.split("");
		StringBuffer str=new StringBuffer("");

		for(int i=3; i<test.length-1; i++)
                {
                        if(test[i].equals(test[i+1]) && test[i-1].equals(test[i+2]) && test[i-2].equals(test[i+3]))
                        {
                                     
                                        //      str.append();
                                               
                                                System.out.println(test[i]+test[i+1]+test[i+2]);
                                                
                        }


	/*	for(int i=3; i<test.length-1; i++)
		{
			if(test[i].equals(test[i+1]))	
			{	
				
				if(test[i-1].equals(test[i+2]))
				{	

					if(test[i-2].equals(test[i+3]))
					{
					//	str.append();
					 	while() 
			                	{
						System.out.println(test[x]);
						}
					}

				}

			}*/
		//	else
				
		//System.out.println(test[i]+" not  equal to "+test[i+1]);
		//System.out.println("not Equal");
		}



	/*	StringBuilder ss= new StringBuilder("hola");
		String jk=sc.reverse();
		System.out.println("Hello "+ss.reverse());
	*/
	//	sc.close();
	
	}
}

