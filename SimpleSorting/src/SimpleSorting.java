import java.util.Scanner;
/**
 *
 * @author M. Irfan Luthfi
 */
public class SimpleSorting {
    
    private static String deretAngka = "";
    
    private static String getMasukan(){
        Scanner inputs = new Scanner(System.in);
        return inputs.nextLine();
    }
    
    private static String sorting(String deretAngkaX){
        String result = "";
        int alpha = 0, beta = 0, looping = 1;
        String[] dataAngka = deretAngkaX.split(" ");
        
        while(looping > 0){
            looping = 0;
            for(int i = 0; i < dataAngka.length; i++){
                if(i != dataAngka.length - 1){
                    alpha = Integer.parseInt(dataAngka[i]);
                    beta = Integer.parseInt(dataAngka[i + 1]);
                    
                    if(alpha > beta){
                        dataAngka[i] = String.valueOf(beta);
                        dataAngka[i + 1] = String.valueOf(alpha);
                        looping++;
                    }
                }
                else{
                    i++;
                }
            }
        }
        
        for(int a = 0; a < dataAngka.length; a++){
            result = result + dataAngka[a] + " ";
        }
        return result;
    }
    
    public static void main(String[] args){
        System.out.println("Program Sorting Sederhana");
        System.out.println("Masukkan deret angka (pisahkan dengan spasi): ");
        deretAngka = getMasukan();
        deretAngka = sorting(deretAngka);
        System.out.println("Hasil sorting adalah: \n" + deretAngka);
        System.out.println("");
    }
}