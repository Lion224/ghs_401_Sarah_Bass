
public class hamburgerDriver
{
    public static void main() {
        //make one instance(object) of the hamburger class
        Hamburger hamburger1 = new Hamburger();
        Hamburger hamburger3 = new Hamburger(true, 3, "pepper jack");
        Hamburger hamburger4 = new Hamburger(false, 1, "montery jack");
        //print the two string of that object
        System.out.println(hamburger1.toString());
        System.out.println(hamburger3.toString());
        System.out.println(hamburger4.toString());
    }
}
