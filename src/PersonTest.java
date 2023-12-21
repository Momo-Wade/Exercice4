import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args){
            // Création d'une instance de Personne pour tester
            LocalDate dateNaiss = LocalDate.of( 2002, 2, 19);
            Person personP = new Person("Wade", "Momat", dateNaiss);

            System.out.println("Nom: " + personP.getNom());
            System.out.println("Prénom: " + personP.getPrenom());
            System.out.println("Matricule: " + personP.getMat());
            System.out.println("Âge: " + personP.getAge());
            System.out.println("Date de naissance: " + personP.getDateNaiss());


            Person autrePersonne = new Person("Autre", "Personne", dateNaiss);
            System.out.println("Est la même personne: " + personP.estMemePersonne(autrePersonne));
    }
}
