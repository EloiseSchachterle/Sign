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
    public String getLines(){
        int num = text.length() / (text.length()/width);
        for (int i = 0; i != text.length()/width; i++){

        }
    }
}
