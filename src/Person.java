import java.time.LocalDate;
import java.time.Period;
public class Person {
    private String nom;
    private String prenom;
    private String mat;
    private int age;
    private LocalDate dateNaiss;


    public Person(String nom, String prenom, LocalDate dateNaiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.mat = genererMat();
        this.age = calculerAge();
        this.dateNaiss = dateNaiss;

    }

    private String genererMat() {
        String mat = "" + prenom.charAt(0) + nom.charAt(0);
        int randomNum = 1000 + (int) (Math.random() * 9000);
        mat += String.format("%04d", randomNum);
        return mat;
    }

    private int calculerAge() {
        LocalDate actuelleDate = LocalDate.now();
        return Period.between(dateNaiss, actuelleDate).getYears();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMat() {
        return mat;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public boolean estMemePersonne(Person autrePersonne) {
        return this.mat.equals(autrePersonne.getMat());
    }
}
