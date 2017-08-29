/**
 * Created by Khalil Jones on 8/28/2017.
 */
public class RecursionTest {

    public static void main(String[] args){
        RecursionTest r = new RecursionTest();
        int xCount = r.countX("141415215346543623622xx");
        System.out.println(xCount);

    }
    private int count = 0;
    int xCount = 0;
  private int countX(String str) {

        int stringLength = str.length();


        if(count < stringLength){
            if(str.charAt(count) == 'x'){
                xCount++;
            }
            count++;
            countX(str);
        }
        else{
            return xCount;
        }
        return xCount;
    }
}

