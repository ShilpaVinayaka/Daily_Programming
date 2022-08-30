import java.util.Scanner;
public class Main
{
    public static Doctor createDoctorDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Hospital Name");
        String hospitalName = sc.next();
        
        System.out.println("Enter Contact Number");
        long contactNumber = sc.nextLong();
        
        System.out.println("Enter City");
        String city = sc.next();
        
        System.out.println("Enter Doctor Id");
        String doctorId = sc.next();
        
        System.out.println("Enter Doctor Name");
        String doctorName = sc.next();
        
        System.out.println("Enter Specialization");
        String specialization = sc.next();
        
        Hospital obj1 = new Hospital(hospitalName, contactNumber, city);
        obj1.setHospitalName(hospitalName);
        obj1.setContactNumber(contactNumber);
        obj1.setCity(city);
        
        Doctor obj = new Doctor(doctorId, doctorName, specialization, obj1);
        obj.setDoctorId(doctorId);
        obj.setDoctorName(doctorName);
        obj.setSpecialization(specialization);
        obj.setHospital(obj1);
        
        return obj;
        
    }
    
	public static void main(String[] args) {
	    
	    Doctor obj = createDoctorDetails();
	    
	    System.out.println("Doctor id:"+obj.getDoctorId());
	    System.out.println("Doctor name:"+obj.getDoctorName());
	    System.out.println("Specialization:"+obj.getSpecialization());
	    System.out.println("Hospital Name:"+obj.getHospital().getHospitalName());
	    System.out.println("Contact Number:"+obj.getHospital().getContactNumber());
	    System.out.println("City:"+obj.getHospital().getCity());       
	    
	}
}
