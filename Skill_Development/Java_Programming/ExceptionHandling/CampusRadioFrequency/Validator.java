public class Validator extends UserInterface{
 public static boolean validateStation(float freq) throws StationNotAvailableException {
 boolean flag = false;
 if (freq == 91.2f || freq == 93.5f || freq == 98.9f || freq == 109.4f)
 flag = true;
 else{
 throw new StationNotAvailableException("Radio Station not available");
}
 return flag;
 }
}
