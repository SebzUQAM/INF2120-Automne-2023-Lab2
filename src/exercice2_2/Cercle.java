package exercice2_2;

/**
 * La classe Cercle représente une forme géométrique bidimensionnelle, en l'occurrence un cercle.
 */
public class Cercle extends Forme2D {
    private double rayon;

    /**
     * Constructeur de la classe Cercle.
     *
     * @param rayon Le rayon du cercle.
     */
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Calcule et retourne l'aire du cercle.
     *
     * @return L'aire du cercle.
     */
    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
        // ou return Math.PI * Math.pow(rayon,2);
    }

    /**
     * Retourne une représentation textuelle du cercle.
     *
     * @return Une chaîne de caractères représentant le cercle et son aire.
     */
    @Override
    public String toString() {

        return "Mon beau cercle avec un aire de " + aire();
    }
}
