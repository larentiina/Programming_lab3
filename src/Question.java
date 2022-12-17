import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question {
    private String questionSubject;
    private Actions act;
    private ArrayList<String> features;
    private boolean isAsked;
    private boolean isAnswered;


    Question(String questionSubject, Actions act){
        this.questionSubject=questionSubject;
        this.act=act;
        this.features=new ArrayList<String>();
    }

    public Actions getAct() {
        return act;
    }

    public void setFeatures(String s) {
        this.features.add(s);
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public String getQuestionsubject() {
        return questionSubject;
    }

    public boolean isAsked() {
        return isAsked;
    }

    public void setAsked(boolean ask) {
        isAsked = ask;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answer) {
        isAnswered = answer;
    }


}
