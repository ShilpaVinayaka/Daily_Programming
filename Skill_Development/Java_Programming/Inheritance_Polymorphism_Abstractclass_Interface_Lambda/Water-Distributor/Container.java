public class Container {
     private String distributorName;
     private int volume;
     private int count;

     public Container(String distributorName, int volume, int count) {
       super();
       setDistributorName(distributorName);
       setVolume(volume);
       setCount(count);
     }

     public String getDistributorName() {
      return distributorName;
     }
     public void setDistributorName(String distributorName) {
      this.distributorName = distributorName;
     }

     public int getVolume() {
     return volume;
     }
     public void setVolume(int volume) {
     this.volume = volume;
     }

     public int getCount() {
     return count;
     }
     public void setCount(int count) {
     this.count = count;
     }
}
