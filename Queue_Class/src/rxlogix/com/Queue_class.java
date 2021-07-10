package rxlogix.com;
public class Queue_class {
    public int [] arr = new int[10];
    public int nextIndex;
    public int firstIndex;
    public int size;
    public int capacity;
    Queue_class() {
        for(int i=0;i<10;i++){
            arr[i] = 0;
        }
        this.nextIndex = 0;
        this.firstIndex = -1;
        this.size = 0;
        this.capacity = 10;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    // insert element
    void enqueue(int element) {
        if(size == capacity) {
            System.out.println("Queue Full ! ");
            return;
        }
        arr[nextIndex] = element;
        nextIndex = (nextIndex + 1) % capacity ;
        if(firstIndex == -1) {
            firstIndex = 0;
        }
        size++;
    }


    int front() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        return arr[firstIndex];
    }

    int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        int ans = arr[firstIndex];
        firstIndex = (firstIndex + 1) % capacity;
        size--;
        if (size == 0) {
            firstIndex = -1;
            nextIndex = 0;
        }
        return ans;
    }
    public static void main(String [] args){
        Queue_class q = new Queue_class();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        System.out.println(q.front());
        System.out.println( q.dequeue());
        System.out.println( q.dequeue());

        System.out.println( q.getSize());
        System.out.println(q.isEmpty());
    }
}
