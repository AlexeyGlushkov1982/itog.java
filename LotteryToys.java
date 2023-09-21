import java.io.FileNotFoundException;

public class LotteryToys {
    public static void main(String[] args) throws FileNotFoundException {

        FileClear.fileClear();                                                                      //очистка файла

        Store store = new Store();                                                                 //создание магазина с
        Counter_id counter = new Counter_id(0);                                                   // создание автозаполнение id
        UI ui = new UI();                                                                         //создание интерфейса с пользователем

        Toy car = new Toy(counter.getId(), "Машинка", 10, 20);                  //создание игрушек
        Toy robot = new Toy(counter.getId(), "Робот", 200, 40);
        Toy ball = new Toy(counter.getId(), "Мяч", 200, 40);
        Toy playgame = new Toy(counter.getId(), "Настольная игра", 200, 40);
        Toy shar = new Toy(counter.getId(), "Шарик", 200, 95);
        Toy kukla = new Toy(counter.getId(), "Кукла", 10, 10);


        store.addToy(car);                                                                          //добавления игрушек в магазин
        store.addToy(robot);
        store.addToy(ball);
        store.addToy(playgame);
        store.addToy(shar);
        store.addToy(kukla);

        ui.userMenu(store, counter, store.getToys());                                               // работа приложения в пользовательском интерфейсе





    }

}