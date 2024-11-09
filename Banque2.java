import java.util.Scanner;

public class Banque2 
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans notre application bancaire".toUpperCase());

        System.out.println("Client 1:");
        Client client1 = setClient(scanner);

        scanner.nextLine();
        System.out.println("\nClient 2:");
        Client client2 = setClient(scanner);

        client1.afficher();
        client2.afficher();

        scanner.close();

        client1.boucleCompteEpargne();
        System.out.println("\nCompte epargne boucle utilisateur 1");
        
        client2.boucleCompteEpargne();
        System.out.println("\nCompte epargne boucle utilisateur 2");

        client1.boucleComptePrive();
        System.out.println("\nCompte prive boucle utilisateur 1");
        
        client2.boucleComptePrive();
        System.out.println("\nCompte prive boucle utilisateur 2");

        client1.afficher();
        client2.afficher();

    }

    public static Client setClient(Scanner scanner)
    {
        String nom, ville;
        double soldePrive, soldeEpargne;

        System.out.print("Veuillez entrer votre nom: ");
        nom = scanner.nextLine();

        System.out.print("Veuillez entrer votre ville: ");
        ville = scanner.nextLine();

        System.out.print("Veuillez entrer votre solde prive: ");
        soldePrive = scanner.nextDouble();

        System.out.print("Veuillez entrer votre solde epargne: ");
        soldeEpargne = scanner.nextDouble();

        return new Client(nom, ville, soldePrive, soldeEpargne);
    }


}
