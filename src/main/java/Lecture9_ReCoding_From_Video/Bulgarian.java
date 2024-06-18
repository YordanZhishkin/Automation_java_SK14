package Lecture9_ReCoding_From_Video;

public class Bulgarian extends Person {
    public Bulgarian(String name, String egn, String religion, String language, String nationality, String country,
                     Boolean hasJob, String jobTitle, String sex) {
        super(name, egn, religion, language, nationality, country, hasJob, jobTitle, sex);
    }

    @Override
                        //when print this throw ex to IsAdult default value...
    public void setCountry(String country) {
        if (!country.equalsIgnoreCase("Bulgaria")) {
            throw new RuntimeException("You are not Bulgarian, and we are done.");
        }
    }

    public void IsDrinking(String IsDrinking) {
        System.out.println("Bulgarians drink a lot  of: " + IsDrinking);
    }

    @Override
    public void setNationality(String nationality) {
        if (nationality.equalsIgnoreCase("Bulgarian")) {
            throw new IllegalArgumentException("You can not be other nationality.");

        }
    }
}
