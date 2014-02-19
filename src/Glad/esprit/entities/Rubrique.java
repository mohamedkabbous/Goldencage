
package Glad.esprit.entities;


public class Rubrique {
    
   protected int ID_Rubrique; 
   protected double prix; 
   protected String lien_web; 
   protected String lien_fb;
   protected boolean confirmation ;
   protected Prestataire prest ; 

    public Rubrique(double prix, String lien_web, String lien_fb, boolean confirmation,Prestataire prest) {
        this.prix = prix;
        this.lien_web = lien_web;
        this.lien_fb = lien_fb;
        this.confirmation = confirmation;
        this.prest=prest;
    }

    public Rubrique() {
    }

    public int getID_Rubrique() {
        return ID_Rubrique;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public String getLien_fb() {
        return lien_fb;
    }

    public String getLien_web() {
        return lien_web;
    }

    public double getPrix() {
        return prix;
    }

    public void setID_Rubrique(int ID_Rubrique) {
        this.ID_Rubrique = ID_Rubrique;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    public void setLien_fb(String lien_fb) {
        this.lien_fb = lien_fb;
    }

    public void setLien_web(String lien_web) {
        this.lien_web = lien_web;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
   
    
}
