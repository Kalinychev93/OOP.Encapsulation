import transport.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("OOP.Encapsulation");
        System.out.println("");

        Car auto1 = new Car( "Lada", "Granta", 1.7, "желтый", 2015,"Россия",
                "МКПП", "седан", "a218po88", 5, true, null);
        Car auto2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия",
                "АКПП", "хэтчбек", "a981po78", 4, false,
                new Car.Key(true, false));
        Car auto3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия",
                "МКПП", "купе", "м111во88", 5, true,
                new Car.Key(true, true));
        Car auto4 = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея",
                "АКПП", "кроссовер", "a211po88", 6, false,
                new Car.Key(false, true));
        Car auto5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                "МКПП", "хэтчбек", "р219ук76", 5, true, null);

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
        System.out.println(auto5);

        System.out.println("");
//      Проверка метода "поменять резину"
        auto1.changeTyres(1);
        System.out.println(auto1);

    }
}