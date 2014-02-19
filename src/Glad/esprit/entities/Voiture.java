
package Glad.esprit.entities;


public class Voiture extends Rubrique{
    
    private String marque ;

    public Voiture(String marque, double prix, String lien_web, String lien_fb, boolean confirmation, Prestataire prest) {
        super(prix, lien_web, lien_fb, confirmation, prest);
        this.marque = marque;
    }

 

    public Voiture() {
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    
    
}
