import java.util.Objects;

public class Scientist extends Questioner{
    private boolean satisfaction=false;

    Scientist(String name,Question question){
        super(name,question);
        question.setAsked(true);
    }

    @Override
    public void ask(Question question) {
        super.ask(question);

    }

    @Override
    public String toString() {
        return "учёный по имени" + this.name;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj ==this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Scientist s = (Scientist) obj;
        return this.name.equals(s.name) && this.question.equals(s.question) || (this.name != null && this.name.equals(s.name) && this.question.equals(s.question)) || (this.question!= null && this.name.equals(s.name) && this.question.equals(s.question) );

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, question);
    }
    public void makeSatisfaction(){
        super.makeSatisfaction();
    }
}


