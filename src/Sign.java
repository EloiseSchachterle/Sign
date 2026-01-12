public class Sign {
    String text;
    int width;
    public Sign(String text, int width){
        this.text = text;
        this.width = width;
    }
    public int numberOfLines(){
        return text.length()/width;
    }
    public void getLines(){
        int num = numberOfLines();
        int x = 0;
        for (int i = 0; i < num - 1; i++){
            int k = width * i;
            System.out.print(text.substring(k, k + width) + ";");
            x = k;
        }
        if(text.length() % 2 == 0){
        System.out.println(text.substring(x + width));}
        else System.out.println(text.substring(x + width, x + width + 2) + ";" + text.substring(x + width + 2));

    }
}
