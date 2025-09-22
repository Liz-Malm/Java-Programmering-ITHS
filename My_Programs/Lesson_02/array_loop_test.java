package my_programs.lesson_02;
public class array_loop_test {
    public static void main(String[] args) {
       String[] list = {"Liz", "Anna", "Susanne", "Lars", "Karl"};

       for (int i = 0; i < list.length; i++) {
           System.out.println(""" 

             """ + (list[i]) + """

           """);
           try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
       }
    }
}