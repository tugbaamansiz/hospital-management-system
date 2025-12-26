public class PatientList {
    private Patient head;

    //Consturctor
    //Başlangıçta liste boş
    public PatientList() {
        head = null;
    }
    //yeni hasta ekleme
    public void addPatient(Patient p) {
        if (head == null) {
            head = p; // liste boş olunca yeni hasta first node olur
        }
        else {
            Patient current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = p; //son düğüme yeni hasta eklenir
        }
        System.out.println(p.getName() + " has been added to the list");
    }//Sona ekleme : O(n)
    //Başa ekleme O(1)
    //hasta çıkartma
    public boolean removePatient(int id) {
        if (head == null) {
            System.out.println("Patient list is empty");
            return false;
        }
        //Silinecek hasta head ise
        if (head.getId() == id) {
            head = head.next;
            System.out.println("Patient has been removed from the list. ID: " + id);
            return true;
        }
        //head dışındaki nodelardan birinde mi?
        Patient current = head;
        while (current.next != null) {
            if (current.next.getId() == id) {
                current.next = current.next.next;
                System.out.println("Patient has been removed from the list. ID: " + id);
                return true;
            }
            current = current.next;
        }
        System.out.println("False ID." + id + " could not be removed from the list");
        return false;
    }//O(n)
    public Patient findPatient(int id) {
        Patient current = head;
        while (current != null) {
            if (current.getId() == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    } //O(n)

    //Listedeki tüm hasta bilgilerini yazdırma
    public void printPatientList() {
        if (head == null) {
            System.out.println("Patient list is empty");
            return;
        }
        System.out.print("---- Current Patient List ----" + System.lineSeparator());
        Patient current = head;
        while (current != null) {
            System.out.println(current.toString());
            current = current.next;
        }
    }

}
