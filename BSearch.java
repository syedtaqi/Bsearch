
//Author: Syed Taqi Raza
//Date: 14/03/2015

import java.util.ArrayList;

public class BSearch {

	protected ArrayList<Integer> list;  
	
	public BSearch(){
		list = new ArrayList<Integer>();
	}

	public Pair find(Integer target, int lowIndex,int highIndex)
	{
		Pair some1 = null;
		System.out.println(lowIndex+ " "+highIndex);
		if(highIndex-lowIndex>1){   
		int midInd = (lowIndex+highIndex)/2;    //initializing midpoint of the array list
		
		if (target == list.get(lowIndex).intValue())   //when target is low index
			return new Pair(lowIndex,1);
		
		else if (target== list.get(highIndex).intValue())   //when target is highindex
			return new Pair(highIndex,1);
		else if (target == list.get(midInd).intValue())
			return new Pair(midInd,1);

		else if (target < list.get(midInd).intValue())  //first half of the list
		{	some1 = find(target,lowIndex, midInd);
			some1.depth++; 
			return some1;
		}
		else if (target > list.get(midInd).intValue()) // Last half of the list
		{
			some1 = find(target,midInd,highIndex);
			some1.depth++;
			return some1;
			
		}
	}
		return new Pair (-1,1);    	//when it fails to find it returns -1
	}
	// @params test suite with fibonacci sequence numbers
	public static void main(String[]args){
		int ld;
		int end1 = 0;
		int end2 = 1;
		int fibon = 0;
		BSearch fibonacci = new BSearch();
		for (ld=0; ld <41 ; ld++){    //add first 41 fibonacci sequence numbers to array list
			fibonacci.list.add(fibon);
			//System.out.println(ld+" "+fibon);
			fibon = end1 + end2;  
			end2 = end1;
			end1 = fibon; 
			
		}
		System.out.println("done"+ld+" times");
		ld --;
		//Printing the testing information of fibonacci numbers according to assignment
		System.out.println("Searching for 0: " +fibonacci.find(0,0,ld));
		System.out.println("Searching for 1: " +fibonacci.find(1,0,ld));
		System.out.println("Searching for 2: " +fibonacci.find(2,0,ld));
		System.out.println("Searching for 4: " +fibonacci.find(4,0,ld));
		System.out.println("Searching for 102334155: " +fibonacci.find(102334155,0,ld));
		System.out.println("Searching for 63245986: " +fibonacci.find(63245986,0,ld));
		System.out.println("Searching for 165580141: " +fibonacci.find(165580141,0,ld));
		System.out.println("Searching for 1596: " +fibonacci.find(1596,0,ld));
		System.out.println("Searching for 2584: " +fibonacci.find(2584,0,ld));
		System.out.println("Searching for 6754: " +fibonacci.find(6754,0,ld));
		System.out.println("Searching for 4181: " +fibonacci.find(4181,0,ld));
		System.out.println("Searching for 10946: " +fibonacci.find(10946,0,ld));
		System.out.println("Searching for 10945: " +fibonacci.find(10945,0,ld));
		System.out.println("Searching for 6765: " +fibonacci.find(6765,0,ld));

	}
}
