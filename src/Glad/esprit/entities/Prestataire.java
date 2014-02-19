
package Glad.esprit.entities;


public class Prestataire {
    
    private int ID_prestataire ;
    private String email ; 
    private String mdp ; 
    private String nom ; 
    private String prenom ; 
    private String telephone ; 
    private String adresse ;

    public Prestataire(String email, String mdp, String nom, String prenom, String telephone, String adresse) {
        this.email = email;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public Prestataire() {
    }

    public int getID_prestataire() {
        return ID_prestataire;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getMdp() {
        return mdp;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setID_prestataire(int ID_prestataire) {
        this.ID_prestataire = ID_prestataire;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    
    
}
