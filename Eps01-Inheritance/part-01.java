class Calculation {
      int z;

      public void addition(int x, int y){
            z = x + y;
            System.out.println("   Hasil   : " + z);
      }

      public void Subtraction(int x, int y){
            z = x - y;
            System.out.println("   Hasil   : " + z);
      }

}


class My_Calculation extends Calculation {
      public void multiplication(int x, int y){
            z = x * y;
            System.out.println("   Hasil   : " + z);
      }


      // public static void main(String[] args) {
      //    int a = 20, b = 10;
      //    My_Calculation app = new My_Calculation();
      //    app.addition(a, b);
      //    app.Subtraction(a, b);
      //    app.multiplication(a, b);
      // }

      public static void main(String[] args) {
            Calculation app = new My_Calculation();
            app.addition(10, 20);
      }

}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Dasar Inheritance (Turunan)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/