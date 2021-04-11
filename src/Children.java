public class Children {

    //поля суперкласса
    String name;
    String  gender;
    String eyesColor;
    String temperament;
    static  int number = 0;

    //конструктор суперкласса
    public Children(String gender) {
        this.gender = gender;
        if (this.gender.equals("male")) {
            System.out.println("Я родился!");
        } else if (this.gender.equals("female")){
            System.out.println("Я родилась!");
        } else {
            System.out.println("Я родилось! А кто я?");
        }
        number++;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
        System.out.print("У меня " + this.eyesColor + " глазки, как у мамы.");
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
        if (this.temperament.equals("сангвиник")) {
            System.out.println("Я вырасту жизнерадостным и общительным человеком!");
        } else if (this.temperament.equals("холерик")) {
            System.out.println("Я буду человеком вспыльчивым и эмоциональным!");
        } else if (this.temperament.equals("меланхолик")) {
            System.out.println("Я человек сдержанный и медлительный. И вообще, радуйтесь жизни в другом месте.");
        } else if (this.temperament.equals("флегматик")) {
            System.out.println("Я - робот! Я - робот!");
        } else {
            System.out.println("Я уникальная личность! Завидуйте молча, пожалуйста!");
        }
    }

    public static int getNumber() {
        return number;
    }
}
