public class contact{
    
    private String nom; 
    private String mail;
    private String tel;
    
    
    public contact(String nom , String mail , String tel){
        this.nom = nom;
        this.mail = mail;
        this.tel = tel;
    }
    //Getter
    
    public String getNom(){
        return nom;
    }
    
    public String getMail(){
        return mail;
    }
    
    public String getTel(){
        return tel;
    }
    
    //Setters
    
     public void setNom(){
         this.nom = nom;
         if(nom == null){
             throw new IllegalArgumentException("Mets ton prénom champion");
         }
     }
     
     public void setMail(){
         this.mail = mail;
         if(!mail.contains("@") || !mail.contains(".")){
             throw new IllegalArgumentException("mail non valide");
         }
     }
     
     public void setTel(){
         this.tel = tel;
     }
     
     @Override
      public String toString(){
          return "Contact ->" + nom + " mail = "+ mail + "telephone = " + tel ;
      }
}





