public class Broken {
   public void run(String[] args) {
      for (String arg : args) {
         System.out.println(arg);
      }
   }

   public static void main(String[] args) {
      System.out.println("This is a great class.");
      new Broken().run(args);
   }
}
