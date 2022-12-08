public class Narrator implements Talking {
    private String name;
    private Question question;
    Narrator(String name){
        this.name=name;
    }


    @Override
    public void talk(String s) {
        System.out.println(this.name + " рассказывает про " + s);

    }

    @Override
    public void answer(Question q) {
        if (q.getFuatures()==null){
        System.out.println(this.name + " отвечает на вопрос про: " + q.getQuestionsubject());}
        else
        {
            System.out.print(this.name + " отвечает на вопрос про: " + q.getQuestionsubject());
            System.out.print(" а конкретно про: ");
            for(String s : q.getFuatures()) {
                System.out.print(s+" ");
            }
        }

    }

    @Override
    public String toString() {
        return "Рассказчик по имени" + this.name;
    }
}
