
/*
TP0
Exercice 1
*/
package exo1;

import java.util.Scanner;

/**
 *
 * @author cleme
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ? :");
        prenom = sc.nextLine();
System.out.println("Au revoir "+ prenom);
    }
    
}
