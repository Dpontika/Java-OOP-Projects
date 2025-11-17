// Interface for insured items - inherits from both ForSale and ForTransfer

public interface Insured extends ForSale, ForTransfer {
    double getAmount();               // Returns insurance amount
}