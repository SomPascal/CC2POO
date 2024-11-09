public abstract class AbstractCompte {
    protected String type;

    protected double solde;
    protected double taux;

    AbstractCompte(String type, double solde, double taux)
    {
        this.type = type;
        this.solde = solde;
        this.taux = taux;
    }

    public double boucle()
    {
        double interets = this.getTaux() * this.getSolde();
        this.setSolde(this.getSolde() + interets);

        return this.getSolde();
    }

    public void setSolde(double solde)
    {
        this.solde = solde;
    }

    public double getTaux()
    {
        return this.taux;
    }

    public double getSolde()
    {
        return this.solde;
    }
}
