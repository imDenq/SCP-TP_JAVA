public class Employe extends Personne {
    private int salaire;

    // Constructeur par défaut
    public Employe() {
        super();
        this.salaire = 0;
    }

    // Constructeur avec paramètres
    public Employe(int age, String nom, int salaire) {
        super(age, nom);
        this.salaire = salaire;
    }

    // Constructeur avec une Personne et un salaire
    public Employe(Personne p, int salaire) {
        super(p);
        this.salaire = salaire;
    }

    // Getter pour le salaire
    public int getSalaire() {
        return salaire;
    }

    // Méthode pour mettre à jour les informations de l'employé
    @Override
    public void miseAJour(int age, String nom, int salaire) {
        super.miseAJour(age, nom);
        this.salaire = salaire;
    }

    // Méthode pour retourner le type de l'objet
    @Override
    public String type() {
        return "Employe";
    }

    // Méthode toString pour afficher les informations de l'employé
    @Override
    public String toString() {
        return "Employe [Nom = " + getNom() + ", Age = " + getAge() + ", Salaire = " + salaire + "]";
    }
}
