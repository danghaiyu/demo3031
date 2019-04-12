package po;

/**
 * @author DHY
 * @create 2019-03-31-13:56
 */
public class Sip {
    public static void main(String args[]){
        zipLetters("aaabbcaa");
        zipLetters("");


    }

    public static void zipLetters(String str){
        if (str==null|str==""){
            System.out.println("");
        }
        else if (str.length()==1){
            System.out.println(str);
        }
        else{

            StringBuffer outputStr = new StringBuffer();
            int counter = 1;
            char findPair = str.charAt(0);

            for (int i = 1; i<str.length(); i++){
                if (findPair == str.charAt(i)){
                    counter++;
                }
                else{
                    outputStr.append(findPair);
                    outputStr.append(counter==1?"" : counter);
                    counter = 1;
                    findPair = str.charAt(i);
                }
            }
            outputStr.append(findPair);
            outputStr.append(counter==1?"" : counter);
            System.out.println(outputStr);
        }
    }

}
