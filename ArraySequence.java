import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    for(int i=0; i< other.size(); i++){
      data.add(other.get(i));
    }
   }

}//does the sequence have more elements?
  int next();       //return the current value in the sequence and advances to the next element.
  int length();     //returns the total length of the sequence
  void reset();     //start over from the start of the sequence


}