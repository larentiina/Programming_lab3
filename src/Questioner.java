abstract class Questioner implements Asking {
    String name;
    Question question;
    Questioner(String name, Question question){
        this.name=name;
        this.question=question;
    }

    public void ask(Question question){
        if (question.equals(this.question)){
            System.out.println(this.name+ " Задаёт вопрос " + question.getQuestionsubject());
        {if (question.getFuatures().isEmpty()==false)
         {
            System.out.print(" а конкретно про: ");
            for(String s : question.getFuatures()) {
                System.out.print(s+" ");
            }
            System.out.println();

        }System.out.println(this.name+ " Задаёт вопрос:" + " " +question.getAct().str() +" "+ question.getQuestionsubject());}}
        else
            System.out.println(this.name + "не может задать этот вопрос");
    }
}