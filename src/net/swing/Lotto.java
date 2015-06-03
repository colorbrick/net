package net.swing;

import java.util.Vector;

public class Lotto {
	Vector<Integer> vec = new Vector<Integer>();
	int[] lotto = new int[6];
	
	public int[] getLotto(){
		return lotto;
	}
	
	
	public void setLotto() {
		for (int i = 0; i < lotto.length; i++) {

		}
		
	}
	
	public Vector<Integer> sort(int[] array){
		for(int i : array){
			vec.addElement(i);
		}
		return vec;		
	}

}
