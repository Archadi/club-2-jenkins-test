public class Club {
    String nom;
    int capacite;

    public Club(){
        this.nom="new club";
    }

    public Club(String leNom, int laCapacite){
        this.nom=leNom;
        this.capacite=laCapacite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
