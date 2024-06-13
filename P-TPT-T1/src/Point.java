public class Point {
    private int x;
    private int y;
    private static int nbPoint = 0;

    // Constructeur par défaut
    public Point() {
        this(0, 0);
    }

    // Constructeur avec coordonnées
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        nbPoint++;
    }

    // Constructeur de copie
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
        nbPoint++;
    }

    // Getter pour x
    public int getX() {
        return x;
    }

    // Getter pour y
    public int getY() {
        return y;
    }

    // Setter pour x
    public void setX(int x) {
        this.x = x;
    }

    // Setter pour y
    public void setY(int y) {
        this.y = y;
    }

    // Méthode pour déplacer le point
    public void deplace(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Méthode surchargée pour déplacer le point de manière égale sur x et y
    public void deplace(int d) {
        this.x += d;
        this.y += d;
    }

    // Méthode statique pour obtenir le nombre de Points créés
    public static void nbPointCreated() {
        System.out.println("Nombre d'objets Point créés : " + nbPoint);
    }

    // Méthode toString pour afficher les coordonnées du point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public Rectangle faireSquare(int d) {
        Point a = new Point(this); // Copier le point actuel
        a.deplace(-d / 2, -d / 2); // Déplacer le point a pour qu'il soit le coin supérieur gauche

        Point b = new Point(this); // Copier le point actuel
        b.deplace(d / 2, d / 2);   // Déplacer le point b pour qu'il soit le coin inférieur droit

        return new Rectangle(a, b); // Créer et retourner le rectangle
    }
}
