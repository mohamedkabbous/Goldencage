
package Glad.esprit.entities;


public class Client {
    
   private int ID_client;
   private String email ;
   private String mdp ;
   private String nom; 
   private String prenom ; 
   private String sexe ; 
   private int age ; 
   private String telephone ; 
   private String adresse ;

    public Client(String email, String mdp, String nom, String prenom, String sexe, int age, String telephone, String adresse) {
        this.email = email;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public Client() {
    }

    public int getID_client() {
        return ID_client;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAge() {
        return age;
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

    public String getSexe() {
        return sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setID_client(int ID_client) {
        this.ID_client = ID_client;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
   
    
}
