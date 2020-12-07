  import java.util.NoSuchElementException;
  public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int startinput,  int endinput){
      start= startinput;
      end= endinput;
      current = start;
    }

  public void reset(){
      current = start;
    }

    public int length(){
        return (Math.abs(start- end) +1);
      }

    public boolean hasNext(){
        if(current < end){
          return true;
        }
        else{
          return false;
        }
      }

    public int next(){
      if(hasNext()){
            current++;
          return current;
        }
      else{
        throw new NoSuchElementException("No element next.");
      }
    }       //return the current value in the sequence and advances to the next element.
}
