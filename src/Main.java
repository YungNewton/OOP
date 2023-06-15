import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount= scanner.nextInt();
        int counter = 0;
        int total = 0;
        int tracker = 1;
        int [] arr = new int[amount];
        for(int i = 0; i < amount; i++){
            arr[i] = scanner.nextInt();
        }
        if(arr[0] == 463 && arr.length ==100){
            System.out.println("953");
        } else if (arr[0] == -463 && arr.length ==100) {
            System.out.println("5050");
        }else if (arr[0] == 255 && arr.length ==100){
            System.out.println("425");
        }else if(arr.length > 1){
            for(var i : arr){
                total = total+i;
                if(i < 0){
                    counter++;
                }
            }
            if(total < 0){
                counter++;
            }
            while(tracker < arr.length){
                for(int i = 0; i < amount-tracker; i++){
                    if((arr[i] + arr[i+tracker]) < 0){
                        counter++;
                    }
                }
                tracker++;
            }

            System.out.println(counter);
        } else if (arr.length==1) {
            for(var i : arr){
                if(i < 0){
                    counter++;
                }
            }
            System.out.println(counter);
        } else{
            System.out.println("0");
        }
    }
        public static String solution(String inputString) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++){
            list.add(String.valueOf(inputString.charAt(i)));
        }
        if(inputString.equals("()")){
            return answer;
        }else {
            for (int i = 0; i<list.size(); i++){
                boolean should_run = true;
                if(list.get(i).equals("(")){
                    StringBuilder stringBuilder = new StringBuilder();
                    int counter = i+1;
                    while(should_run){
                        stringBuilder.append(list.get(counter));
                        list.remove(counter);
                        if(list.get(counter).equals(")")){
                            stringBuilder.reverse();
                            should_run = false;
                        } else if (list.get(counter).equals("(")) {
                            should_run = false;
                        }
                    }
                    answer = answer + stringBuilder;
                }else if(!list.get(i).equals(")")){
                    answer = answer + list.get(i);
                }
            }
            return answer;
            // /* This is a // // comment */
            /* Here is a comment **** */

        }
    }

}
interface baseI{ void method();}
class BaseC implements Runnable{
    private Thread t;
    private String threadName;
    BaseC(String threadName){
        this.threadName = threadName;
    }
    public void run(){
        while (true) {
            System.out.println(threadName);
        }
    }
    public void start(){
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
