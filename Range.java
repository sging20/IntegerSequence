  import java.util.NoSuchElementException;
  public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int startinput,  int endinput){
      start= startinput-1;
      end= endinput;
      current = start;
    }
  public void reset(){
      current = start;
    }
    public int length(){
        return (Math.abs(start- end));
      }
    public boolean hasNext(){
        if(current < end){
          return true;
        }
        else{
          return false;
        }
      }
}
