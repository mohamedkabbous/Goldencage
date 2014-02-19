
package Glad.esprit.entities;

public class Administrateur {
    
    private int ID_admin ; 
    private String email;
    private String mdp ;

    public Administrateur(String email, String mdp) {
        this.ID_admin = ID_admin;
        this.email = email;
        this.mdp = mdp;
        
    }

    public Administrateur() {
    }

    public int getID_admin() {
        return ID_admin;
    }

    public String getEmail() {
        return email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setID_admin(int ID_admin) {
        this.ID_admin = ID_admin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    
    
}
