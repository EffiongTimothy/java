package chapterThree.tdd;

public class AutomaticBike {
    private boolean state;
    private int guage;

     public void turnOn()
       {this.state = true;}
            public void turnOff()
           {state = state;}

             public boolean getState()
                {return state;}

                  public void accelerate(int gear)
                    {this.guage = gear;}
                    public void accelerateSpeedGuage(int mph) {
                   this.guage = mph + guage;}
                      public void decelerate(int gear)
                         {this.guage = gear;}
                        public void decelerateSpeedGuage(int mph) {
                        this.guage = mph - guage;}
                           public int getGuage()
                             {return guage;}



}