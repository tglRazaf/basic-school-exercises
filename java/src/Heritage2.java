/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author ANDRY-PC
 */
public class Heritage2 {

   
    public static void main(String[] args) {
        Personne p1 = new Personne("RANDRIA", "Naivo", 20, true);
      //  p1.affiche();
        p1.presentation();
        
        Etudiant e1 = new Etudiant("IGGLIA", 2, "RASOA", "Fetsy", 22, false);
        e1.affiche();
        
        Personne p4 =  new Etudiant("ESIIA",2,"BOZY","Fetsy",17,false); // satria ny étudiant efa personne     
        p4.affiche(); //Plymorphisme
        
        
        Personne p2 = new Etudiant("ISAIA", 2, "RABE", "Vola", 10, false);
        p2.affiche(); //Polymorphimse 
      //  System.out.println("----");
      //  e1.affiche2();
      
        Personne p3 = new Etudiant("IMTICIA", 2, "RABAKO", "Matsilo", 17, false);
        p3.presentation();
        
        
    }
    
}
