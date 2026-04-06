

public class Etudiant {
    private String nom;
    private String prenom;
    private int matricule;
    private double moyenne;
    private String specialite;
    
    public Etudiant(String nom, String prenom, int matricule, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.specialite = specialite;
        this.moyenne = 0.0;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public int getMatricule() {
        return matricule;
    }
    
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
    
    public double getMoyenne() {
        return moyenne;
    }
    
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    
    public String getSpecialite() {
        return specialite;
    }
    
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule=" + matricule +
                ", moyenne=" + moyenne +
                ", specialite='" + specialite + '\'' +
                '}';
    }
}
