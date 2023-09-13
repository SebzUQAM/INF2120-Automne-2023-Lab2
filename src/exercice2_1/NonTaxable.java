package exercice2_1;

/**
 * La classe NonTaxable représente un produit non taxable.
 */
public class NonTaxable extends Produit {
    /**
     * Constructeur de la classe NonTaxable.
     *
     * @param nom  Le nom du produit non taxable.
     * @param prix Le prix du produit non taxable.
     */
    public NonTaxable(String nom, double prix) {
        super(nom, prix);
    }

    /**
     * Retourne le prix du produit non taxable.
     *
     * @return Le prix du produit non taxable.
     */
    @Override
    public double prix(){
        return getPrixProduit();
    }
}
