public class Vergleich2 {
    public static void main(String[] args) {
      System.out.println("Vergleich.java");
    
      System.out.println("1. Zahl");
      int zahl1 = Tastatur.leseZahl();
    
      System.out.println("2. Zahl");   
      int zahl2 = Tastatur.leseZahl();
    
      if (zahl1 < zahl2) {
        System.out.println("Gr��erer Wert: " + zahl2);
      }
      else if (zahl1 > zahl2) {
        System.out.println("Gr��erer Wert: " + zahl1);
      }
      else {
        System.out.println("Zahlen sind gleich gro�.");
      }
      System.out.println("Programmend");
    }
}
