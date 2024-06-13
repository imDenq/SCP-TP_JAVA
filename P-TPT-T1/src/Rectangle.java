public class Rectangle {
    private Point hg; // haut gauche (top-left)
    private Point bd; // bas droit (bottom-right)

    // Constructeur utilisant des objets Point
    public Rectangle(Point hg, Point bd) {
        this.hg = hg;
        this.bd = bd;
    }

    // Constructeur utilisant des coordonnées
    public Rectangle(int hgX, int hgY, int bdX, int bdY) {
        this.hg = new Point(hgX, hgY);
        this.bd = new Point(bdX, bdY);
    }

    // Méthode pour afficher les coordonnées du rectangle
    public void affiche() {
        System.out.println("Rectangle : (" + hg.getX() + ", " + hg.getY() + ") (" + bd.getX() + ", " + bd.getY() + ")");
    }

    // Méthode pour déplacer le rectangle de (dx, dy)
    public void deplace(int dx, int dy) {
        this.hg.deplace(dx, dy);
        this.bd.deplace(dx, dy);
    }

    // Méthode surchargée pour déplacer le rectangle de (d, d)
    public void deplace(int d) {
        this.hg.deplace(d, d);
        this.bd.deplace(d, d);
    }

    // Getter pour hg
    public Point getHg() {
        return hg;
    }

    // Getter pour bd
    public Point getBd() {
        return bd;
    }

    // Setter pour hg
    public void setHg(Point hg) {
        this.hg = hg;
    }

    // Setter pour bd
    public void setBd(Point bd) {
        this.bd = bd;
    }
}
