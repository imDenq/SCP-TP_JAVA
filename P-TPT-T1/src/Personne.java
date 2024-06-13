public abstract class Personne {
    private int age;
    private String nom;

    // Constructeur par défaut
    public Personne() {
        this.age = 0;
        this.nom = "";
    }

    // Constructeur avec paramètres
    public Personne(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    // Constructeur de copie
    public Personne(Personne p) {
        this.age = p.age;
        this.nom = p.nom;
    }

    // Getter pour l'âge
    public int getAge() {
        return age;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Méthode pour imprimer les informations de la personne
    public void imprime() {
        System.out.println("Personne : Nom = " + nom + ", Age = " + age);
    }

    // Méthode pour mettre à jour les informations de la personne
    public void miseAJour(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    // Méthode pour mettre à jour les informations de l'employé
    public abstract void miseAJour(int age, String nom, int salaire);

    // Méthode pour retourner le type de l'objet
    public String type() {
        return "Personne";
    }

    // Méthode toString pour afficher les informations de la personne
    @Override
    public String toString() {
        return "Personne [Nom = " + nom + ", Age = " + age + "]";
    }
}
