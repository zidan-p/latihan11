
package latihanPBO;
import java.util.Scanner; //import Scanner

public class latihan11 {


    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a = 0, total = 0, bil = 7; // mendeklarasikan berserta memberi nilai pada variabel
        while (bil!=0){ //menggunakan perulangan while dengan syarat nilai bil tidak sama dengan 0
            a++; // stiap perulangan nilai a di tambah 1
                System.out.print("mauskan bilangan ke-"+a+" : "); //menampilkan kalimat dan nilai a yang menyuruh user untuk menginput nilai bilangan dengan urut
                bil = masukan.nextInt();    //memberi nilai bilangan daari keyboard
                total += bil;   // setiap perulangan nilai total di tambahkan dengan nilai bil
        }
        System.out.print("totla jumla "+(a-1)+" bilangan : "); //menampilkan kalimat beserta banyak bilangan yang di inputkan 
        System.out.println(total);  //menampilkan total bilangan yang di inputkan dari keybard
    }
    
}
