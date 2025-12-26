import java.util.HashMap;

public class HospitalSystem {
    private PatientList allPatients;
    private TreatmentQueue treatmentQueue;
    private DischargeStack dischargeStack;

    private HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        allPatients = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap();
    }
    public void printDischargeStatus() {
        dischargeStack.printStack();
    }

    //Yeni hasta kabul
    public void registerPatient(Patient patient) {
        allPatients.addPatient(patient); //listeye ekleme
        patientMap.put(patient.getId(), patient); //HashMap'e ekleme
        System.out.println("Registration made: " + patient.getName());
    }
    //Tedavi talebi oluştur
    public void requestTreatment(int patientId, boolean isPriority) {
        //HashMap sayesinde hastayı O(1) hızla buluruz
        Patient patient = patientMap.get(patientId);
        if (patient != null) {
            TreatmentRequest req = new TreatmentRequest(patientId, isPriority);
            treatmentQueue.enqueue(req);
        } else {
            System.out.println("Patient with id " + patientId + " not found");
        }
    }
    //Hastayı tedavi ve taburcu et
    public void processNextTreatment(int i, boolean b) {
        TreatmentRequest req = treatmentQueue.dequeue();
        if (req != null) {
            //tedavisi biteni stack'e gönder
            DischargeRecord record = new DischargeRecord(req.getPatientId());
            dischargeStack.push(record);
            System.out.println("The patient was treated and added to the discharge list.");
        }
    }
        //HashMap kullanımı
        public void quickSearch(int id) {
            Patient patient = patientMap.get(id);
            if (patient != null) {
               System.out.println("Found patient: " + patient.getName() + " ( Age: " + patient.getAge() + ")" );
            } else {
                System.out.println("Patient with id " + id + " not found");
            }
        }
    }

