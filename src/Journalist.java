public class Journalist extends Questioner {
    private String name;
    private Question question;

    Journalist(String name,Question question){
        this.name=name;
    this.question=question;}


    @Override
    public void ask(Question question) {
        System.out.println("Журналис "+ this.name+ "Задаёт вопрос" + question.getQuestionsubject());
    }

    @Override
    public String toString() {
        return "журналист по имени" + this.name;
    }
}
