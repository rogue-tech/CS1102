public class brain {

	public static void main(String[] args) {
       /*
        * display loops hurt my brain 2 times
        */
        /*
         * For loop
         */
         System.out.println("for loop----------");
         String hurts = "Loops hurt ";
         String brain = " my brain";
         for (int x = 1; x <= 2; x++) {
            System.out.print(hurts);
            System.out.println(brain);
         }
         /*
          * while loop
          */
          System.out.println("while loop----------");
          int num = 1;
          while (num <= 2) {
            System.out.print(hurts);
            System.out.println(brain);
            num++;
          }
          /*
           * do while loop
           */
          System.out.println("do while loop----------");
          int x = 0;
          do{
            System.out.print(hurts);
            System.out.println(brain);
            x++;
          }while(x != 2);
    }
    
}
