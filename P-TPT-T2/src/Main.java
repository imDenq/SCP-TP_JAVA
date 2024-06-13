import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionMagasin gestion = new GestionMagasin();

        while (true){
            System.out.println("Menu:");
            System.out.println("1. Ajouter un article");
            System.out.println("2. Afficher toutes les informations des articles");
            System.out.println("3. Afficher les informations d'un article");
            System.out.println("4. Calculer le prix moyen d'un article");
            System.out.println("5. Trouver le magasin où l'article est le plus cher");
            System.out.println("6. Afficher les articles avec stock vide dans un magasin");
            System.out.println("7. Modifier le stock d'un article dans un magasin");
            System.out.println("8. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // consommer la nouvelle ligne

            switch(choix){
                case 1:
                    System.out.print("Nom de l'article : ");
                    String nom = scanner.nextLine();
                    System.out.print("Référence de l'article: ");
                    String reference = scanner.nextLine();

                    Article article = new Article(nom, reference);

                    for(int i = 0; i < 10; i++){
                        System.out.print("Stock au magasin " + (i + 1) + ": ");
                        article.getStock()[i] = scanner.nextInt();
                        System.out.print("Prix au magasin " + (i + 1) + ": ");
                        article.getPrix()[i] = scanner.nextDouble();
                    }
                    scanner.nextLine();
                    gestion.ajouterArticle(article);
                    break;

                case 2:
                    gestion.afficherTousLesArticles();
                    break;

                case 3:
                    System.out.print("Référence de l'article: ");
                    reference = scanner.nextLine();
                    gestion.afficherArticle(reference);
                    break;

                case 4:
                    System.out.print("Référence de l'article: ");
                    reference = scanner.nextLine();
                    article = gestion.trouverArticle(reference);

                    if(article != null){
                        System.out.println("Prix moyen: " + article.calculerPrixMoyen());
                    } else {
                        System.out.print("Article non trouvé");
                    }

                case 5:
                    System.out.print("Référence de l'article: ");
                    reference = scanner.nextLine();
                    article = gestion.trouverArticle(reference);

                    if(article != null){
                        int magasin = article.MagasinLePlusCher() + 1;
                        System.out.println("Le magasin le plus cher est: " + magasin);
                    } else {
                        System.out.print("Article non trouvé");
                    }
                    break;

                case 6:
                    System.out.print("Numéto du magasin (1-10): ");
                    int magasin = scanner.nextInt();
                    scanner.nextLine();
                    gestion.afficherArticlesStockVide(magasin);
                    break;

                case 7:
                    System.out.println("Référence de l'article: ");
                    reference = scanner.nextLine();
                    System.out.print("Numéro du magasin (1-10): ");
                    magasin = scanner.nextInt();
                    System.out.print("Quantité à modifier (+ ou -): ");
                    int quantite = scanner.nextInt();
                    scanner.nextLine();

                    article = gestion.trouverArticle(reference);

                    if(article != null){
                        article.ModifierStock(magasin, quantite);
                    } else {
                        System.out.println("Article non trouvé");
                    }

                case 8:
                    System.out.println("Fermeture du programme en cours...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Veuillez entrer un choix valide");
                    break;
            }
        }
    }
}