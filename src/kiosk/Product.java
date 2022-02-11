/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiosk;

/**
 *
 * @author Sanjan
 */
public class Product
{
     protected String ItemName;
    protected int itemQty;
    protected double itemPrice;

    public String getItemName()
    {
        return itemName;
    }
    public int getItemQty()
    {
        return itemQty;
    }
    public double getItemPrice()
    {
        return itemPrice;
    }
    public void setItemName(String itemName)
    {
        this.itemName= itemName;
    }
    public void setItemQty(int itemQty)
    {
        this.itemQty= itemQty;
    }
    public void setItemPrice(double itemPrice)
    {
        this.itemPrice= itemPrice;
    }
    public double CalcTotal(int qtd)
    {
        return itemPrice/itemQty*qtd;
    }
    public String toString()
    {
        return itemName + "" +  itemQty + "" + String.format("$, .2f", itemPrice);
    }

}
