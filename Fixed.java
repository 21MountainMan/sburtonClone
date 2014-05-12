public class Fixed implements Runnable {
   @Override
   public void run() {
      for (int i = 0; i < 100; i++) {
         System.out.println(i);
      }
   }

   public static void main(String[] args) {
      System.out.println("This is a great class.");
   }
}
