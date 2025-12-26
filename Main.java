public class Main {
    public static void main(String[] args) {

        //PATIENT TEST
        System.out.println("PATIENT TEST");
        PatientList plist = new PatientList(); //obje oluşturuldu

        plist.addPatient(new Patient(101,"Tuğba AMANSIZ", 5, 24));
        plist.addPatient(new Patient(102, "Orhan GENCEBAY", 8,75));
        plist.addPatient(new Patient(103, "İbrahim TATLISES", 3,85));
        plist.addPatient(new Patient(104, "Ferdi TAYFUR", 6,58));
        plist.addPatient(new Patient(105, "Aleyna TİLKİ", 3,20));
        plist.printPatientList();

        plist.removePatient(101);

        //found objesi oluşturuldu
        Patient foundPatient = plist.findPatient(102);
        if (foundPatient != null) {
            System.out.println("Patient is found. " + foundPatient.toString());
        }
        else  {
            System.out.println("Patient not found.");
        }
        plist.printPatientList();

        //TREATMENT TEST
        System.out.println("TREATMENT TEST");
        TreatmentQueue queue = new TreatmentQueue();

        TreatmentRequest req1 = new TreatmentRequest(101, true);
        queue.enqueue(req1);
        TreatmentRequest req2 = new TreatmentRequest(102,true);
        queue.enqueue(req2);
        TreatmentRequest req3 = new TreatmentRequest(103, false);
        queue.enqueue(req3);
        TreatmentRequest req4 = new TreatmentRequest(104,true);
        queue.enqueue(req4);
        TreatmentRequest req5 = new TreatmentRequest(105,true);
        queue.enqueue(req5);
        TreatmentRequest req6 = new TreatmentRequest(106,false);
        queue.enqueue(req6);
        TreatmentRequest req7 = new TreatmentRequest(107,true);
        queue.enqueue(req7);
        TreatmentRequest req8 = new TreatmentRequest(108,false);
        queue.enqueue(req8);

        TreatmentRequest request1 = queue.dequeue();
        TreatmentRequest request2 = queue.dequeue();
        TreatmentRequest request3 = queue.dequeue();

        System.out.println("Remaining tail structure: ");
        queue.printQueue();

        //DISCHARGE TEST
        System.out.println("DISCHARGE TEST");
        DischargeStack stack = new DischargeStack();

        stack.push(new DischargeRecord(101));
        stack.push(new DischargeRecord(102));
        stack.push(new DischargeRecord(103));
        stack.push(new DischargeRecord(104));
        stack.push(new DischargeRecord(105));

        //sondan iki elemanı çıkart
        stack.pop();
        stack.pop();

        stack.printStack(); //kalan yığını yazdır
    }
}
