//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sign a =  new Sign("abcdefghij", 2);
        a.getLines();
        System.out.println();
        System.out.println(a.numberOfLines());
        String str;
        Sign sign1 = new Sign("ABC222DE", 3);
        sign1.getLines();
        System.out.println();
        Sign sign2 = new Sign("ABCD", 10);
         sign2.getLines();
        Sign sign3 = new Sign("ABCDEF", 6);
        System.out.println(sign3.numberOfLines());
        sign3.getLines();
        Sign sign4 = new Sign("",4);
        sign4.numberOfLines();
        Sign sign5 = new Sign("AB_CD_EF",2);
        System.out.println(sign5.numberOfLines());
        sign5.getLines();

    }
}
