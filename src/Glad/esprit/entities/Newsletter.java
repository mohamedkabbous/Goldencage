
package Glad.esprit.entities;

import java.util.Date;

public class Newsletter {
    
    private int ID_newsletter; 
    private String contenue ; 
    private Date date_envoie;

    public Newsletter(String contenue, Date date_envoie) {
        this.contenue = contenue;
        this.date_envoie = date_envoie;
    }

    public Newsletter() {
    }

    public int getID_newsletter() {
        return ID_newsletter;
    }

    public String getContenue() {
        return contenue;
    }

    public Date getDate_envoie() {
        return date_envoie;
    }

    public void setID_newsletter(int ID_newsletter) {
        this.ID_newsletter = ID_newsletter;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
    }

    public void setDate_envoie(Date date_envoie) {
        this.date_envoie = date_envoie;
    }
    
    
}
