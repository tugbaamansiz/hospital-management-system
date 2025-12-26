public class DischargeRecord {
    private int patientId;
    private long dischargeTime;
    public DischargeRecord next;

    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
        this.next = null;
    }
    //getters
    public int getPatientId() {
        return patientId;
    }
    public long getDischargeTime() {
        return dischargeTime;
    }
    public String toString() {
        return "DischargeRecord{" +
                "patientId=" + patientId +
                ", dischargeTime=" + dischargeTime +
                '}';
    }
}
