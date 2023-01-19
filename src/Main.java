import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("OOP.SkyPro");
        System.out.println("");

        Car auto1 = new Car("Lada", "Granta", 2015,
                "Россия", "желтый",150,
                1.7, "МКПП", "седан",
                null, 5, true,
                new Car.Key(true, false));

        Car auto2 = new Car("Audi", "A8 50 L TDI quattro", 2020,
                "Германия", "черный", 278.9,
                3.0, "АКПП", "хэтчбек",
                "a981po78", 5, false,
                new Car.Key(true, true));

        Car auto3 = new Car("BMW", "Z8", 2021,
                "Германия", "  ", 291.3,
                3.0, "АКПП", null,
                "п293оо77", 5,true,
                new Car.Key(false, true));

        Car auto4 = new Car("Kia", "Sportage", 2018,
                "Южная Корея", null, 252.2,
                2.4, "", "кроссовер",
                "a211po88", 5, false,
                new Car.Key(true, true));

        Car auto5 = new Car("Hyundai", "Avante", 2016,
                "Южная Корея", "оранжевый", -100,
                1.6, "АКПП", "  ",
                null, 5, false,
                new Car.Key(false,false));

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
        System.out.println(auto5);

        System.out.println("");
//      Проверка метода "поменять резину"
        auto1.changeTyres(1);
        System.out.println(auto1);
        System.out.println("");

        Bus bus1 = new Bus("Mercedes", "Benz", 2022, "Germany", "black", 178.2);
        Bus bus2 = new Bus("MAN", "X1", 0, "Belarus", "black", 173.2);
        Bus bus3 = new Bus("KAMAZ", "Next", 2022, "Russia", null, 178.2);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

    }
}