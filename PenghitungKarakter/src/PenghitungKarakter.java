import java.util.Scanner;
/**
 *
 * @author M. Irfan Luthfi
 */
public class PenghitungKarakter {
    
    private static String kalimat = "";
    private static char[] extractKalimat;
    private static String cari = "";
    
    private static String getMasukan(){
        Scanner alpha = new Scanner(System.in);
        return alpha.nextLine();
    }
    
    private static int counterKarakter(String kalimatx, String karaktery){
        int total = 0;
        extractKalimat = kalimatx.toCharArray();
        for(int i = 0; i < extractKalimat.length; i++){
            if(String.valueOf(extractKalimat[i]).equalsIgnoreCase(karaktery)){
                total++;
            }
        }
        return total;
    }
    
    public static void main(String[] args){
        System.out.println("Program Penghitung Karakter Dalam Kalimat (Java)");
        System.out.print("Masukkan kalimat: ");
        kalimat = getMasukan();
        System.out.print("Masukkan karakter yang dicari: ");
        cari = getMasukan();
        System.out.println("Jumlah karakter " + cari + " dalam kalimat " + kalimat + " adalah sebanyak: " + counterKarakter(kalimat, cari) + " karakter.");
    }
}