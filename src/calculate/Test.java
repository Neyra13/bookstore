package calculate;

import java.util.Scanner;

import calculate.MyConnection;
import calculate.Calculate;

public class Test {
	
	
	//Affecter la methode main
		public static void main(String[] args) {
			
			System.out.println( "** WECLOME TO OUR BOOKSTORE ** \n");
			MyConnection con= new MyConnection();
           con.dateUse();
          con.displayBook();
			
		
        	 
			//try-catch block
			try {
			
			//pour pouvoir entrer les variables à partitr de l'utilisateur 
				Scanner scanner=new Scanner(System.in);
			
			//entrer le premier variable: qte
			System.out.println("Saisir la quantité désiré SVP: ");
			
			//lire le variable qte
			int c=scanner.nextInt();
			
			//entrer le premier variable: prix
			System.out.println("Saisir le prix SVP:");
			
			//lire le variable de prix
			float d=scanner.nextFloat();
			
			//instanciation du classe Produit
			Calculate a=new Calculate();
			
			//l'affichage du résultat
			System.out.println("Le prix totale de l'achat est: \n\n"+a.TotalPrice(c, d));
			}
			
			catch (Exception e) {
				System.out.println(e.getMessage());
				
			}

		}
}
