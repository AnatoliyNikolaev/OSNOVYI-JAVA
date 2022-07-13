Задача 3.4   Проверка доступа к ресурсу
Описание

В этом задании мы напишем программу для проверки доступа к ресурсу. Во время запуска программы нужно запросить логин или пароль пользователя. Если один из введеных параметров не совпадает (логин/пароль), то нужно выбросить checked исключение UserNotFoundException. Если возраст пользователя менее 18 лет, то нужно выбросить исключение AccessDeniedException, а если 18 и больше лет - вывести сообщение "Доступ предоставлен".

Массив пользователей для авторизации нужно описать до запуска программы. Каждая запись пользователя содержит поля: login, password, age (возраст) и email.
Функционал программы

    Создание Scanner для чтения логина и пароля пользователя из консоли;
    Создание checked исключения UserNotFoundException;
    Создание checked исключения AccessDeniedException;
    Выбрасывать ошибку UserNotFoundException, если логин или пароль введены не верно;
    Выбрасывать ошибку AccessDeniedException, если возраст пользователя меньше 18 лет;
    Если ошибок не возникло, вывести сообщение "Доступ предоставлен".

Процесс реализации

    Создадим класс User, в котором будем хранить инфомрацию о логине, пароле и возрасте пользователя: class User, login, password, email, age;
    Создадим класс исключение UserNotFoundException на основе базового класса Exception. Это исключение будем использовать, если пользователь ввел неверный логин или пароль:

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

    Аналогичным образом создадим класс исключения AccessDeniedException
    Создадим класс Main, в котором создадим метод getUsers, этот метод должен возвращать список заранее созданных пользователей:

public static User[] getUsers() {
    User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
    ...
    return new User[]{user1, ...};
}

    Создадим в классе Main метод getUserByLoginAndPassword(String login, String password), в этом методе нужно найти соответствие пары логина и пароля пользователя из массива, возвращаемого методом getUsers. Если пользователь не найден, выбрасываем исключение UserNotFoundException, если найден - возвращаем найденного пользователя:

public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
    User[] users = getUsers();
    for (User user : users) {
        ...
    }
    throw new UserNotFoundException("User not found");    
}   

    Создадим к классу Main еще один метод validateUser для проверки возрастра пользователя. Если возраст менее 18 лет, метод должен выбросить исключение AccessDeniedException:

public static void validateUser(User user) throws AccessDeniedException

    Добавим последний метод в классе Main для запуска программы public static void main(String[] args) throws UserNotFoundException, AccessDeniedException В нем нужно запросить логин и пароль пользователя, проверить есть ли данная пара "логин и пароль" в массиве пользователей и последним шагом провалидировать возраст.

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        //Проверить логин и пароль
        
        //Вызвать методы валидации пользователя
        
        System.out.println("Доступ предоставлен");
    }

    Программа завершена. Отличная работа!
