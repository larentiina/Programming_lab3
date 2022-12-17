import java.util.Objects;

public class Narrator implements Talking {

    private String name;
    Narrator(String name){
        this.name=name;
    }


    @Override
    public void talk(String s) {
        System.out.println(this.name + " рассказывает про " + s);

    }

    @Override
    public void answer(Question q) {
        q.setAnswered(true);
        System.out.println(this.name + " отвечает на вопрос про: " + q.getQuestionsubject());
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
        return this.name.equals(n.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
