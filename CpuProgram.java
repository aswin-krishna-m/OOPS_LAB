class cpu {
    double price;
    cpu(double price){
        this.price = price;
    }
    public void show(){
        System.out.println("The cpu price is : "+ this.price);
    }
class processor {
int core;
String manufacturer;
processor(int core,String manufacturer){
    this.core = core;
    this.manufacturer = manufacturer;
}
public void show(){
    System.out.println("Number of Cores : "+ this.core);
    System.out.println("Manufacturer : "+this.manufacturer);
}
}

static class ram {
    int memory;
    String manufacturer;
    ram(int memory,String manufacturer){
        this.memory = memory;
        this.manufacturer = manufacturer;
    }    
    public void show(){
        System.out.println("RAM Memory: "+ this.memory +"GB");
        System.out.println("RAM Manufacturer : "+this.manufacturer);
    }
}
}
public class CpuProgram{
    public static void main(String[] args){
        cpu c1 = new cpu(300);
        cpu.processor p1 = c1.new processor(4,"Intel");
        cpu.ram r1 = new cpu.ram(8,"Corsair");
        c1.show();
        p1.show();
        r1.show();
    }
}


// **************OUTPUT**************

/*
The cpu price is : 300.0
Number of Cores : 4
Manufacturer : Intel
RAM Memory: 8GB
RAM Manufacturer : Corsair
*/