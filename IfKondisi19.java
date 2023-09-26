import java.util.Scanner;

public class IfKondisi19 {

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);

        System.out.println("Masukkan Suhu  : ");
        int suhu = sc19.nextInt();

        if (suhu<16){
            System.out.println("Silakan menggunakan jaket");
        }
        if (suhu<20){
            System.out.println("Silakan pakai baju tebal");
        }
        else{
            System.out.println("Silakan pakai topi");
        }
    }
}