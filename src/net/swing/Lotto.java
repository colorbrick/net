package net.swing;

import java.util.Vector;

public class Lotto {

	int[] lotto = new int[6];
	
	public int[] getLotto(){
		return lotto;
	}
	
	public void setLotto() {
		for(int i=0; i<lotto.length; i++){
			int rand = getRandomNumber();
			lotto[i] = rand;
		}
		
		sort(lotto);
	}

	private int getRandomNumber() {
		int randNumber = (int) ((Math.random() * 45) + 1);
		
		return (!isDuplicated(randNumber))? randNumber : getRandomNumber();
	}

	private boolean isDuplicated(int randNumber) {
		for(int i : lotto){
			if(i == randNumber)
				return true;
		}
		
		return false;
	}

	public void sort(int[] array){
		
		for(int i=0; i<lotto.length; i++){
			for(int j=0; j<lotto.length-1; j++){
				if(lotto[j] > lotto[j+1]){
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = tmp;
				}
			}
		}
	}
}
