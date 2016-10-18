public class Invoice{
    /* Invoice: Factura  */

    private String number; 
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description,
                   int quantity, double price ){

        boolean validate = number instanceof String;
        this.number = validate ? number:"XXXXX";
        boolean validate = description instanceof String;
        this.description = validate ? description:"Description ...";
        this.quantity = (quantity > 0) ? quantity:0;
        this.price = (price > 0.0) ? price:0.0;
    }

    public void setNumber(String number){
         boolean validate = number instanceof String;
         this.number = validate ? number:
             System.out.printf("Escriba numero valido%n");      
    }

    public void setDescription(String description){
        boolean validate = description instanceof String;
        this.description = validate ? description:
             System.out.printf("Invoice description ...%n");
    }

    public void setQuantity(int quantity){
        this.quantity = (quantity > 0) ? quantity:0;
    }

    public void setPrice(double price){
        this.price = (price > 0.0) ? price:0.0;
    }

    public String getNumber(){
        return this.number;
    }

    public String getDescription(){
        return this.description;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getPrice(){
        return this.price;
    }
}
