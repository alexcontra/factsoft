package Product;
public class product {
    protected String denumireProdus;
    protected int UM ;
    protected int cantitate;
    protected double pretUnitar;
    protected double valLei ;

    public product(String denumireProdus, int UM, int cantitate, double pretUnitar, double valLei) {
        this.denumireProdus = denumireProdus;
        this.UM = UM;
        this.cantitate = cantitate;
        this.pretUnitar = pretUnitar;
        this.valLei = valLei;
    }
}
