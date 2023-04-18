package Strings;

public class ReverseWords_2 {

    public static void reverse(char str[], int start, int end) {

        while(start<=end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    public static char[] reverseWordsAppr1(char str[]) {
        int wordbegin = -1;
        int i = 0;
        while(i<str.length){
            
            if(wordbegin == -1 && (str[i] != ' ')) {
                wordbegin = i;
            }
            if(wordbegin != -1 && ((i+1 == str.length)||(str[i+1] == ' ')  )) {     //if the OR sequence is wrong output is wrong
                reverse(str, wordbegin, i);
                wordbegin = -1;
            }
            i++;
        }

        reverse(str, 0, (str.length-1));
        return str;
    }

    public static String reverseWords(String S)
    {
        char[] str = S.toCharArray(); 
        int wordbegin = -1;
        int i = 0;
        while(i<str.length){
            
            if(wordbegin == -1 && (str[i] != ' ')) {
                wordbegin = i;
            }
            if(wordbegin != -1 && ((i+1 == str.length)||(str[i+1] == ' ')  )) {     //if the OR sequence is wrong output is wrong
                reverse(str, wordbegin, i);
                wordbegin = -1;
            }
            i++;
        }

        reverse(str, 0, (str.length-1));
        
        // String string = new String(str);
        
        return String.valueOf(str);    
        
    }

    public static void main(String[] args) {
        String Str = "I like this Page";
        char arr[] = reverseWordsAppr1(Str.toCharArray());
        
        System.out.println(arr);


        System.out.println(reverseWords(Str));
    }
}
