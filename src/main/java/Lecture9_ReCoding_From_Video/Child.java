package Lecture9_ReCoding_From_Video;

public class Child extends Person {

    public Child(String name, String egn, String religion, String language, String nationality, String country, Boolean hasJob, String jobTitle, String sex) {
        super(name, egn, religion, language, nationality, country, hasJob, jobTitle, sex);
    }

    @Override
    public boolean isAdult() {
        System.out.println("The child is not adult.");
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        System.out.println("The child can not take a loan.");
        return false;
    }

    public boolean setHasJob(boolean hasJob) {
        throw new IllegalArgumentException("The child can`t work.");
    }

    public void play (String toy){
        System.out.println("I am playing with " + toy);
    }

}
