package section06;

import java.util.Arrays;

public class EX06_13 {
	public static void main(String[] args) {
		
		int[] card = {1, 6, 4, 5, 3, 2};
		int[] newCard = new int[card.length];
		
		System.arraycopy(card, 0, newCard, 0, card.length);
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));
	}

}
