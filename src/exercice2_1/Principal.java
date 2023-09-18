package exercice2_1;

/**
 * La classe Principal est la classe principale du programme.
 * Elle contient la méthode main qui crée une facture et ajoute différents produits à celle-ci
 * pour ensuite afficher le prix total de la facture.
 */
public class Principal {
    /**
     * Méthode principale du programme.
     *
     * @param args Les arguments de ligne de commande (non utilisés dans ce programme).
     */
    public static void main(String[] args){

        System.out.println(exSigleton.getInstance().lumiere());

        Facture facture = new Facture();

        facture.ajouterProduit(new NonTaxable("Article1", 100.00));
        facture.ajouterProduit(new NonTaxable("Article2", 12.55));

        facture.ajouterProduit(new TaxeDouble("Article12", 60.99));
        facture.ajouterProduit(new TaxeDouble("Article13", 70.00));

        facture.ajouterProduit(new NonTaxable("Article3", 55.03));
        facture.ajouterProduit(new NonTaxable("Article4", 75.00));
        facture.ajouterProduit(new NonTaxable("Article5", 10.99));

        facture.ajouterProduit(new TaxeSimple("Article6", 45.00));

        facture.ajouterProduit(new TaxeDouble("Article8", 45.33));
        facture.ajouterProduit(new TaxeDouble("Article9", 6.99));

        facture.ajouterProduit(new TaxeSimple("Article7", 85.89));

        facture.ajouterProduit(new TaxeDouble("Article10", 15.50));
        facture.ajouterProduit(new TaxeDouble("Article11", 9.40));

        facture.ajouterProduit(new Produit("pomme", 9.15));

        System.out.println(facture.prixTotal());
    }
}
