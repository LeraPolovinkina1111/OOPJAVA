package OOPdz.dz6.view;


import homeLesson6.controller.UserController;
import homeLesson6.product.Drink;
import homeLesson6.product.HotDrink;
import homeLesson6.product.MineralWater;


public class Main {
   

    public static void main(String[] args) {
        
        UserController user = new UserController();
        user.setProduct(new Drink("компот", 250));
        user.setProduct(new Drink("тархун", 200));
        user.setProduct(new MineralWater("Горячий ключ", "не газированная", 500));
        user.setProduct(new MineralWater("Ессентуки", "газированная", 500));
        user.setProduct(new HotDrink("чай", 300, 65));
        user.setProduct(new HotDrink("кофе", 200, 80));

        user.allProduct();
    }
}
