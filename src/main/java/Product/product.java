package Product;
public class product {
    public String denumireProdus;
    public int UM ;
    public int cantitate;
    public double pretUnitar;
    public double valLei ;

    public product(String denumireProdus, int UM, int cantitate, double pretUnitar, double valLei) {
        this.denumireProdus = denumireProdus;
        this.UM = UM;
        this.cantitate = cantitate;
        this.pretUnitar = pretUnitar;
        this.valLei = valLei;
    }
}
