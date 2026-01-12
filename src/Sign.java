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
        for (int i = 0; i < num; i++){
            int k = width * i;
            System.out.print(text.substring(k, k + width) + ";");
        }

    }
}

