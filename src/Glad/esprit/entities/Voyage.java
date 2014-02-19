
package Glad.esprit.entities;

import java.util.Date;


public class Voyage extends Rubrique {
    
    private String endroit ; 
    private Date date_depart ; 
    private Date date_arrivé ;

    public Voyage(String endroit, Date date_depart, Date date_arrivé, double prix, String lien_web, String lien_fb, boolean confirmation, Prestataire prest) {
        super(prix, lien_web, lien_fb, confirmation, prest);
        this.endroit = endroit;
        this.date_depart = date_depart;
        this.date_arrivé = date_arrivé;
    }

   

    public Voyage() {
    }

    public Date getDate_arrivé() {
        return date_arrivé;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public String getEndroit() {
        return endroit;
    }

    public void setDate_arrivé(Date date_arrivé) {
        this.date_arrivé = date_arrivé;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public void setEndroit(String endroit) {
        this.endroit = endroit;
    }
    
    
    
}
