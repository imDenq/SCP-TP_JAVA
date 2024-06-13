public class GestionMagasin {
    private Article[] articles;
    private int nombreArticles;

    public GestionMagasin(int taille){
        articles = new Article[taille];
        nombreArticles = 0;
    }

    public void ajouterArticle(Article article){
        if(nombreArticles < articles.length){
            articles[nombreArticles++] = article;
        } else {
            System.out.println("Tableau plein");
        }
    }

    public Article trouverArticle(String reference){
        for(int i = 0; i < nombreArticles; i++){
            if(articles[i].getReference().equals(reference)){
                return articles[i];
            }
        }
        return null;
    }

    public void afficherTousLesArticle(){
        for(int i = 0; i < nombreArticles; i++){
            System.out.println("-----------------------");
            articles[i].AfficherInfos();
            System.out.println("-----------------------");
        }
    }

    public void afficherArticle(String reference){
        Article article = trouverArticle(reference);

        if(article != null){
            article.AfficherInfos();
        } else {
            System.out.println("Article non trouvé");
        }
    }

    public void afficherArticlesStockVide(int magasin){
        System.out.println("Articles avec stock vide dans le magasin " + magasin + ": ");

        for (int i = 0; i < nombreArticles; i++){
            if(articles[i].getStock()[magasin - 1] == 0){
                System.out.println(articles[i].getNom() + " (" + articles[i].getReference() + ")");
            }
        }
    }
}
