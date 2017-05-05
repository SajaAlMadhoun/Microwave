//https://www.youtube.com/watch?v=1dM7zIo1AVg
//فيديو شرح كتابة الكود


public class Microwave {
    private int time ;
    private int level ;
    public void raisetime(){
        time = time + 30 ;
       
    }
    public void switchlevel(){
    level= level+1;    
    }
    public void reset (){
        time=0;
        level=0;
    }
public void start(){
    System.out.println("cooking for"+ time+"seconds at level"+ level);
}

        
}

