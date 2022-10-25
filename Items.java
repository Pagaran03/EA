package ecommerce.ea;

public class Items 
{
    
    //KANI NADUGANG OR NAUSAB - andrew
    
    private int pid,price, stocks;
    private String prodname, status;
    
    Items(int id, int price, String prodname, int stocks, String status)
    {
        this.pid = id;
        this.price = price;
        this.prodname = prodname;
        this.stocks = stocks;
        this.status = status;
    }
    
    public int getpid()
    {
        return pid;
    }
    
    public int getprice()
    {
        return price;
    }
    
    public String getprodname()
    {
        return prodname;
    }
    
    public int getstocks()
    {
        return stocks;
    }
    
    public void setstocks(int stocks)
    {
        this.stocks = stocks;
    }
    
    public String getstatus()
    {
        return status;
    }
    
    public void setstatus(String status)
    {
        this.status = status;
    }
}
