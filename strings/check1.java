public class check1 {
    public static void main(String[] args) {
        String s = new String("Suket");
        s.concat("Kamboj");
        s = s.concat("!@#$");
        System.out.println(s);
        StringBuffer sbf = new StringBuffer("Suket");
        sbf.append("Kamboj");
        System.out.println(sbf);
        StringBuilder sbd  = new StringBuilder("Suket");
        sbd.append("Kamboj");
        System.out.println(sbd);
    }
}