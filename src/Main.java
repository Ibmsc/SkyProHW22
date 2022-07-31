public class Main {
    public static void main(String[] args) {

        Griffindor[] griffindors = {
                new Griffindor(" Гарри "," Поттер ",90,80,7,8,9),
                new Griffindor(" Гермиона "," Грейнджер ",81,90,8,6,7),
                new Griffindor(" Рон "," Уизли ",76,79,8,7,6)
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff(" Захария "," Смит ",76,72,7,8,9),
                new Hufflepuff(" Седрик "," Диггори ",58,90,4,6,7),
                new Hufflepuff(" Джастин "," Финч-Флетчли ",74,60,9,2,4)
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw(" Чжоу "," Чанг ",80,90,7,8,5,6),
                new Ravenclaw(" Падма "," Патил ",80,90,8,6,5,9),
                new Ravenclaw(" Маркус "," Белби ",69,50,7,5,8,4)
        };
        Slytherin[] slytherins = {
                new Slytherin(" Драко "," Малфой ",88,79,9,5,7,
                        8,10),
                new Slytherin(" Грэхэм "," Монтегю ",74,50,7,8,9,
                        4,7),
                new Slytherin(" Грегори "," Гойл ",50,90,8,7,6,
                        2,5)
        };


        PrintService printService = new PrintService();

        printService.print (griffindors);
        printService.print (hufflepuffs);
        printService.print (ravenclaws);
        printService.print (slytherins);
        System.out.println();
        new Hogwarts().campare(slytherins[0],griffindors[1]);

    }
}