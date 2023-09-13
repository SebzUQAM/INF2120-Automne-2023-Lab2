package exercice2_2;

/**
 * La classe CylindreDroit représente une forme géométrique tridimensionnelle, en l'occurrence un cylindre droit.
 */
public class CylindreDroit extends Forme3D{
    private Forme2D base;
    private double hauteur;

    /**
     * Constructeur de la classe CylindreDroit.
     *
     * @param base    La base du cylindre droit, qui est une forme bidimensionnelle.
     * @param hauteur La hauteur du cylindre droit.
     */
    public CylindreDroit(Forme2D base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    /**
     * Calcule et retourne le volume du cylindre droit.
     *
     * @return Le volume du cylindre droit.
     */
    @Override
    public double volume() {
        return base.aire() * hauteur;
    }

    /**
     * Retourne une représentation textuelle du cylindre droit.
     *
     * @return Une chaîne de caractères représentant le cylindre droit et son volume.
     */
    @Override
    public String toString() {
        return String.format("Mon cylindre d'un volume de %s est plus beau que le tien :P", volume());
    }
}
