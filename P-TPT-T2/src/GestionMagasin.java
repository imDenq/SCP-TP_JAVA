import java.util.HashMap;

public class GestionMagasin {
    private HashMap<String, Article> articles;

    public GestionMagasin(){
        articles = new HashMap<>();
    }

    public void ajouterArticle(Article article){
        articles.put(article.getReference(), article);
    }

    public Article trouverArticle(String reference){
        return articles.get(reference);
    }

    public void afficherTousLesArticles(){
        for(Article article : articles.values()){
            article.AfficherInfos();
        }
    }

    public void afficherArticle(String reference){
        Article article = articles.get(reference);

        if(article != null){
            article.AfficherInfos();
        } else {
            System.out.println("Aucun article trouvé.");
        }
    }

    public void afficherArticlesStockVide(int magasin){
        System.out.println("Articles avec stock vide " + magasin + ": ");

        for(Article article : articles.values()){
            if(article.getStock()[magasin - 1] == 0){
                System.out.println(article.getNom() + " (" + article.getReference() + ")");
            }
        }
    }
}
