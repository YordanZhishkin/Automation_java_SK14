package Lecture9_ReCoding_From_Video;

public class Exercise {
    public static void main(String[] args) {
        Person yordan = new Person("Yordan", "9608012554", "Orthodox", "Bulgarian", "Bulgarian",
                "Bulgaria", true, "Technician", "male");
//        System.out.println(yordan.getCountry());
//        System.out.println(yordan.getSex());
//        System.out.println(yordan.getAge());
//        System.out.println(yordan.getBirthDate());
//        yordan.setCountry("Italy");
//        System.out.println(yordan.getCountry());
//        yordan.SayHello();
//        yordan.celebrateEaster();
//        System.out.println("Can take a loan: " + yordan.canTakeLoan());
//        System.out.println("It is adult: " + yordan.isAdult());
//        System.out.println("Child part");
//        Child kid = new Child("Martin", "5021523614","Orthodox", "Bulgarian", "Bulgarian",
//                "Bulgaria", false, null, "male");
//
//
//        kid.SayHello();
//        System.out.println("Can take a loan " + kid.canTakeLoan());
//        System.out.println("Is adult " + kid.isAdult());
//        kid.celebrateEaster();
//        kid.play("laptop");
//        kid.play("robot");
//        kid.setHasJob(true);

        Bulgarian gosho = new Bulgarian("Gosho", "5512125847", "Orthodox", "Bulgarian", "Bu",
                "zxxfs", false, null, "male" );
        System.out.println(gosho.getBirthDate());
        System.out.println(gosho.getCountry());
        System.out.println(gosho.getAge());
        System.out.println(gosho.getSex());
        gosho.IsDrinking("Rakiya");
        gosho.setCountry("Bulgaria");
        System.out.println(gosho.getCountry());
        gosho.SayHello();
        gosho.celebrateEaster();
        System.out.println("Can take a loan: " + gosho.canTakeLoan());
        System.out.println("Is adult: " + gosho.isAdult());



    }
}
