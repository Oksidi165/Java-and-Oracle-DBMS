public class Main {
    public static void main(String[] args) {
        createDog();
        createCat();

        dogSpeak();
        catSpeak();

        printPetInfo();
    }

    public static void createDog() {
        System.out.println("Создана собака Шурик.");
    }
    
    public static void createCat() {
        System.out.println("Создана кошка Мурка.");
        System.out.println();
    }
    
    public static void dogSpeak() {
        System.out.println("Собака говорит: Гав!");
    }

    public static void catSpeak() {
        System.out.println("Кошка говорит: Мяу!");
        System.out.println();
    }

    public static void printPetInfo() {
        System.out.println("Информация о животных:");
        System.out.println("Собака: Шурик, ему 5 лет, умеет говорить 'Гав!'");
        System.out.println("Кошка: Мурка, ей 3 года, умеет говорить 'Мяу!'");
    }
}
