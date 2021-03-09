package battery;

public class Accumulator extends Battery implements IChargable{
    /*Task 2
    A  new  battery  (accumulator)  has  appeared,  which  can  be  removed   from   the   flashlight,   charged,
       and   reinserted   into   the  flashlight.  The  maximum  accumulator  charge  is  70  units.
         Accumulators, unlike batteries, let you know your current charge on a small screen.
         Add  tests  for  the  flashlight  with  the  accumulator  and  the  accumulator itself.
     */

    public Accumulator() {
        super(70.0, 70.0);
    }
}
