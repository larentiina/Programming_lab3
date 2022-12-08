import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question {
    private String questionsubject;
    private Actions act;
    private ArrayList<String> fuatures;
    Question(String questionsubject, Actions act){
        this.questionsubject=questionsubject;
        this.act=act;
        this.fuatures=new ArrayList<String>();
          }

    public Actions getAct() {
        return act;
    }

    public void setFuatures(String s) {
        this.fuatures.add(s);
    }

    public ArrayList<String> getFuatures() {
        return fuatures;
    }

    public String getQuestionsubject() {
        return questionsubject;
    }

}
