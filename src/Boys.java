public class Boys extends Children {

    //поля класса
    static int numberBoys = 0;

    //конструктор класса
    public Boys(String gender) {
        super(gender);
        numberBoys++;
    }

    @Override
    public void setEyesColor(String eyesColor) {
        super.setEyesColor(eyesColor);
        System.out.println(" Фиг с ними, с глазками. Я ж мужик! Мне другое важно!");
    }

    @Override
    public void setTemperament(String temperament) {
        super.setTemperament(temperament);
    }

    public static int getNumber() {
        return numberBoys;
    }
}
