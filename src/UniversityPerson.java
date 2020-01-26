public class UniversityPerson extends Person {

    private static int uID;
    private int firstYearOnUniversity;
    private String universityDegree;

    public UniversityPerson(String firstName, String lastName, int yearOfBirth, int firstYearOnUniversity, String universityDegree) {
        super(firstName, lastName, yearOfBirth);
        this.firstYearOnUniversity = firstYearOnUniversity;
        this.universityDegree = universityDegree;
        uID++;
    }

}
