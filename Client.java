public class Client {

    private String nom;
    private String ville;

    private ComptePrive comptePrive;
    private CompteEpargne compteEpargne;

    Client(String nom, String ville, double soldePrive, double soldeEpargne)
    {
        this.setNom(nom);
        this.setVille(ville);

        this.comptePrive = new ComptePrive(soldePrive);
        this.compteEpargne = new CompteEpargne(soldeEpargne);
    }

    public void boucleComptePrive()
    {
        this.comptePrive.boucle();
    }

    public void boucleCompteEpargne()
    {
        this.compteEpargne.boucle();
    }

    public void afficher()
    {
        System.out.printf(
            "\nClient %s de %s\nCompte privee: %s\nCompte Epargne: %s\n",
            this.nom,
            this.ville,
            this.comptePrive.getSolde(),
            this.compteEpargne.getSolde()
        );
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getNom()
    {
        return this.nom;
    }

    public void setVille(String ville)
    {
        this.ville = ville;
    }

    public String getVille()
    {
        return this.ville;
    }
}
