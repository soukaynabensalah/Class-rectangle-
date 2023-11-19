class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        rec1.longueur = 2 ;
        rec1.largueur = 3 ;
        rec1.P();
        rec1.Air();
        rec1.IsCarre();
        rec1.Affichage();
    }
}
class Rectangle {
    short longueur;
    short largueur;
    
    void P() {
        System.out.println(2 * (longueur + largueur));
    }
    
    void Air() {
        System.out.println(longueur * largueur);
    }
    
    void IsCarre() {
        if (longueur == largueur) {
            System.out.println("il s'agit d'un carre");
        }else {
            System.out.println("il ne s'agit pas d'un carre");
        }
    }
  
    void Affichage() {
        System.out.println("la longueur du rectangle est : " + longueur);
        System.out.println("la largueur du rectangle est : " + largueur);
        System.out.println("le perimetre du rectangle est : " + 2 * (longueur + largueur));
        System.out.println("l'air  du rectangle est : " + longueur * largueur);
   }
}    
    
