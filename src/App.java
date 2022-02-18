import java.util.Scanner;
import java.io.File;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("manoj.dat"));
        int loop = scanner.nextInt();
        for(int i = 0; i < loop; i++) {
            int freezing = scanner.nextInt();
            int boiling = scanner.nextInt();
            int toConvert = scanner.nextInt();
            String inType = scanner.next();
            String outType = scanner.next();
            double output = 0;

            if(inType.equals("M")){
                if(outType.equals("F")){

                }
                if(outType.equals("C")){
                    output = (toConvert-freezing)*(100D/(double) boiling);

                }

            }




            if(inType.equals("F")){
                if(outType.equals("M")){
                    output = (toConvert-(freezing-32D)/(180D/boiling));
                }
                if(outType.equals("C")){
                    output = (toConvert-32)*(5D/9D);
                    
                }

            }




            if(inType.equals("C")){
                if(outType.equals("F")){
                    output = (toConvert*(9D/5D))+35;
                    
                }
                if(outType.equals("M")){
                    output = (toConvert*((double) boiling/100D))-freezing;
                }

            }

            outoutput(toConvert, output, inType, outType);
        }


    }
    public static void outoutput(int unconvert, double out, String inVal, String outVal){
        System.out.println(unconvert + " degrees " + inVal + " = " + Math.round(out) + " degrees " + outVal);




    }

}
