import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionMagasin gestionMagasin = new GestionMagasin(100);

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
            scanner.nextLine();

            switch (choix){
                case 1:
                    System.out.print("Nom de l'article : ");
                    String nom = scanner.nextLine();
                    System.out.print("Référence de l'article : ");
                    String reference = scanner.nextLine();
                    Article article = new Article(nom, reference);
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Stock au magasin " + (i + 1) + " : ");
                        article.getStock()[i] = scanner.nextInt();
                        System.out.print("Prix au magasin " + (i + 1) + " : ");
                        article.getPrix()[i] = scanner.nextDouble();
                    }
                    scanner.nextLine();
                    gestionMagasin.ajouterArticle(article);
                    break;
                case 2:
                    gestionMagasin.afficherTousLesArticle();
                    break;
                case 3:
                    System.out.print("Référence de l'article : ");
                    reference = scanner.nextLine();
                    gestionMagasin.afficherArticle(reference);
                    break;
                case 4:
                    System.out.print("Référence de l'article : ");
                    reference = scanner.nextLine();
                    article = gestionMagasin.trouverArticle(reference);
                    if (article != null) {
                        System.out.println("Prix moyen : " + article.CalculerPrixMoyen());
                    } else {
                        System.out.println("Article non trouvé.");
                    }
                    break;
                case 5:
                    System.out.print("Référence de l'article : ");
                    reference = scanner.nextLine();
                    article = gestionMagasin.trouverArticle(reference);
                    if (article != null) {
                        int magasin = article.MagasinLePlusCher() + 1;
                        System.out.println("Le magasin où l'article est le plus cher est le magasin " + magasin);
                    } else {
                        System.out.println("Article non trouvé.");
                    }
                    break;
                case 6:
                    System.out.print("Numéro du magasin (1-10) : ");
                    int magasin = scanner.nextInt();
                    scanner.nextLine();
                    gestionMagasin.afficherArticlesStockVide(magasin);
                    break;
                case 7:
                    System.out.print("Référence de l'article : ");
                    reference = scanner.nextLine();
                    System.out.print("Numéro du magasin (1-10) : ");
                    magasin = scanner.nextInt();
                    System.out.print("Quantité à modifier (+ ou -) : ");
                    int quantite = scanner.nextInt();
                    scanner.nextLine();
                    article = gestionMagasin.trouverArticle(reference);
                    if (article != null) {
                        article.ModifierStock(magasin, quantite);
                    } else {
                        System.out.println("Article non trouvé.");
                    }
                    break;
                case 8:
                    System.out.println("Fermeture en cours...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }
    }
}