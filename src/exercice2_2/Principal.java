package exercice2_2;

import java.util.Arrays;

/**
 * La classe Principal est la classe principale du programme.
 * Elle contient la méthode main qui crée des objets de différentes formes
 * géométriques bidimensionnelles et tridimensionnelles,
 * les stocke dans des tableaux, et affiche ces formes ainsi que leurs volumes ou aires.
 */
public class Principal {
    public static void main(String[] jeSuisUnParametreVraimentTropLongPourRien){
        Forme2D[] forme2Ds = new Forme2D[2];

        forme2Ds[0] = new Rectangle(5, 6);
        forme2Ds[1] = new Cercle(8);

        Forme3D[] forme3Ds = new Forme3D[]{
                new Sphere(10),
                new CylindreDroit(forme2Ds[0], 7),
                new CylindreDroit(forme2Ds[1], 26),
        };

        System.out.println();

        System.out.println( Arrays.toString(forme2Ds)
                .replace("[","")
                .replace("]", "")
                .replaceAll(", ", "\n") );

        System.out.println();

        System.out.println( Arrays.toString(forme3Ds)
                .replace("[","")
                .replace("]", "")
                .replaceAll(", ", "\n")  );

        /*
        * Ok ok ! Je me suis amusé à faire quelque chose de plus compliquer que nécessaire
        * Je vous donne aussi un code plus commun, mais vous pouvez vous amuser à comprendre
        * ce que j'ai fait plus haut
        * */

        System.out.println();

        for(int i=0;i<forme2Ds.length;i++){
            System.out.println(forme2Ds[i]);
        }

        System.out.println();

        for(int i=0;i<forme3Ds.length;i++){
            System.out.println(forme3Ds[i]);
        }
    }
}
