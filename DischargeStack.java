public class DischargeStack {
    private DischargeRecord top; //Stack'in en üstündeki eleman

    public DischargeStack() {
        this.top = null;
    }

    public void push(DischargeRecord record) {
        record.next = top;
        top = record; //yeni top artık bu kayıtta
        System.out.println("Record added to stack: ID: " + record.getPatientId());
    } // time complexity O(1)

    public DischargeRecord pop() { //en üstteki kaydı çıkarır ve döndürür
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        DischargeRecord remove = top;
        top = top.next; // top sonraki kayda kaydırılır
        System.out.println("Record deleted from stack: ID: " + remove.getPatientId());
        return remove;
    } //time complexity O(1)

    public DischargeRecord peek() { //en üstteki kaydı göster
        return top;
    } //time complexity O(1)

    public void printStack() {
        System.out.println("----Discharge Records (Newest at Top----");
        DischargeRecord current = top;
        while (current != null) {
            System.out.println(current.toString());
            current = current.next;
        }
    }
}

