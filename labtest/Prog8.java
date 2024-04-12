import java.util.Scanner;

class HrsException extends Exception {
    public String toString() {
        return "Hours cannot be greater than 24";
    }
}

class MinException extends Exception {
    public String toString() {
        return "Minutes cannot be greater than 60";
    }
}

class SecException extends Exception {
    public String toString() {
        return "Seconds cannot be greater than 60";
    }
}

class Time {
    int h, m, s;
    Time() {
        h = 0; m = 0; s = 0;
    }
    public void getTime(int h, int m, int s) throws HrsException, MinException, SecException{
        if (h > 24) {
            throw new HrsException();
        }
        if (m > 60) {
            throw new MinException();
        }
        if (s > 60) {
            throw new SecException();
        }
        this.h = h;
        this.m = m;
        this.s = s;
    }

}

public class Prog8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Time t = new Time();
        System.out.println("Enter Hours, Minutes, Seconds");
        int h;
        int m;
        int sec;
        h = s.nextInt();
        m = s.nextInt();
        sec = s.nextInt();
        try {
            t.getTime(h, m, sec);
        } catch (HrsException e) {
            System.out.println(e);
        }  catch (MinException e) {
            System.out.println(e);
        }  catch (SecException e) {
            System.out.println(e);
        } 
    }   
}
