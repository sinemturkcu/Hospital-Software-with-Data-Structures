package DataStructures;


//**************Double Linked List************************//
public class Service_1 {
    Patient head; //head of list
    Patient tail; //tail of list

    //Constructor
    public Service_1() {
        head=null;
        tail=null;
    }

    //Check list is empty or not
    public boolean isEmpty() {
        return head==null;
    }

    //This function first builds new patient with the given data
    //than adds it to the LinkedList
    //new nodes are added to the tail of LinkedList
    public void insert(String name) {
        Patient newPatient = new Patient(name);

        if (isEmpty()){

            head = newPatient;
            tail = newPatient;
        }else {
            tail.next=newPatient;
            newPatient.previous=tail;
            tail=newPatient;
            tail.next=null;
        }
    }

    // overload this method as new nodes are added to given position (int pos)
    // fill the rest
    public void insert(String name, int pos) {
        Patient newPatient = new Patient(name);
        if (isEmpty()){
            head = newPatient;
            tail = newPatient;
        }
        else {
            Patient headCopy = head;
            int index = 0 ;
            while (headCopy!=null){
                if (index==pos)
                    break;
                headCopy=headCopy.next;
                index++;
                System.out.println("aaa");


            }
            if (isEmpty()){
                head=newPatient;
                tail=newPatient;
            }
            else if (headCopy.previous==null){
                headCopy.previous=newPatient;
                newPatient.next=headCopy;
                head=newPatient;


            }
            else {
                headCopy=headCopy.previous;
                Patient nextOfNewPatient = headCopy.next;

                newPatient.next=nextOfNewPatient;
                nextOfNewPatient.previous=newPatient;

                headCopy.next=newPatient;
                newPatient.previous=headCopy;
            }

        }
    }

    //This method finds how many patients are exist in LinkedList
    public int size() {
        int size = 0 ;
        Patient headCopy = head;
        while (headCopy!=null){
            size++;
            headCopy=headCopy.next;
        }

        return size;
    }

    // This functions delete a node in the LinkedList by a given "data"
    // parameter name changed as key in order to prevent confusion
    public Patient deleteByName(String name) {
        Patient headCopy = head;
        while (headCopy!=null){
            if (headCopy.getName().equals(name))
                break;
            headCopy=headCopy.next;
        }

        if (headCopy==head){
            head=headCopy.next;
            head.previous=null;
        }
        else if (headCopy==tail){
            tail=tail.previous;
            tail.next=null;
        }
        else {
            headCopy.previous.next=headCopy.next;
            headCopy.next.previous=headCopy.previous;
        }
        return headCopy;
    }

    // This functions delete a node in the LinkedList by a given position
    public Patient deleteByPosition(int pos) {
        Patient headCopy = head;
        System.out.println(headCopy.getName());
        int index = 0 ;
        while (headCopy!=null){
            if (index==pos)
                break;
            headCopy=headCopy.next;
            index++;
        }

        if (headCopy==head){
            head=headCopy.next;
            head.previous=null;
        }
        else if (headCopy==tail){
            tail=tail.previous;
            tail.next=null;
        }
        else {

            headCopy.previous.next=headCopy.next;
            headCopy.next.previous=headCopy.previous;
        }
        return headCopy;
    }

    //This function get the node in the given index
    //*********************DO NOTHING*********************
    public Patient getByPosition(int pos){
        if(this.isEmpty())
            return new Patient("empty");
        Patient current = this.head;
        int index = 0;

        while (current != null){
            if(index++ == pos)
                break;
            current = current.next;
        }

        if(current == null)
            return new Patient("empty");

        return current;
    }

    // This function prints  the LinkenList
    //*********************DO NOTHING*********************
    public void print() {

        if(this.isEmpty())
            return;
        Patient patient = this.head;  // make a copy of head
        int index = 1;

        // never operate on "head", otherwise you will lost the linkedlist
        //unless you want to change "head"
        while (patient != null) {
            System.out.println(index++ + ". " + patient.getName());

            patient = patient.next;  // iterate to next node
        }

    }

}


