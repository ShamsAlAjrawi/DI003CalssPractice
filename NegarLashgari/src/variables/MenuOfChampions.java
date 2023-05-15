package variables;

import java.sql.SQLOutput;

public class MenuOfChampions {
    public static void main(String[] args) {

        String food1 = "Slice of Big Rico Pizza";
        String food2 = "Invisible Strawberry Pie";
        String food3 = "Denver Omelet";

        double food1Price = 50.00;
        double food2Price = 3.00;
        double food3Price = 16.50;

        //  https://asciiart.website//index.php?art=art%20and%20design/borders
        System.out.println("                 __    __   __   __   __   __   __   __    __\n" +
                "                _\\/_  _\\/_ _\\/_ _\\/_ _\\/_ _\\/_ _\\/_ _\\/_  _\\/_\n" +
                "                \\/\\/  \\/\\/ \\/\\/ \\/\\/ \\/\\/ \\/\\/ \\/\\/ \\/\\/  \\/\\/\n");

        System.out.println("                        WELCOME TO Negar RESTAURANT!");
        System.out.println("          .oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.");
        System.out.println("                        Today's Menu Is...\n\n");
        System.out.println("                     $ "+ food1Price+ " *** " + food1);
        System.out.println("                     $ "+ food2Price+ " **** " + food2);
        System.out.println("                     $ "+ food3Price+ " *** " + food3+ "\n");
        System.out.println("          .oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.");
    }
}
