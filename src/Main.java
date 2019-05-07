public class Main {

    public static void main(String[] args)
    {
        CharSequence chars = new MyChar("YesYesYes");

        System.out.println(chars);
        System.out.println(chars.charAt(7));
        System.out.println(chars.length());

        CharSequence sub = chars.subSequence(0, 5);
        System.out.println(sub);


    }
}
