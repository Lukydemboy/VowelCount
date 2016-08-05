/**
 * Created by lukas on 4/08/2016.
 */
public class KlinkerTeller {

    private static String zin;

    public KlinkerTeller(String zin){
        this.zin = zin;
    }

    public static void main(String[] args) {

        KlinkerTeller tel = new KlinkerTeller("Beetje fel doen");

        int klinkers = 0;

        for (String retval: zin.split(" ")){
            for(int i = 0; i < retval.length(); i++){
                char ch = retval.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    klinkers++;
                }
            }
        }
       System.out.println(klinkers);



    }
}
