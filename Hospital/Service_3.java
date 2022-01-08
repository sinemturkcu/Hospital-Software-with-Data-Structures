package DataStructures;


//Queue with Linked List
public class Service_3 {
    Service_1 queue; // Your queue. Use this

    // Constructor to initialize a queue
    Service_3() {
        this.queue = new Service_1();
    }

    // Utility function to dequeue the front element
    public Patient dequeue() {
        Patient copy = queue.getByPosition(0);
        queue.deleteByPosition(0);

        return copy;
    }

    // Utility function to add an item to the queue
    public void enqueue(Patient p) {

        queue.insert(p.getName());


    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty() {


        return queue.isEmpty();
    }

    // Utility function to return the size of the queue
    public int size() {

        return queue.size();

    }

}


