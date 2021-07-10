package practice;

public class Employee_Class {
    public int age;
    public String name;
    public int id;
    public String department;

    Employee_Class(int age,String name,int id,String department){
        this.age = age;
        this.name = name;
        this.id = id;
        this.department = department;
    }
     public static void orderbyid(Employee_Class[] e1){
         Employee_Class temp;
        int n = e1.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(e1[j].id < e1[j+1].id){
                    temp = e1[j];
                    e1[j] = e1[j+1];
                    e1[j+1] = temp;
                }
            }
        }
        for(int i=0;i<e1.length;i++){
            System.out.println(e1[i].id);
        }

    }
    public static void orderbyname(Employee_Class[] e1){
        Employee_Class temp;
        for(int i=0;i<e1.length;i++){
            for(int j=i+1;j<e1.length;j++){
                if(e1[i].name.compareToIgnoreCase(e1[j].name) > 0){
                    temp = e1[i];
                    e1[i] = e1[j];
                    e1[j] = temp;
                }
            }
        }
        for(int i=0;i<e1.length;i++){
            System.out.print(" "+e1[i].name);
        }
    }
    public static void orderbyage(Employee_Class[] e1){
        Employee_Class temp;
        int n = e1.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(e1[j].age < e1[j+1].age){
                    temp = e1[j];
                    e1[j] = e1[j+1];
                    e1[j+1] = temp;
                }
            }
        }
        for(int i=0;i<e1.length;i++){
            System.out.println(e1[i].age);
        }

    }
    public static void main(String[]  args){
        Employee_Class[] arr = new Employee_Class[4];
    Employee_Class E1 = new Employee_Class(22,"Amit",2012,"Finance");
    Employee_Class E2 = new Employee_Class(23,"Sumit",2109,"Security");
    Employee_Class E3 = new Employee_Class(24,"Ankit",2110,"HR");
    Employee_Class E4 = new Employee_Class(25,"Pankaj",2200,"Engineering");
    arr[0] = E1;
    arr[1] = E2;
    arr[2] = E3;
    arr[3] = E4;
    orderbyid(arr);
    orderbyname(arr);
    orderbyage(arr);
    }
}
