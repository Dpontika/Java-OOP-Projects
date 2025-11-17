
public interface ForSale
{
    String getDescription();                    // Returns item description
    int getPrice();                   // Returns catalog price in cents
    int getLowestPrice(double percentage);   // Returns lowest acceptable price
}