package exercice2_1;

/**
 * La classe abstraite Produit est une classe de base pour représenter un produit.
 */
public class Produit {
    protected String nom;
    private double prixProduit;

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom  Le nom du produit.
     * @param prix Le prix du produit.
     */
    public Produit(String nom, double prix){
        this.nom = nom;
        prixProduit = prix;
    }

    /**
     * Calcule et retourne le prix du produit.
     *
     * @return Le prix du produit.
     */
    public double prix(){
        return 0;
    }

    /**
     * Obtient le nom du produit.
     *
     * @return Le nom du produit.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom du produit.
     *
     * @param nom Le nom du produit.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient le prix du produit.
     *
     * @return Le prix du produit.
     */
    public double getPrixProduit() {
        return prixProduit;
    }

    /**
     * Définit le prix du produit.
     *
     * @param prixProduit Le prix du produit.
     */
    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }
}
