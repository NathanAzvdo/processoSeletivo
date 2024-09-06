

public class Main {
    public static void main(String[] args) {
        String text = "Sera um prazer trabalhar na target:)";
        int repeat = countLetterA(text);
        System.out.print("A letra A repete "+ repeat + " vezes.");


        
        
    }
    public static int countLetterA(String text){
        int repeat = 0;
        for(int i=0; i<text.length(); i++){
            char letter = text.charAt(i);
            if(String.valueOf(letter).equalsIgnoreCase("a")){
                repeat++;
            }
        }
        return repeat;
    }
}