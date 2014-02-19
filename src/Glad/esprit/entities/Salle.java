
package Glad.esprit.entities;

public class Salle extends Rubrique {
    
    private String nom ; 
    private String adresse ; 
    private String type ;

    public Salle(String nom, String adresse, String type, double prix, String lien_web, String lien_fb, boolean confirmation, Prestataire prest) {
        super(prix, lien_web, lien_fb, confirmation, prest);
        this.nom = nom;
        this.adresse = adresse;
        this.type = type;
    }

 

   

    public Salle() {
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
