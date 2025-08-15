//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String originalString = "Infosys";
        String temp = "";

        for(int i=0;i<originalString.length();i++){
            int count =0;
            for(int j=0;j<originalString.length();j++){
                if(originalString.charAt(i)==originalString.charAt(j)){
                    temp= String.valueOf(originalString.charAt(i));
                    count++;
                }
            }
            System.out.println(originalString.charAt(i)+" "+count);
        }

    }
}