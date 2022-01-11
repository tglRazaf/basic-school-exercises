package polymorphisme;



public interface Liste {
    public void ajout(int nouvVal);
    public int extraction();
    public boolean estVide();
}


//les class qui implemente cet interface est da le dossier /src/lifo_fifo et aussi le fichier FileDePriorieFinal dans /src
//Ici on utilise interface car on veut que chaque methode (abstract) a sa propre implementation dans chaque class fille