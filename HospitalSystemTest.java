public class HospitalSystemTest {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();

        //Sisteme 10 hasta ekleme
        System.out.println("-----Patient Registration in the System-----");

        system.registerPatient(new Patient(101, "Tuğba Amansız", 10, 24));
        system.registerPatient(new Patient(102, "Ayşe Yıldırım", 3, 45));
        system.registerPatient(new Patient(103, "İrem Soytek", 9, 64));
        system.registerPatient(new Patient(104, "Nur Tahtalı", 4, 55));
        system.registerPatient(new Patient(105, "Özge Güler", 3, 21));
        system.registerPatient(new Patient(106, "Ahmet Kaya", 3, 49));
        system.registerPatient(new Patient(107, "Mahmut Tuncer", 7, 22));
        system.registerPatient(new Patient(108, "Demet Akalın", 5, 35));
        system.registerPatient(new Patient(109, "Fatma Turgut", 2, 64));
        system.registerPatient(new Patient(110, "Oğuz Atay", 9, 48));

        //Tedavi talepleri: 3 öncelikli, 5 normal
        System.out.println("-----patient queue is being created-----");

        //öncelikli talepler
        system.requestTreatment(110, true);
        system.requestTreatment(103, true);
        system.requestTreatment(101, true);

        //Normal talepler
        system.requestTreatment(102, false);
        system.requestTreatment(107, false);
        system.requestTreatment(104, false);
        system.requestTreatment(105, false);
        system.requestTreatment(106, false);

        // 2 taburculuk kaydı
        System.out.println("-----Discharge record created-----");

        DischargeStack ds = new DischargeStack();
        ds.push(new DischargeRecord(108));
        ds.push(new DischargeRecord(109));

        ds.printStack(); //taburcu yığınını yazdır

        System.out.println("-----TREATMENT PROCEDURES ARE BEING INITIATED.-----");


        system.processNextTreatment(110, true);
        system.processNextTreatment(103, true);
        system.processNextTreatment(101, true);
        system.processNextTreatment(104, false);


        System.out.println("----CURRENT DISCHARGE LIST----");
        system.printDischargeStatus();
    }



    }

