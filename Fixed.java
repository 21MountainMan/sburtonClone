public class Fixed implements Runnable {
   @Override
   public void run(String[] args) {
      for (int i = 0; i < 100; i++) {
         System.out.println(i);
      }
   }

   public static void main(String[] args) {
      new Fixed().run(args);
   }
}
