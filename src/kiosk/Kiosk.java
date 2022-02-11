/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiosk;

/**
 *
 * @author Sanjan
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk{
 
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
                       
        String [] prodName = {"Apple", "Orange", "Corn"};
        int [] prodQty = {10, 5, 12};
        double [] prodPrice = {4.0, 4.50, 3.0};
   
        
        Product products = new Product();        
                        
       
        boolean shutdown = false;

        
        double totalSales = 0.0, totalOrder;
       
        System.out.println("What do you want to buy? (Type Shutdown to close the day.)");
        String _name = input.nextLine();

        
        while (shutdown == false){
            
            totalOrder = 0.0;

            
            ArrayList <String> shopList = new ArrayList<>();
            
            
            System.out.println("Welcome to the Kiosk!");
                    System.out.println("We sell:");
                    System.out.println("Product - Qty - Price");

            
            for (int i = 0; i <= prodName.length-1; i++){
                System.out.println(prodName[i] + " - " + prodQty[i] + " - $" + prodPrice[i]);
            }
            
            
            
            
            boolean N = false;
            do{ 
                
                if (shopList.isEmpty() != true){
                    
                    System.out.println("--------------------\nYou have " + shopList.size() + " item(s) in you cart");
                    System.out.println("--------------------\nProd  -  Qty  -  $");
                    for (Object List : shopList){
                        System.out.println(List);
                    }
                    System.out.println("--------------------\nTotal: $" + totalOrder);
                }
                
                
                String _name;
                do{ 
                    
                
                    
                    if ("apple".equals(_name.toLowerCase())){
                        products.itemName = prodName[0];
                        products.itemQty = prodQty[0];
                        products.itemPrice = prodPrice[0];
                    }else if ("orange".equals(_name.toLowerCase())){
                        products.itemName = prodName[1];
                        products.itemQty = prodQty[1];
                        products.itemPrice = prodPrice[1]; 
                    }else if ("corn".equals(_name.toLowerCase())){
                        products.itemName = prodName[2];
                        products.itemQty = prodQty[2];
                        products.itemPrice = prodPrice[2]; 
                    }else if ("shutdown".equals(_name.toLowerCase())){
                        _name = "Shutdown";
                        shutdown = true;
                        N = true;
                        System.out.println("Total sales for the day: " + totalSales);
                        System.exit(0);
                    }else{
                        System.out.println("Please try again.");
                        _name = null;
                    }
                    
                }while(_name == null); 

                
                int qtd = 0;
                while(true){
                    try{
                    
                    System.out.println("How many?");
                    qtd = input.nextInt();
                    if (qtd <= 0){
                        System.out.println("The amount should be more the 0, Please try again.");
                    }else{
                        break;
                    }
                }catch (Exception e){
                    System.out.println("The amount should be more the 0, Please try again.");
                    input.next();
                    continue;
                }
                }
                
                
                totalOrder += products.CalcTotal(qtd);

                
                products.itemPrice = products.CalcTotal(qtd);
                products.itemQty = qtd;
                
                
                
                shopList.add(products.toString());
                
                
                String again;
                while(true){
                    try{
                        
                        System.out.println("Any other product? Y or N");
                        again = input.next();
                        
                        if (again.equals("y") || again.equals("Y")){
                           
                            N = true;
                            break;
                        
                        }else if (again.equals("n") || again.equals("N")){
                           
                            N = false;
                            
                            
                            System.out.println("Your order is: ");
                            
                            
                            System.out.println("--------------------\nProd  -  Qty  -  $");
                            for (Object List : shopList){
                                System.out.println(List);
                            }
                           
                            
                            System.out.println("Your total price would be $" + totalOrder);
                            System.out.println("Thanks for shopping with us! \n--------------------------------");
                            break;

                        }else{
                            System.out.println("Wrong answer, please type Y or N");
                            continue;
                        }
                    }catch (Exception e){
                        System.out.println("Wrong answer, please type Y or N");
                        input.next();
                        continue;
                }
                }
                    
            }while (N == true);
            
        
        
        
        }
    }
}
