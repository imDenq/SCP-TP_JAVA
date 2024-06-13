public class Article {
    private String nom;
    private String reference;
    private int[] stock;
    private double[] prix;

    public Article(String nom, String reference){
        this.nom = nom;
        this.reference = reference;
        this.stock = new int[10];
        this.prix = new double[10];
    }

    public String getNom(){
        return nom;
    }

    public String getReference(){
        return reference;
    }

    public int[] getStock(){
        return stock;
    }

    public double[] getPrix(){
        return prix;
    }

    public double CalculerPrixMoyen(){
        double somme = 0;
        int count = 0;
        for(double p : prix){
            somme += p;
            count++;
        }
        return count > 0 ? somme / count : 0;
    }

    public int MagasinLePlusCher(){
        int index = 0;
        double maxPrix = prix[0];

        for(int i = 1; i < prix.length; i++){
            if (prix[i] > maxPrix) {
                maxPrix = prix[i];
                index = i;
            }
        }
        return index;
    }

    public void AfficherInfos(){
        System.out.println("Nom: " + nom);
        System.out.println("Référence: " +  reference);
        System.out.println("Stock et Prix dans les magains: ");

        for(int i =0; i < 10; i++){
            System.out.println("Magasin " + (i + 1) + " - Stock: " + stock[i] + " Prix: " + prix[i]);
        }
    }

    public void ModifierStock(int magasin, int quantite){
        if(magasin >= 1 && magasin <= 10){
            stock[magasin - 1] += quantite;
        }
    }
}
