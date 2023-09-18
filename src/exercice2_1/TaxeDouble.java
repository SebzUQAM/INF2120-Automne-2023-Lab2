package exercice2_1;

/**
 * La classe TaxeDouble représente un produit taxable avec une taxe presque doublée.
 */
public class TaxeDouble extends Produit {
    private final double TAXE = 1.09975;

    private String nom;

    /**
     * Constructeur de la classe TaxeDouble.
     *
     * @param nom  Le nom du produit taxable avec taxe doublée.
     * @param prix Le prix du produit taxable avec taxe doublée.
     */
    public TaxeDouble(String nom, double prix) {

        super(nom, prix);
        this.nom = nom;
    }

    /**
     * Calcule et retourne le prix du produit taxable avec taxe doublée.
     *
     * @return Le prix du produit taxable avec taxe doublée.
     */
    @Override
    public double prix(){

        return getPrixProduit() * TAXE;
    }
}
