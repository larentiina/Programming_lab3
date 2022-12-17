public class Main {
    public static void main(String[] args) {
        Narrator n1 = new Narrator("Незнайка");
        n1.talk(Rocket.device);
        n1.talk(Rocket.management);
        System.out.println("");

        Question q3 = new Question("food",Actions.EAT);
        Questioner j1 = new Journalist("Журналист 1",q3);

        j1.ask(q3);
        n1.answer(q3);
        j1.makeSatisfaction();
        System.out.println("");

        Question q4 = new Question("drinks",Actions.DRINK);
        Journalist j2 = new Journalist("Журналист 2",q4);
        j2.ask(q4);
        j2.makeSatisfaction();
        System.out.println("");

        Question q5 = new Question("dreams",Actions.SEE);
        Journalist j3 = new Journalist("Журналист 3",q5);
        j3.ask(q5);
        n1.answer(q4);
        System.out.println("");

        Question q1 = new Question("Davilon city",Actions.LIKE);
        q1.setFeatures("citizens");
        Journalist j4 = new Journalist("Журналист 4",q1);
        j4.ask(q1);
        n1.answer(q1);
        System.out.println("");

        Question q6 = new Question("space travel",Actions.SEE);
        Scientist s1 = new Scientist("Учёный 1",q6);
        s1.ask(q6);
        n1.answer(q6);
        System.out.println("");

        Question q2 = new Question("moon",Actions.SEE);
        q2.setFeatures("surface");
        Scientist s3 = new Scientist("Учёный 3",q2);
        s3.ask(q2);
        n1.answer(q2);
        System.out.println("");

        Question q7 = new Question("The BigEarth",Actions.LOOK);
        Scientist s2 = new Scientist("Учёный 2",q7);
        s2.ask(q7);
        n1.answer(q7);
        System.out.println("");




    }
}