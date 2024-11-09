public class CompteEpargne extends AbstractCompte 
{
    String type = "epargne";
    double taux = 0.02;

    CompteEpargne(double solde)
    {
        super("epargne", solde, 0.02);
    }
}
