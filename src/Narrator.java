import java.util.Objects;

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
        if (q.getFuatures().isEmpty()){
        System.out.println(this.name + " отвечает на вопрос про: " + q.getQuestionsubject());}
        else
        {
            System.out.print(this.name + " отвечает на вопрос про: " + q.getQuestionsubject());
            System.out.print(": ");
            for(String s : q.getFuatures()) {
                System.out.print(s+" ");
            }
            System.out.println();
        }

    }

    @Override
    public String toString() {
        return "Рассказчик по имени" + this.name;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj ==this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Narrator n = (Narrator) obj;
        return this.name.equals(n.name) && this.question.equals(n.question) || (this.name != null && this.name.equals(n.name) && this.question.equals(n.question)) || (this.question!= null && this.name.equals(n.name) && this.question.equals(n.question) );

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, question);
    }
}
