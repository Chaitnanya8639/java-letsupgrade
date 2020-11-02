package com.quizapplication;

public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is the Strongest Avenger?","What is the closest planet to sun?","What is the capital of australia?"};
    String[] options1={"Ironman","Earth","Sydney"};
    String[] options2={"Thor","Venus","Perth"};
    String[] options3={"Hulk","Mercury","Melbourne"};
    String[] options4={"Dr Strange","Jupiter","Canberra"};
    int[] answers={2,3,4};


    public void initGame()
    {
//        created three objects
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }
//        applying values to the variables of the object
//        questions[0].question="Who is the Strongest Avenger?";
//        questions[0].option1="";
//        questions[0].option2="Thor";
//        questions[0].option3="Hulk";
//        questions[0].option4="Dr Strange";
//        questions[0].correctAnswer=2;
//
//        questions[1].question="";
//        questions[1].option1="Earth";
//        questions[1].option2="Venus";
//        questions[1].option3="Mercury";
//        questions[1].option4="Jupiter";
//        questions[1].correctAnswer=3;
//
//        questions[2].question="";
//        questions[2].option1="Sydney";
//        questions[2].option2="Melbourne";
//        questions[2].option3="Perth";
//        questions[2].option4="Canberra";
//        questions[2].correctAnswer=4;

        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Bahot hi unda khele hai aap!!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Maaf karna mai aapki sahyata nahi kar sakta");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}
