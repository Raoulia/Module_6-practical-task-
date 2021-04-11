public class Girls extends Children {

    //поля класса
    static int numberGirls = 0;

    //конструктор класса
    public Girls(String gender) {
        super(gender);
        numberGirls++;
    }

    @Override
    public void setEyesColor(String eyesColor) {
        super.setEyesColor(eyesColor);
        System.out.println(" И у соседа дяди Вани глаза такие же...");
    }

    @Override
    public void setTemperament(String temperament) {
        super.setTemperament(temperament);
    }

    public static int getNumber() {
        return numberGirls;
    }
}
