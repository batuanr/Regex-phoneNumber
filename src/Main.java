public class Main {
    public static void main(String[] args) {
        Regex regex = new Regex();
        String[] strings = new String[] {"(85)-(0456736746)", "(85)-(2456736746)", "(85)-(0456736746)", "(t5)-(0456736746)"};
        for (String s: strings){
            boolean is = regex.check(s);
            System.out.println(is);
        }
    }
}
