public class Scientist extends Questioner{
    private String name;
    private Question question;
    Scientist(String name,Question question){

        this.name=name;
        this.question=question;
    }

    @Override
    public void ask(Question question) {
        System.out.println("Учёный" + this.name+ " Задаёт вопрос:" + " " +question.getAct().str() +" "+ question.getQuestionsubject() + "?");
    }

    @Override
    public String toString() {
        return "учёный по имени" + this.name;
    }
}


