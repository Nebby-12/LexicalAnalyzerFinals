public class main {

    public static boolean isalnum(char val){
        return (val >= 'a' && val <= 'z') || (val >= 'A' && val <= 'Z') || (val >= '0' && val <= '9');
    }

    public void lexicalSolver(char word[]){
        int start = 0;
        int end = 0;
        int peek = 0;
        String value = "";

        for(int i = 0; i< word.length; i++){
            start = i;
            end = i;
            if (isalnum(word[i])) {
                peek = end + 1;
                if 
            }
        }
    }

    public static void main(String[] args) {

    }
}
