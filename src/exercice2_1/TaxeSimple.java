package exercice2_1;

/**
 * La classe TaxeSimple représente un produit taxable avec une taxe simple.
 */
public class TaxeSimple extends Produit {
    private final double TAXE = 1.05;

    /**
     * Constructeur de la classe TaxeSimple.
     *
     * @param nom  Le nom du produit taxable avec taxe simple.
     * @param prix Le prix du produit taxable avec taxe simple.
     */
    public TaxeSimple(String nom, double prix) {

        super(nom, prix);
    }

    /**
     * Calcule et retourne le prix du produit taxable avec taxe simple.
     *
     * @return Le prix du produit taxable avec taxe simple.
     */
    @Override
    public double prix(){

        return getPrixProduit() * TAXE;
    }
}
