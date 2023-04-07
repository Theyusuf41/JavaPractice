package Projects.StorageManagement.PizzaSiparis;

public class PizzaAcilisEkran {
    public static void menu() {
        // TITLES
        String welcomeHeader = "+---------------------------------------------------+";
        String welcomeBanner = "|          WELCOME TO ANAR-COM PIZZA HOUSE          |";
        String menuPizzaType = "|              SELECT YOUR PIZZA SHAPE              |";
        String menuPizzaSize = "|              SELECT YOUR PIZZA SIZE               |";

        // SHAPE MENU
        String menuShapeRow1 = "           ******              ***************       ";
        String menuShapeRow2 = "        ***      ***           **           **       ";
        String menuShapeRow3 = "       **          **          **           **       ";
        String menuShapeRow4 = "      **            **         **           **       ";
        String menuShapeKeys = "        1 FOR ROUND            2 FOR RECTANGLE       ";

        // SIZE MENU
        String menuSizesKeys = "    1 FOR SMALL     2 FOR MEDIUM     3 FOR LARGE     ";


        // WELCOME PRINTER
        System.out.println(welcomeHeader);
        System.out.println(welcomeBanner);
        System.out.println(welcomeHeader);
        System.out.println();

        // SHAPE MENU PRINTER
        System.out.println(welcomeHeader);
        System.out.println(menuPizzaType);
        System.out.println(welcomeHeader);
        System.out.println();
        System.out.printf("%1$s\n%2$s\n%3$s\n%4$s\n%4$s\n%3$s\n%2$s\n%1$s\n", menuShapeRow1, menuShapeRow2, menuShapeRow3, menuShapeRow4);
        System.out.println(menuShapeKeys);
        System.out.println();

        // SIZE MENU PRINTER
        System.out.println(welcomeHeader);
        System.out.println(menuPizzaSize);
        System.out.println(welcomeHeader);
        System.out.println();
        System.out.println(menuSizesKeys);
    }
}
