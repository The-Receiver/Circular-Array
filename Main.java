/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular.array;

/**
 *
 * @author eric
 */
public class Main {
	
		public static void main(String[] args){
			
			Test();
		
		}
		
		static void Test(){
		
				
			CircularArray<Character> strarray = new CircularArray(26);
			for (int i = (int) 'a'; i <= (int) 'z'; i++){
				 strarray.set((char) i);
				 strarray.advance();
			}
			
			Object[] x = strarray.slice(0,0);
			for (Object i : x) System.out.println(i);
			
			
		}
	
}
