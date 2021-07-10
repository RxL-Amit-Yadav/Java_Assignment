package rxlogix;
    public class Stack_Class {
        public int []arr = new int[10];
        public int pos = 0;
        public int capacity = 0;
        Stack_Class(){
            for(int i=0;i<10;i++){
                arr[i] = 0;
            }
            this.pos = 0;
            this.capacity = 10;
        }
        public void push(int element){
            if(pos == capacity){
                System.out.println("The Stack is full");
                return;
            }
            arr[pos] = element;
            pos++;
        }
        public void pop(){
            if(pos < 0){
                System.out.println("Stack is Empty");
            }
            pos--;
        }
        public int getSize(){
            return pos+1;
        }
        public int get_top(){
            return arr[pos-1];
        }
        public void update(int element ,int p){
            if(p > pos) {
                System.out.println("the stack is small");
                return;
            }
            arr[p] = element;
        }
        public static void main(String []args){
            Stack_Class s = new Stack_Class();
            s.push(2);
            s.push(3);
            s.push(8);
            s.push(5);
            int x = s.get_top();
            System.out.println(x);
            s.pop();
            s.update(6,0);
            s.pop();
            s.pop();
            int y = s.get_top();
            System.out.println(y);
        }
    }

