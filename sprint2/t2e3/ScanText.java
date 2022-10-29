package t2e3;

import java.util.Scanner;

public class ScanText {

    public void ScanText() {
        Scanner sc = new Scanner(System.in);
        String text;
        Counter counter = new Counter();
        int sadcount;
        int happycount;
        System.out.println("Digite texto a ser escaneado: ");
        text = sc.next();
        sadcount=counter.phraseCounterSad(text);
        happycount=counter.phraseCounterHappy(text);
        if (happycount > sadcount){
            System.out.println("Divertido");
        } else if (sadcount > happycount){
            System.out.println("Chateado");
        } else {
            System.out.println("Neutro");
        }
        
    }

}
