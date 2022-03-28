import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal(int numWeeks) {
        int sumaTotal = 0;
        for(int i = 1; i <= numWeeks ; i++)
        {
            sumaTotal += i;
        }
        return sumaTotal;
    }
    
    public double getOrderTotal(double[] prices) 
    {
        double sumaPrecios = 0;
        for(int i = 0; i < prices.length ; i++)
        {
            sumaPrecios += prices[i];
        }
        return sumaPrecios;
    }

    void displayMenu(ArrayList<String> menuItems)
    {
        for(int i = 0; i < menuItems.size() ; i++)
        {
            System.out.println(i+" "+menuItems.get(i));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices)
    {
        if(menuItems.size()!=prices.size())
        {
            return false;
        }
        else
        {
            for(int i = 0; i < menuItems.size() ; i++)
            {
                System.out.println(i+" "+menuItems.get(i)+" -- $"+prices.get(i)+"00");
            }
        }

        return true;
    }
    
    void addCustomer(ArrayList<String> customers)
    {
        System.out.print("Por favor, ingresa tu nombre: ");
        String userName = System.console().readLine();
        System.out.println("¡Hola, "+userName+" !");
        System.out.println("Hay "+customers.size()+" personas frente a ti");
        customers.add(userName);
        System.out.println(customers.toString());
        
    }

    void printPriceChart(String product, double price, int maxQuantity)
    {
        double valor = 0;
       
        System.out.println(product);

        for (int i = 1; i <= maxQuantity; i++)
        {
            valor = price * i;
            long numero = (new Double(valor)).longValue();
            System.out.print(i+" - $ ");
            System.out.format("%,4d%n",numero);
        }
    }
    
}