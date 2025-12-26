public class TreatmentRequest {
    private int patientId;
    private long arrivalTime;
    public TreatmentRequest next;
    private boolean isPriority;


    //Constructor
    public TreatmentRequest(int patientId, boolean isPriority) {
        this.patientId = patientId;
        this.isPriority = isPriority;
        this.arrivalTime = System.currentTimeMillis();
        this.next = null;

    }


    //Getters
    public int getPatientId() {

        return patientId;
    }
    public long getArrivalTime() {

        return arrivalTime;
    }
    public boolean isPriority() {

        return isPriority;
    }
    //Bilgileri yazdırma
    public String toString() {
        String prioryStatus = isPriority ? "Yes" : "No";
        return "Patient ID: "  + patientId + ", Arrival Time: " + arrivalTime + ", Priority: " + prioryStatus;
    }
}
