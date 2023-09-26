import java.util.Scanner;

public class PemilihanPercobaan119_1 {
    public static void main(String[] args) {
      Scanner input19 = new Scanner(System.in);
      
      System.out.println("Masukkan nilai:  ");
      int nilai = input19.nextInt();
      if (nilai < 75 ){
          System.out.println("Harus Remidi!!!");
      }
      else if (nilai <= 75){
          System.out.println("Selamat nilai anda mencukupi");
  }
}
}
    
