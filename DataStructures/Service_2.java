package DataStructures;


//Stack with Linked List
public class Service_2 {
    Service_1 stack; // Your stack. Use this

    // Constructor to initialize the stack
    Service_2(){
        this.stack = new Service_1();
    }

    // Utility function to add an element `x` to the stack
    public void push(Patient p){
        stack.insert(p.getName(),0);

    }

    // Utility function to pop a top element from the stack
    public Patient pop(){
        Patient copy = stack.getByPosition(0);
        stack.deleteByPosition(0);

        return copy;
    }

    // Utility function to check if the stack is empty or not
    public Boolean isEmpty(){


        return stack.isEmpty();
    }

    // Utility function to return the size of the stack
    public int size() {

        return stack.size();
    }

}

