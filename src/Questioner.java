abstract class Questioner implements Asking {
    String name;
    Question question;
    boolean satisfaction;

    Questioner(String name, Question question) {
        this.name = name;
        this.question = question;
        question.setAsked(true);
    }

    public void ask(Question question) {
        if (question.equals(this.question)) {
            System.out.println(this.name + " Задаёт вопрос про объект:" + question.getQuestionsubject());
            System.out.println("Действие совершаемое с объектом вопроса: " + question.getAct().str());

            {
                if (!question.getFeatures().isEmpty()) {
                    System.out.print("а конкретно про: ");
                    for (String s : question.getFeatures()) {
                        System.out.print(s + " ");
                    }
                    System.out.println();

                }
            }

        } else
            System.out.println(this.name + "не может задать этот вопрос");
    }
        public void makeSatisfaction(){
            if (this.question.isAnswered() && this.question.isAsked()) {
                this.satisfaction = true;
                System.out.println(this.name + " доволен ответом");
            } else if (!this.question.isAnswered() && this.question.isAsked()) {
                System.out.println(this.name + " недоволен");
            }
        }
    }


