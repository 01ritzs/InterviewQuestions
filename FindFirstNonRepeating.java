
public class FindFirstNonRepeating{
    
    public static void main(String[] args) {
        String str = "GeeksOfGeeks";
        int index = -1;
        char fnc = ' ';
        if(str.length() == 0){
            System.out.println("Empty string");
        }

        for (char i : str.toCharArray()){
            if(str.indexOf(i) == str.lastIndexOf(i)){
                fnc = i;
                break;
            } else {
                index += 1;
            }
        }

        if(index == str.length()-1){
            System.err.println("All characters are repeating");
        } else {
            System.out.println("First non-repeating character is " + fnc);
        }

    }
}