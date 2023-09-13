package exercice2_2;

/**
 * La classe Rectangle représente une forme géométrique bidimensionnelle, en l'occurrence un rectangle.
 */
public class Rectangle extends Forme2D {
    private double hauteur;
    private double largeur;

    /**
     * Constructeur de la classe Rectangle.
     *
     * @param hauteur La hauteur du rectangle.
     * @param largeur La largeur du rectangle.
     */
    public Rectangle(double hauteur, double largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    /**
     * Calcule et retourne l'aire du rectangle.
     *
     * @return L'aire du rectangle.
     */
    @Override
    public double aire() {

        return largeur * hauteur;
    }

    /**
     * Retourne une représentation textuelle du rectangle.
     *
     * @return Une chaîne de caractères représentant le rectangle et son aire.
     */
    @Override
    public String toString() {
        return String.format("Regarde comme mon rectangle avec un aire de %s est beau !!", aire());
    }
}
