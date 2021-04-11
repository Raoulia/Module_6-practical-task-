public class Main {

    public static void main(String[] args) {

        Children children = new Girls("female");
        children.setEyesColor("голубые");
        children.setTemperament("сангвиник");

        Children children1 = new Boys("male");
        children1.setEyesColor("серые");
        children1.setTemperament("меланхолик");

        Children children2 = new Children("");
        children2.setTemperament("");

        Boys boy = new Boys("male");
        boy.setEyesColor("чёрные");
        boy.setTemperament("");

        System.out.println(Girls.getNumber() + " девочки/девочек.");
        System.out.println(Boys.getNumber() + " мальчика/мальчиков.");
        System.out.println("Общее количество детей: " + Children.getNumber());
    }
}
