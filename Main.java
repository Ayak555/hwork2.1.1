public class Main {

    public static void main(String[] args) {

        Shelter shelt1 = new Shelter("Добрые руки", "Бишкек");
        Shelter shelt2 = new Shelter("Волонтеры", "Токмак");

        Dog dog1 = new Dog();
        System.out.println(dog1.getInfo());

        Dog dog2 = new Dog("Алекс", "шарпей", ColorType.BLACK, shelt1);
        System.out.println(dog2.getInfo());

        Dog dog3 = new Dog("Муви", "такса", ColorType.GRAY, shelt2, "Ко мне");
        System.out.println(dog3.getInfo());

        dog1.makeVoice("Гав-гав");
        dog2.makeVoice(2);
        dog3.makeVoice("Муви", 3);

    }
}
