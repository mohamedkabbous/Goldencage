
package Glad.esprit.entities;

import java.util.Date;


public class Reclamation {
    
  private int ID_reclamation ; 
  private String titre ; 
  private String type ; 
  private Date date ; 
  private String contenue ;
  private Client client;
  private Prestataire prest;

    public Reclamation(String titre, String type, Date date, String contenue,Object obj) {
        this.titre = titre;
        this.type = type;
        this.date = date;
        this.contenue = contenue;
        if (obj.getClass()==client.getClass())this.client=(Client)obj;
        else if (obj.getClass()==prest.getClass())this.prest=(Prestataire)obj;
    }

    public Reclamation() {
    }

    public int getID_reclamation() {
        return ID_reclamation;
    }

    public String getContenue() {
        return contenue;
    }

    public Date getDate() {
        return date;
    }

    public String getTitre() {
        return titre;
    }

    public String getType() {
        return type;
    }

    public void setID_reclamation(int ID_reclamation) {
        this.ID_reclamation = ID_reclamation;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public Prestataire getPrest() {
        return prest;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPrest(Prestataire prest) {
        this.prest = prest;
    }
    
  
}
