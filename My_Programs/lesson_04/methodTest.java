package my_programs.lesson_04;

public class methodTest {
    public static void main(String[] args) {

        double distanceInKimometer = milesToKilometers();
        
    }



    static double milesToKilometers(){
        double miles = 100;
        double kilometers = miles * 1.609344;
        return kilometers;
    }   
}
