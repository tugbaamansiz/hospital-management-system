public class TreatmentQueue {
    private TreatmentRequest front;
    private TreatmentRequest back;
    private int currentSize; //toplam istek sayısı

    //Constructor

    public TreatmentQueue() {
        this.front = null;
        this.back = null;
        this.currentSize = 0;
        //liste boş
    }
    //enqueue : liste sonuna yeni istek ekleme
    public void enqueue(TreatmentRequest request) {
        //kuyruk boşsa yeni istek hem front hem back olur
        if (back == null) {
            front = request;
            back = request;
        }  else {
            back.next = request; // backin next referansını yeni isteğe bağla
            back = request; //back yeni sona güncellenir

        }
        currentSize++;
        System.out.println(" Added to queue: Patient ID: " + request.getPatientId());
    }// time complexity O(1)
    //dequeue : kuyruğun başındaki isteği çıkarır ve döndürür
    public TreatmentRequest dequeue() {
        if (front == null) {
            System.out.println(" Empty queue");
            return null;
        }
        //Çıkarılacak olan frontu bir değişkende sakla
        TreatmentRequest removedRequest = front;
        front = front.next; //baş düğümü sonrakine kaydır

        if (front == null) { //baş null olduysa kuyruk boştur backi de null yap
            back = null;
        }
        currentSize--;
        System.out.println("In progress: Patient ID: " + removedRequest.getPatientId());
        return removedRequest;
    }// time complexity: O(1)

    //queue'da ki eleman sayısını döndürür
    public int size() {
        return currentSize;
    }//time complexity: O(1)
    public void printQueue() {
        if (front == null) {
            System.out.println(" Empty queue");
            return;
        }
        System.out.println("Current Treatment Queue (Waiting)");
        TreatmentRequest current = front;
        while (current != null) {
            System.out.println(current.toString());
            current = current.next;
        }//time complexity O(n)
    }

}


