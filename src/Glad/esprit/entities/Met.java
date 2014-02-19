
package Glad.esprit.entities;


public class Met extends Rubrique {
    
    
    private String type;

    public Met(String type, double prix, String lien_web, String lien_fb, boolean confirmation, Prestataire prest) {
        super(prix, lien_web, lien_fb, confirmation, prest);
        this.type = type;
    }
     

  

    public Met() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

  
    
}
