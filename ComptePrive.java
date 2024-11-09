public class ComptePrive extends AbstractCompte 
{
    protected String type = "prive";
    protected double taux = 0.01;

    ComptePrive(double solde)
    {
        super("prive", solde, 0.01);
    }
}
