package my_programs.lesson_03;
public class makeUnicorns{
    public static void main(String[] args) {
        
        Unicorn bengt = new Unicorn(32, "orange", "vibe", true, true);
        Unicorn glen = new Unicorn(64, "green", "mad", false, true);

        System.out.println("\nThis is Bengt: ");
        System.out.println(bengt.color);
        bengt.color = "blue";


        System.out.println("\nThis is Glen: ");
        System.out.println(glen.age);

        if (bengt.horn=true){
            System.out.println("Yes! He does!");
        } else {
            System.out.println("No! He's just a normal horse!");
        }




    }

}