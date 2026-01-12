//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sign a =  new Sign("abcdefghijk", 2);
        a.getLines();
        System.out.println();
        System.out.println(a.numberOfLines());
    }
}
