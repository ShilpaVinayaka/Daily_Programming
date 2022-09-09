public class Validator extends UserInterface{
 public static boolean validatePetrolUsage(int petrol) throws PetrolOverflowException {
 boolean flag = false;
 Validator obj = new Validator();
 if (petrol <= 120) {
 flag = true;
 } else {
 throw new PetrolOverflowException("Petrol Tank Overflow");
 
 }
 return flag;
 }
}
