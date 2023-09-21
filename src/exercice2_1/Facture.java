package exercice2_1;

/**
 * La classe Facture représente une facture qui peut contenir une liste de produits.
 */
public class Facture {
    private final String AVERTISSEMENT_TABLEAU_PLEIN = "!! L'élément n'a pas été ajouté car le tableau est plein !!";
    private Produit[] produits = new Produit[30];
    private int indexProduit = 0;


    public void ajouterProduitNonTaxable( NonTaxable produit ){
        ajouterProduit(produit);
    }

    public void ajouterProduitTaxeSimple( TaxeSimple produit ){
        ajouterProduit(produit);
    }

    public void ajouterProduitTaxeDouble( TaxeDouble produit ){
        ajouterProduit(produit);
    }

    /**
     * Ajoute un produit à la facture.
     *
     * @param produit Le produit à ajouter à la facture.
     */
    public void ajouterProduit( Produit produit ){
        if(indexProduit == produits.length){
            System.err.println(AVERTISSEMENT_TABLEAU_PLEIN);
        }else {
            produits[indexProduit] = produit;
            indexProduit++;
        }
    }

    /**
     * Calcule le prix total de la facture en additionnant les prix de tous les produits.
     *
     * @return Le prix total de la facture.
     */
    public double prixTotal(){
        double prixTotal = 0;

        for(int i=0;i<indexProduit;i++){
            prixTotal = prixTotal + produits[i].prix();
            // équivalent mais un chouia plus avancé
            // prixTotal += produits[i].prix();
        }

        return prixTotal;
        // Pour arrondir au centième
        // return Math.round(prixTotal * 100) / 100.00;
    }
}
