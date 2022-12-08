import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Narrator n1 = new Narrator("Незнайка");
        n1.talk(Rocket.device);
        n1.talk(Rocket.managment);
        Question q1 = new Question("space travel",Actions.SEE);
        q1.setFuatures("moon");
        Scientist s1 = new Scientist("1",q1);
        s1.ask(q1);
        n1.answer(q1);


    }
}