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
public class CircularArray<K> {
	private int counter = 0;
	private K[] data;
	
	public CircularArray (int x){
		data = (K[])new Object[x];
	}
	
	public CircularArray (K ... a){
		data = a;
	}
	
	public void set(K newd){
		data[counter] = newd;
	}
	
	public void set(int i, K newd){
		data[i] = newd;
	}
	
	K advance(){
		K ret = getCurr();
		iterate();
		return ret;
	}
	
	K retreat(){
		K ret = getCurr();
		backwards();
		return ret;
	}
	
	void iterate(){
		counter++;
		counter %= data.length;	
	}
	
	void backwards(){
		counter--;
		if (counter < 0) counter += data.length;
	}
	 
	K getCurr(){
		return data[counter];	
	}
	
	K[] slice(int x, int y){
		int times;
		if(y > x) times = y - x;
		else times = (data.length - x) + y;
			//Side effects I guess
			int saveCounter = counter;
			counter = x;
 		K[] ret = (K[]) new Object[times];
		for (int i = 0; i < times; i++){
			ret[i] = advance();	
		}
	counter = saveCounter;
	return ret;	
	}
	

}
