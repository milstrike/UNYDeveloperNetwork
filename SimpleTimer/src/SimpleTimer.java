
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author M. Irfan Luthfi
 */
public class SimpleTimer {
    private static int detik = 0;
    private static int menit = 0;
    private static int jam = 0;
    
    private static String viewDetik = "";
    private static String viewMenit = "";
    private static String viewJam = "";
    
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
    
    private static void getInput(int chooser){
        int done = 0;
        switch(chooser){
            case 1:
                while(done < 1){
                    try{
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Masukkan Jam: ");
                        jam = sc.nextInt();
                        done = 1;
                    }
                    catch(Exception e){
                        System.out.println("Masukan harus angka!");
                    }
                }
                break;
            case 2:
                while(done < 1){
                    try{
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Masukkan Menit: ");
                        menit = sc.nextInt();
                        done = 1;
                    }
                    catch(Exception e){
                        System.out.println("Masukan harus angka!");
                    }
                }
                break;
            case 3:
                while(done < 1){
                    try{
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Masukkan Detik: ");
                        detik = sc.nextInt();
                        done = 1;
                    }
                    catch(Exception e){
                        System.out.println("Masukan harus angka!");
                    }
                }
                break;
        }
    }
    
    private static void drawScreen(int numbers, int line){
        switch(numbers){
            case 1: 
                switch(line){
                    case 1:
                            System.out.print("   |||");
                        break;
                    case 2:
                            System.out.print("  ||||");
                        break;
                    case 3:
                            System.out.print("    ||");
                        break;
                    case 4:
                            System.out.print("    ||");
                        break;
                    case 5:
                            System.out.print("    ||");
                        break;
                }
                break;
            case 2: 
                switch(line){
                    case 1:
                            System.out.print("||||||");
                        break;
                    case 2:
                            System.out.print("    ||");
                        break;
                    case 3:
                            System.out.print("||||||");
                        break;
                    case 4:
                            System.out.print("||    ");
                        break;
                    case 5:
                            System.out.print("||||||");
                        break;
                }
                break;
            case 3: 
                switch(line){
                    case 1:
                            System.out.print("||||||");
                        break;
                    case 2:
                            System.out.print("    ||");
                        break;
                    case 3:
                            System.out.print("  ||||");
                        break;
                    case 4:
                            System.out.print("    ||");
                        break;
                    case 5:
                            System.out.print("||||||");
                        break;
                }
                break;
            case 4: 
                switch(line){
                    case 1:
                            System.out.print("||  ||");
                        break;
                    case 2:
                            System.out.print("||  ||");
                        break;
                    case 3:
                            System.out.print("||||||");
                        break;
                    case 4:
                            System.out.print("    ||");
                        break;
                    case 5:
                            System.out.print("    ||");
                        break;
                }
                break;
            case 5: 
                switch(line){
                    case 1:
                            System.out.print("||||||");
                        break;
                    case 2:
                            System.out.print("||    ");
                        break;
                    case 3:
                            System.out.print("||||||");
                        break;
                    case 4:
                            System.out.print("    ||");
                        break;
                    case 5:
                            System.out.print("||||||");
                        break;
                }
                break;
            case 6: 
                switch(line){
                    case 1:
                            System.out.print("||||||");
                        break;
                    case 2:
                            System.out.print("||    ");
                        break;
                    case 3:
                            System.out.print("||||||");
                        break;
                    case 4:
                            System.out.print("||  ||");
                        break;
                    case 5:
                            System.out.print("||||||");
                        break;
                }
                break;
            case 7: 
                switch(line){
                    case 1:
                            System.out.print("||||||");
                        break;
                    case 2:
                            System.out.print("    ||");
                        break;
                    case 3:
                            System.out.print("    ||");
                        break;
                    case 4:
                            System.out.print("    ||");
                        break;
                    case 5:
                            System.out.print("    ||");
                        break;
                }
                break;
            case 8: 
                switch(line){
                    case 1:
                            System.out.print("||||||");
                        break;
                    case 2:
                            System.out.print("||  ||");
                        break;
                    case 3:
                            System.out.print("||||||");
                        break;
                    case 4:
                            System.out.print("||  ||");
                        break;
                    case 5:
                            System.out.print("||||||");
                        break;
                }
                break;
            case 9: 
                switch(line){
                    case 1:
                            System.out.print("||||||");
                        break;
                    case 2:
                            System.out.print("||  ||");
                        break;
                    case 3:
                            System.out.print("||||||");
                        break;
                    case 4:
                            System.out.print("    ||");
                        break;
                    case 5:
                            System.out.print("||||||");
                        break;
                }
                break;
            case 0: 
                switch(line){
                    case 1:
                            System.out.print("||||||");
                        break;
                    case 2:
                            System.out.print("||  ||");
                        break;
                    case 3:
                            System.out.print("||  ||");
                        break;
                    case 4:
                            System.out.print("||  ||");
                        break;
                    case 5:
                            System.out.print("||||||");
                        break;
                }
                break;
        }
    }
    
    public static void main(String[] args) throws InterruptedException{
        clearScreen();
        getInput(1);
        getInput(2);
        getInput(3);
        
        
        for(int a = jam; a >= 0; a--){
            for(int b = menit; b >= 0; b--){
                for(int i = detik; i >= 0; i--){
                    clearScreen();
                    if(detik < 10){
                        viewDetik = "0" + detik;
                    }
                    else{
                        viewDetik = ""+detik;
                    }
                    
                    if(menit < 10){
                        viewMenit = "0" + menit;
                    }
                    else{
                        viewMenit = "" + menit;
                    }
                    
                    if(jam < 10){
                        viewJam = "0" + jam;
                    }
                    else{
                        viewJam = "" + jam;
                    }
                    
                    char[] vJ = viewJam.toCharArray();
                    char[] vM = viewMenit.toCharArray();
                    char[] vD = viewDetik.toCharArray();
                    System.out.println("\n\n");
                    System.out.println("                 APLIKASI TIMER SEDERHANA JAVA               ");
                    System.out.println("              Ditulis oleh: Muhammad Irfan Luthfi            ");
                    System.out.println("                    github.com/milstrike                     ");
                    System.out.println("   ==========================================================");
                    System.out.println("   =                                                        =");
                    
                    for(int z = 1; z <= 5; z++){
                            if(z == 2){
                                System.out.print("   = ");
                                drawScreen((vJ[0] - '0'), z);
                                System.out.print("  ");
                                drawScreen((vJ[1] - '0'), z);
                                System.out.print("  ||  ");
                            
                                drawScreen((vM[0] - '0'), z);
                                System.out.print("  ");
                                drawScreen((vM[1] - '0'), z);
                                System.out.print("  ||  ");
                            
                                drawScreen((vD[0] - '0'), z);
                                System.out.print("  ");
                                drawScreen((vD[1] - '0'), z);
                                System.out.println(" =");
                            }
                            else if(z == 4){
                                System.out.print("   = ");
                                drawScreen((vJ[0] - '0'), z);
                                System.out.print("  ");
                                drawScreen((vJ[1] - '0'), z);
                                System.out.print("  ||  ");
                            
                                drawScreen((vM[0] - '0'), z);
                                System.out.print("  ");
                                drawScreen((vM[1] - '0'), z);
                                System.out.print("  ||  ");
                            
                                drawScreen((vD[0] - '0'), z);
                                System.out.print("  ");
                                drawScreen((vD[1] - '0'), z);
                                System.out.println(" =");
                            }
                            else{
                                System.out.print("   = ");
                                drawScreen((vJ[0] - '0'), z);
                                System.out.print("  ");
                                drawScreen((vJ[1] - '0'), z);
                                System.out.print("      ");
                            
                                drawScreen((vM[0] - '0'), z);
                                System.out.print("  ");
                                drawScreen((vM[1] - '0'), z);
                                System.out.print("      ");
                            
                                drawScreen((vD[0] - '0'), z);
                                System.out.print("  ");
                                drawScreen((vD[1] - '0'), z);
                                System.out.println(" =");
                            }
                    }
                    
                    System.out.println("   =                                                        =");
                    System.out.println("   = " + viewJam + ":" + viewMenit + ":" + viewDetik + "                                               =");
                    System.out.println("   = Untuk menghentikan timer, tekan CTRL + C               =");
                    System.out.println("   =                                                        =");
                    System.out.println("   ==========================================================");
                    
                    detik--;
                    if(detik < 0){
                        menit--;
                        detik = 59;
                        if(menit < 0){
                            jam--;
                            menit = 59;
                        }
                    }
                    TimeUnit.SECONDS.sleep(1);
        }
            }
        }
    }
}
