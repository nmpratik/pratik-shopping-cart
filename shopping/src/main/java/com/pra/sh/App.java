package com.pra.sh;

import com.pra.sh.cart.*;
import com.pra.sh.input.*;
import com.pra.sh.item.*;
import com.pra.sh.user.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws Exception {

        ItemDb.addItem(1, "pen", 10);
        ItemDb.addItem(2, "eraser", 5);
        ItemDb.addItem(3, "pencil", 8);
        ItemDb.addItem(4, "sharpner", 5);
        ItemDb.addItem(5, "ruler", 30);
        ItemDb.addItem(6, "notebook", 120);
        ItemDb.addItem(7, "bag", 800);
        ItemDb.addItem(8, "bottle", 300);
        ItemDb.addItem(9, "sparkles", 100);
        ItemDb.addItem(10, "colors", 450);

        CartDataInput ip = new CartDataInput();

        UserController userController = new UserController();
        CartController cartController = new CartController();
        ItemController itemController = new ItemController();

        CartMenu cartMenu = new CartMenu(ip, cartController, itemController);
        UserMenu menu = new UserMenu(ip, userController, cartController, itemController, cartMenu);

        menu.performAction();
    }
}
