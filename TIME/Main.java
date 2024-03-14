package PROJECT.TIME;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ENTER AN HOUR ");
        int hour = Integer.parseInt(br.readLine());

        System.out.println("ENTER AN MINUTE");
        int minute = Integer.parseInt(br.readLine());

        System.out.println("ENTER AN SECOND");
        int second = Integer.parseInt(br.readLine());

        System.out.println("TIME IS ");
        Time time =  new Time(hour, minute, second);
        System.out.println(time.toString());
    }
}
