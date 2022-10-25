package ecommerce.ea;

public class Cart 
{
    
    //KANI NADUGANG OR NAUSAB - andrew
    
   private int cid,cprice;
    private String cprodname;
    
    Cart(int id, String prodname, int price)
    {
        this.cid = id;
        this.cprodname = prodname;
        this.cprice = price;
    }
    
    public int getpid()
    {
        return cid;
    }
    
    public int getprice()
    {
        return cprice;
    }
    
    public String getprodname()
    {
        return cprodname;
    }
}
