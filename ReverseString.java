public class ReverseString {

    public static void main (String[] args){

        String a = reverse("Thibahar");
        System.out.println(a);
    }

    public static String reverse(String input){
        //Char Array size set to the length of the string input 
        char[] letters = new char[input.length()];
        int count = 0;

        //For loop to iterate over the string, however set to iterate from right to left as it takes the size of the String -1.
        for(int i = input.length() - 1; i >= 0; i--) {
            letters[count] = input.charAt(i);
            count++;
            //Count incremented to ensure it is updated to array in right order.
        }

        String finalReversed = String.valueOf(letters); 
        return finalReversed;
    }
    
}
