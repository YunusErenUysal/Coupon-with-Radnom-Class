

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;



public class YunusErenUysal2221032066
{

	public static void main(String[] args)//   YUNUS EREN UYSAL 2221032066

	{
		Scanner giris = new Scanner(System.in);


		boolean ayni = false;
		int rastgeleSayi, i = 0, j = 0, k = 0;

		
		int[] kupon = new int[12];

		System.out.println("tek sayili kuponlar icin 1,\ncift sayili kuponlar icin 2,\nHem çift hem tek için 3 .");
		int secim = giris.nextInt();

		if(secim == 1)
		{
			while(i < 12)
			{
				do
				{
					ayni = false;
					rastgeleSayi = (int) ( Math.random() * 49 + 1);
					while(j < 12)
					{
						if(rastgeleSayi == kupon[j])
							ayni = true;
						j++;
					}
					j = 0;
				}
				while(rastgeleSayi % 2 == 0 | ayni == true);
				kupon[i] = rastgeleSayi;
				i++;
			}
		}
		else if(secim == 2)
		{
			while(i< 12)
			{
				do
				{
					ayni = false;
					rastgeleSayi = (int) (1 + Math.random() * 49);
					while(j < 12)
					{
						if(rastgeleSayi == kupon[j])
							ayni = true;
						j++;

					}
					j = 0;
				}
				while(rastgeleSayi % 2 == 1 | ayni == true);
				kupon[i] = rastgeleSayi;
				i++;

			}
		}
		else
		{
			while(i < 12)
			{
				do
				{

					ayni = false;
					rastgeleSayi = (int) (1 + Math.random() * 49);
					while(j < 12)
					{
						if(rastgeleSayi == kupon[j])
							ayni = true;
						j++;
					}
					j = 0;
				}
				while(ayni == true);
				kupon[i] = rastgeleSayi;
				i++;
			}
		}

		
		System.out.println("BIRINCI KUPON");
		while(k < 6)
		{
			System.out.print(kupon[k] + " " );
			k++;
		}
		System.out.println("\nIKINCI KUPON");
		while(k < 12)
		{
			System.out.print(kupon[k] + " ");
			k++;
		}
	}

}
