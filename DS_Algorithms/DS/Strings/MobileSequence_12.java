package Strings;

public class MobileSequence_12 {

    public static String mobileSeq(String str, String index[]) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i) == ' ')
                output += 0;

            else {
              
                int pos = str.charAt(i) - 'A';
                output += index[pos];
            }

        }
        return output;
    }

    public static void main(String[] args) {
            String index[]
            = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };

        String input = "GEEKSFORGEEKS";  
        
        System.out.println(mobileSeq(input, index));
        System.out.println(mobileSeq("ABC", index));
        System.out.println(mobileSeq("APXS", index));
    
    }
}
