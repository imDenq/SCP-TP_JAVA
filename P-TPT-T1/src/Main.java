public class Main {
    public static void main(String[] args) {
        // 1. Création des Points pour les rectangles initiaux
        Point p10 = new Point(1, 4); // Point haut-gauche (hg) pour le premier rectangle
        Point p20 = new Point(5, 1); // Point bas-droit (bd) pour le premier rectangle

        // 2. Création d'un Rectangle en utilisant des objets Point
        Rectangle rect1 = new Rectangle(p10, p20);

        // 3. Affichage des coordonnées du premier rectangle
        System.out.println("==> Coordonnées initiales du rectangle rect1 :");
        rect1.affiche();
        System.out.println();

        // 4. Création d'un Rectangle en utilisant des coordonnées directes
        Rectangle rect2 = new Rectangle(2, 6, 8, 2);

        // 5. Affichage des coordonnées du deuxième rectangle
        System.out.println("==> Coordonnées initiales du rectangle rect2 :");
        rect2.affiche();
        System.out.println();

        // 6. Création des Points individuels
        Point p1 = new Point(3, 4); // Point avec des coordonnées spécifiques
        Point p2 = new Point();     // Point avec les coordonnées par défaut (0, 0)
        Point p3 = new Point(7, 2); // Point avec des coordonnées spécifiques

        // 7. Affichage des coordonnées initiales des points
        System.out.println("==> Coordonnées initiales des points :");
        System.out.println("p1 : (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2 : (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("p3 : (" + p3.getX() + ", " + p3.getY() + ")");
        System.out.println();

        // 8. Déplacement des points en utilisant les méthodes deplace
        p1.deplace(2, 1); // Déplacement de p1 de (2, 1)
        p2.deplace(5);    // Déplacement de p2 de (5, 5)

        // 9. Affichage des coordonnées après déplacement
        System.out.println("==> Coordonnées des points après déplacement :");
        System.out.println("Après deplace(2, 1), p1 : (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Après deplace(5), p2 : (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println();

        // 10. Affichage du nombre total d'objets Point créés
        System.out.println("==> Nombre total d'objets Point créés :");
        Point.nbPointCreated();
        System.out.println();

        // 11. Créer un point p1 avec les coordonnées (5, 5)
        Point pointSpecial = new Point(5, 5);

        // 12. Créer un rectangle r1 en utilisant p1 et un nouveau Point(10, 10)
        Rectangle rectangleSpecial = new Rectangle(pointSpecial, new Point(10, 10));

        // 13. Afficher les coordonnées du rectangle r1
        System.out.println("==> Coordonnées initiales du rectangle rectangleSpecial :");
        rectangleSpecial.affiche();
        System.out.println();

        // 14. Déplacer le rectangle r1 de (1, 1)
        System.out.println("==> Déplacement du rectangle rectangleSpecial de (1, 1)");
        rectangleSpecial.deplace(1, 1);
        System.out.println();

        // 15. Afficher les nouvelles coordonnées du rectangle r1 après déplacement
        System.out.println("==> Coordonnées du rectangle rectangleSpecial après déplacement :");
        rectangleSpecial.affiche();
        System.out.println();

        // 16. Afficher les coordonnées de pointSpecial
        System.out.println("==> Coordonnées de pointSpecial après déplacement du rectangle :");
        System.out.println("pointSpecial : (" + pointSpecial.getX() + ", " + pointSpecial.getY() + ")");
        System.out.println();

        // Scénario de création d'un carré à partir d'un point
        System.out.println("==> Création d'un carré centré sur pointCenter avec côté de longueur 4 :");
        Point pointCenter = new Point(5, 5);
        Rectangle square = pointCenter.faireSquare(4);
        square.affiche();
        System.out.println();

        // Test de la classe Polygone
        System.out.println("==> Test de la classe Polygone");

        // Créer un point p0(10,10)
        Point pol0 = new Point(10, 10);

        // Créer un point p1(20, 20)
        Point pol1 = new Point(20, 20);

        // Afficher les coordonnées de p0 et de p1
        System.out.println("Coordonnées de p0 : " + pol0);
        System.out.println("Coordonnées de p1 : " + pol1);

        // Créer un nouveau polygone poly de 3 coins
        Polygone poly = new Polygone(3);

        // Définir ces 3 coins à p0, p1 et p0
        poly.set_coin(0, pol0);
        poly.set_coin(1, pol1);
        poly.set_coin(2, pol0);

        // Afficher le polygones
        System.out.println("Polygone après définition des coins :");
        System.out.println(poly);
        System.out.println();

        // Test de la classe Personne
        System.out.println("==> Test de la classe Personne");

        // Créer une instance de Personne
        Personne personne1 = new Personne(30, "Alice") {
            @Override
            public void miseAJour(int age, String nom, int salaire) {

            }
        };
        System.out.println(personne1);

        // Mettre à jour les informations de la personne
        personne1.miseAJour(31, "Alice M.");
        System.out.println("Après mise à jour : " + personne1);

        // Créer une copie de Personne
        Personne personne2 = new Personne(personne1) {
            @Override
            public void miseAJour(int age, String nom, int salaire) {

            }
        };
        System.out.println("Copie de personne1 : " + personne2);

        // Test de la classe Employe
        System.out.println("\n==> Test de la classe Employe");

        // Créer une instance d'Employe
        Employe employe1 = new Employe(25, "Bob", 50000);
        System.out.println(employe1);

        // Mettre à jour les informations de l'employé
        employe1.miseAJour(26, "Bob B.", 55000);
        System.out.println("Après mise à jour : " + employe1);

        // Créer une instance d'Employe à partir d'une Personne
        Employe employe2 = new Employe(personne1, 60000);
        System.out.println("Employé créé à partir de personne1 : " + employe2);

        // Afficher les types
        System.out.println("Type de personne1 : " + personne1.type());
        System.out.println("Type d'employe1 : " + employe1.type());
    }
}
