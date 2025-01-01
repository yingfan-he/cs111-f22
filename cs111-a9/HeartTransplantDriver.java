/**
 * 
 * HeartTransplantDriver
 * 
 * Use this class to test HeartTransplant's methods.
 * 
 * @author Haolin (Daniel) Jin
 */

public class HeartTransplantDriver {
	    public static void main (String[] args) {

        HeartTransplant ht = new HeartTransplant();

        // Initialize Patients.
        int numberOfLines = StdIn.readInt();
        ht.readPatients(numberOfLines);
        StdOut.println(ht.getPatients().length + " patients read from file.");
 
        // Initialize SurvivabilityByAge.
        numberOfLines = StdIn.readInt();
        ht.readSurvivabilityByAge(numberOfLines);
        StdOut.println(ht.getSurvivabilityByAge().getDataSize() + " survivability rates by age lines read from file.");

        // Initialize SurvivabilityByCause.
        numberOfLines = StdIn.readInt();
        ht.readSurvivabilityByCause(numberOfLines);
        StdOut.println(ht.getSurvivabilityByCause().getDataSize() + " survivability rates by cause lines read from file.\n");

        // Prints all patients.
        StdOut.println("ALL patients: ");
        for (Patient p : ht.getPatients()) {   
            StdOut.println(p);
        }
        StdOut.println();

        // Prints survivability by age data.
        StdOut.println("Survivability By Age: ");
        ht.getSurvivabilityByAge().printAllData();
        StdOut.println();

        // Prints survivability by cause data.
        StdOut.println("Survivability By Cause: ");
        ht.getSurvivabilityByCause().printAllData();
        StdOut.println();

        // Prints all patients with age above 18.
        StdOut.println("Patients above age 18: "); 
        Patient patientsByAge[] = ht.getPatientsWithAgeAbove(18);
        for (Patient p : patientsByAge ) {   
            StdOut.println(p.toString() );
        }
        StdOut.println();

        // Prints all patients whose heart disease was caused by accident.
        StdOut.println("Patients whose heart disease was caused by accidents: ");
        Patient patientsByCause[] = ht.getPatientsByHeartConditionCause(Patient.CAUSE_ACCIDENT);
        for (Patient p : patientsByCause) {
            StdOut.println(p.toString() );
        }
        StdOut.println();

        // Prints 4 patients with the highest likelihood of survival post transplant.
        StdOut.println("TOP 4 PATIENTS with highest potential for survivability: ");
        for( int i = 0; i < 4; i++) {
            StdOut.println( ht.getPatientForTransplant().toString() );


            // MY OWN TESTING
           // StdOut.println("Patients with Urgency level of 8: ");
        // StdOut.println(ht.getPatientsByUrgency(8));
       // StdOut.println();

        /**  Prints all patients with Urgency of 8. TEST CASE 3b
        StdOut.println("Patients with urgency of 8: "); 
        Patient patientsByUrgency[] = ht.getPatientsByUrgency(8);
        for (Patient p : patientsByUrgency ) {   
            StdOut.println(p.toString() );
        }
        StdOut.println();

        // Prints all patients with Urgency of 9. TEST CASE 3b
        StdOut.println("Patients with urgency of 9: "); 
        Patient patientsByUrgency9[] = ht.getPatientsByUrgency(9);
        for (Patient p9 : patientsByUrgency9 ) {   
            StdOut.println(p9.toString() );
        }
        StdOut.println();

        // Prints all patients with age above 69. TEST CASE 2b
        StdOut.println("Patients above age 69: "); 
        Patient patientsByAge69[] = ht.getPatientsWithAgeAbove(69);
        for (Patient p1 : patientsByAge69 ) {   
            StdOut.println(p1.toString() );
        }
        StdOut.println();

        // Prints all patients whose heart disease was caused by a null (600) TEST CASE 4a
      //  StdOut.println("Patients whose heart disease was caused by null 600: ");
      //  Patient patientsByNullCause[] = ht.getPatientsByHeartConditionCause(600);
     //   for (Patient p2 : patientsByNullCause) {
          //  StdOut.println(p2.toString() );
       }
        StdOut.println();

        // Prints all patients whose heart disease was caused by cause 1 TEST CASE 4b
        StdOut.println("Patients whose heart disease was caused by cause 1: ");
        Patient patientsBy1Cause[] = ht.getPatientsByHeartConditionCause(1);
        for (Patient pBenis : patientsBy1Cause) {
            StdOut.println(pBenis.toString() );
        }
        StdOut.println();

        // Prints all patients whose heart disease was caused by cause 0 TEST CASE 4b
        StdOut.println("Patients whose heart disease was caused by cause 0: ");
        Patient patientsBy0Cause[] = ht.getPatientsByHeartConditionCause(0);
        for (Patient pBeter : patientsBy0Cause) {
            StdOut.println(pBeter.toString() );
        }
        StdOut.println();
*/

        
        }
    }
        }
    
    