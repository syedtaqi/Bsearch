
//Author: Syed Taqi Raza
//Date : 14/03/2015
	public class Pair { 
		 public int index; 
		 public int depth; 
		 public Pair ( int x, int y ) { 
		 depth = y; 
		 index = x; 
		 } 
	

 public String toString(){
	if (index <0)
		return "Not found after " +depth+" calls to find()";
		else
			return "found after" +depth+" calls to find() "+index+ " in list";
				
 }
}