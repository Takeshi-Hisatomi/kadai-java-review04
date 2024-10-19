package animal;

public class Review04 {

    public static void main(String[] args) {
        Human Tanaka = new Human("田中 太郎", 25, "電車");
        Human Suzuki = new Human("鈴木 次郎", 30, "野球");
        Human Sato = new Human("佐藤 花子", 20, "映画");

        Tanaka.say();
        Tanaka.think();
        Suzuki.say();
        Suzuki.think();
        Sato.say();
        Sato.think();
    }
}
