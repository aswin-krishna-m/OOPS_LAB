public class Product {
    String pcode;
    String pname;
    int price;
    public Product(String pc, String pn,int pr){
        this.pcode = pc;
        this.pname = pn;
        this.price = pr;
    }
    public int getprice(){
        return  price;
    }
    public static void main(String[] args){
        Product x = new Product("A101","Rice",60);
        Product y = new Product("B101","Ice",90);
        Product z = new Product("C101","P-Rice",70);
        if(x.getprice()<y.getprice() && x.getprice() < z.getprice()){
            System.out.println("Low priced product ID is: "+ x.pcode);
        }
        else if(y.getprice() < z.getprice()){
            System.out.println("Low priced product ID is: "+ y.pcode);
        }
        else{
            System.out.println("Low priced product ID is: "+ z.pcode);
        }

    }
}




// **************OUTPUT**************

/*
Low priced product ID is: A101 
*/