public class Polygone {
    private Point[] coins;

    // Constructeur pour définir la taille du polygone
    public Polygone(int n) {
        this.coins = new Point[n];
    }

    // Méthode pour définir un coin à l'index i avec un point donné
    public void set_coin(int i, Point p) {
        if (i >= 0 && i < coins.length) {
            this.coins[i] = p;
        }
    }

    // Méthode pour définir un coin à l'index i avec des coordonnées x et y
    public void set_coin_ok(int i, int x, int y) {
        if (i >= 0 && i < coins.length) {
            this.coins[i] = new Point(x, y);
        }
    }

    // Méthode pour déplacer tout le polygone
    public void deplace(int dx, int dy) {
        for (Point coin : coins) {
            if (coin != null) {
                coin.deplace(dx, dy);
            }
        }
    }

    // Méthode toString pour afficher les coordonnées de tous les coins du polygone
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Polygone : ");
        for (Point coin : coins) {
            if (coin != null) {
                sb.append(coin.toString()).append(" ");
            } else {
                sb.append("(null) ");
            }
        }
        return sb.toString();
    }

    // Méthode pour obtenir la taille du polygone
    public int taille() {
        return coins.length;
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        // Créer un point p0(10,10)
        Point p0 = new Point(10, 10);

        // Créer un point p1(20, 20)
        Point p1 = new Point(20, 20);

        // Afficher les coordonnées de p0 et de p1
        System.out.println("Coordonnées de p0 : " + p0);
        System.out.println("Coordonnées de p1 : " + p1);

        // Créer un nouveau polygone poly de 3 coins
        Polygone poly = new Polygone(3);

        // Définir ces 3 coins à p0, p1 et p0
        poly.set_coin(0, p0);
        poly.set_coin(1, p1);
        poly.set_coin(2, p0);

        // Afficher le polygone
        System.out.println("Polygone après définition des coins :");
        System.out.println(poly);
    }
}
