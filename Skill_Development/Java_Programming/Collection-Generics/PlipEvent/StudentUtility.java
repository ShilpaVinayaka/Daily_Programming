import java.util.*;
public class StudentUtility {
// private Map<String,Double> studentMap;
 private Map<String,Double> studentMap = new HashMap<String,Double>();
 
 public Map<String, Double> getStudentMap() {
 return studentMap;
 }
 public void setStudentMap(Map<String, Double> studentMap) {
 this.studentMap = studentMap;
 }
 public void addStudentDetails(String studentName,double score){
 studentMap.put(studentName, score);
 }
 
 public int filterStudentDetails(){
 int count = 0;
 for(Map.Entry<String,Double> set: studentMap.entrySet()){
 if(set.getValue()>90)
 count++;
 }
 return count;
 }
}
