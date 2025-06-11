import java.util.ArrayList;
import java.util.Scanner;


public class runContact{
    
    

    public static void main(String[] args) {
    ArrayList<contact> listeContacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int choix;

     
    do {
        System.out.println("1. Ajouter un contact");
        System.out.println("2. Afficher les contacts");
      
        System.out.println("3. Supprimer un Contact");
        System.out.println("4. Quitter");
        System.out.print("Entrez votre choix: ");
        choix = scanner.nextInt();
        scanner.nextLine(); 
        switch(choix){
            case 1:
                System.out.println("Ajouter un contact");
                System.out.print("Entrez le nom: ");
                String nom = scanner.nextLine();
                System.out.print("Entrez l'email: ");
                String mail = scanner.nextLine();
                System.out.print("Entrez le téléphone: ");
                String tel = scanner.nextLine();

                contact nouveauContact = new contact(nom, mail, tel);
                listeContacts.add(nouveauContact);
                System.out.println("Contact ajouté avec succès!");
            
            case 2: 
                  
                   System.out.println("liste de  contact");
                   if(listeContacts.isEmpty()){
                    System.out.println("il n y a aucun contact dans la liste ");

                   } else{
                    System.out.println("Liste de contact");
                    for(int c = 0; c < listeContacts.size(); c++){
                        System.out.println((c+1) + "." + listeContacts.get(c));

                    }
                   }
              
           case 3:
           int index = scanner.nextInt();
           System.out.println("choisissez le contact a supp");
        if(index>0 && index < listeContacts.size()){
            listeContacts.remove(index-1);
        }




                 
        }

    }while (choix != 4) ;
        
    }

        
    }
    
