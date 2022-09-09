public class Validator extends UserInterface{
 public static boolean validateDataUsage(int data) throws MaximumDataUsageException {
 boolean flag = false;
 if (data <= 1024) {
 flag = true;
 } else {
 throw new MaximumDataUsageException("You need to pay extra charges");
 }
 return flag;
 }
}
