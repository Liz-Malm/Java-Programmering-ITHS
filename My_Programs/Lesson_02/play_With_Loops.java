package my_programs.lesson_02;
public class play_With_Loops {
    public static void main(String[] args) {
       forLoop();
       whileLoop();
    }   
    public static void forLoop() {
        System.out.println("""
            
        This was done by a for loop!
        """);
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("");
    }
    public static void whileLoop() {
        int count = 11;
        System.out.println("""
            
        And this was done with a while loop!
        """);
        
        while (count <= 20){
            System.out.print(" " + count + " ");
            count++;
            try {
                Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
        System.out.println("");

    }
} 