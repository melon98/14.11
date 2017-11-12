package zadania3;

import java.util.Random;

public class zad1 {

	public static void main(String[] args) {
		int max, min,suma=0,x=0,iloscw=0,iloscm=0;
		double sr;
		Random r = new Random();
		int[] tab = new int[10];
		for (int i = 0; i < 10; i++)
			tab[i] = r.nextInt(21) - 10;

		for (int i = 0; i < 10; i++)
			System.out.print(tab[i] + ", ");
		max = tab[0];
		min = tab[0];
		for (int i = 0; i < 10; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
			if (tab[i] < min) {
				min = tab[i];
			}
		suma=suma+tab[i];
		x++;
		
		}
		
		sr=(double)suma/x;
		for (int i = 0; i < 10; i++) {
		if (tab[i]<sr) {
			iloscm++;
			}if (tab[i]>sr) {
				iloscw++;
		}
			
		
	}System.out.println(" ");
	System.out.println("max " + max);
	System.out.println("min " + min);
	System.out.println("sr " + sr);
	System.out.println("mniejszych od sr " + iloscm);
	System.out.println("wiekszych od sr " + iloscw);
	
	for (int i = 9; i >= 0;i-- )
		System.out.print(tab[i] + ", ");
}
}