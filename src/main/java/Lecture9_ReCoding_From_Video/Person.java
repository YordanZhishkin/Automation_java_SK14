package Lecture9_ReCoding_From_Video;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final String religion;
    private final String language;
    private String nationality;
    private String country;
    private String jobTitle;
    private boolean hasJob;
    private String egn;
    private String birthDate;
    private int age;
    private String sex;

    public Person(String name, String egn, String religion, String language, String nationality, String country,
                  Boolean hasJob, String jobTitle, String sex) {
        setEgn(egn);
        setBirthDate(egn);
        setAge(egn);
        setSex(sex);
        this.name = name;
        this.religion = religion;
        this.language = language;
        this.nationality = nationality;
        this.country = country;
        this.hasJob = hasJob;
        this.jobTitle = jobTitle;
    }


    private void setAge(String egn) {

        int currentYear = LocalDate.now().getYear();
        this.age = currentYear - Integer.parseInt(personBirdYear(egn));
    }

    private void setBirthDate(String egn) {
        String month = egn.substring(2, 4);
        String date = egn.substring(4, 6);
        this.birthDate = personBirdYear(egn) + "-" + month + "-" + date;

    }

    private void setEgn(String egn) {
        if (egn.length() == 10 && containsOnlyDigits(egn)) {
            this.egn = egn;
        } else {
            throw new RuntimeException("The provided EGN is not Valid! The EGN must contain only 10 digits!");
        }
    }

    private void setSex(String sex) {
        try {
            validateSex(sex);
            this.sex = sex;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public void setHasJob(Boolean hasJob) {
        this.hasJob = hasJob;
    }

    public void setJobTitle() {
        this.jobTitle = jobTitle;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    private String getNationality(){
        return nationality;
    }

    public String getCountry() {
        return country;
    }

    private boolean containsOnlyDigits(String egn) {
        try {
            if (egn.contains("-") || egn.contains("+")) {
                return false;
            }
            Long.parseLong(egn);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    private String personBirdYear(String egn) {
        String secondPartOfBirthYear = egn.substring(0, 2);
        String month = egn.substring(2, 4);
        String birthYear;

        if (month.startsWith("4") || month.startsWith("5")) {
            birthYear = "20" + secondPartOfBirthYear;
        } else {
            birthYear = "19" + secondPartOfBirthYear;
        }
        return birthYear;
    }

    private void validateSex(String sex) throws Exception {
        String male = "Male";
        String female = "Female";

        if (!sex.equalsIgnoreCase(male) && !sex.equalsIgnoreCase(female)) {
            throw new Exception("Please provide a valid value for sex. Valid options are 'male' or 'female'.");
        }
    }

    public void SayHello() {
        if (language.equalsIgnoreCase("Italian")) {
            System.out.println("Ciao!");
        } else if (language.equalsIgnoreCase("English")) {
            System.out.println("Hello!");
        } else if (language.equalsIgnoreCase("Bulgarian")) {
            System.out.println("Здравей!");
        }
    }

    public void celebrateEaster() {
        if (religion.equalsIgnoreCase("Orthodox") || religion.equalsIgnoreCase("Catholic")) {
            System.out.println("I celebrate Easter!");
        } else {
            System.out.println("I not celebrate Easter!");
        }
    }

    public boolean canTakeLoan() {
        return hasJob;
    }

    public boolean isAdult() {
        switch (country) {
            case "Bulgaria":
            case "Italy":
                return age >= 18;

            case "USA":
                return age >= 21;
            default:
                throw new RuntimeException("Has not information about " + country);
        }
    }
}

