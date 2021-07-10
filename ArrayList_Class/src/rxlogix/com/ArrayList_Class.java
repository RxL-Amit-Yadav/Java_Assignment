package rxlogix.com;

public class ArrayList_Class {
        public int []data;
        public int nextIndex;
        public int capacity;			// total size

        ArrayList_Class() {
            data = new int[5];
            nextIndex = 0;
            capacity = 5;
        }

        void add(int element) {
            if(nextIndex == capacity) {
                int []newData = new int[2 * capacity];
                for(int i = 0; i < capacity; i++) {
                    newData[i] = data[i];
                }
                data = newData;
                capacity *= 2;
            }
            data[nextIndex] = element;
            nextIndex++;
        }

        int get(int i){
            if(i < nextIndex) {
                return data[i];
            }
            else {
                return -1;
            }
        }

        void add(int i, int element) {
            if(i < nextIndex) {
                data[i] = element;
            }
            else if(i == nextIndex) {
                add(element);
            }
            else {
                return;
            }
        }

        void print()
        {
            for (int i = 0; i < nextIndex; i++) {
                System.out.print(" " + data[i]);
            }
        }
    public static void main(String[] args){
    ArrayList_Class d1 = new ArrayList_Class();
        d1.add(10);
        d1.add(20);
        d1.add(30);
        d1.add(40);
        d1.add(50);
        d1.add(60);

        d1.print();

        // Copy constructor

        ArrayList_Class d3 = new ArrayList_Class();

        d3 = d1;

        d1.add(0, 100);
        d3.print();
    }
}
