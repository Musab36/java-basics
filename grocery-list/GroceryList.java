public class GroceryList {
    public static void main(String[] args) {
       String[] myGroceryList = {"ice cream", "hot sauce", "pickles", "bananas", "cereal", "yoghurt"};
       Integer[] groceryItemPrices = {3, 6, 4, 2, 4, 4};
       
       for(String groceryItems : myGroceryList) {
           System.out.println(groceryItems);
       }
       Integer total = 0;
       for(Integer price : groceryItemPrices) {
           total = total += price;
       }
       System.out.println("Your total for this shopping trip will be: $" + total);
       
       String[] groceryList = {"eggs", "beans", "wine", "apples", "potatos"};
       for(Integer index = 0; index < groceryList.length; index++) {
           System.out.println(groceryList[index]);
       }
    }
}