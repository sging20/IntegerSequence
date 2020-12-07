import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    for(int i=0; i< other.size(); i++){
      data.add(other.get(i));
    }
    currentIndex= 0;
   }
boolean hasNext(){
  return (if(currentIndex< data.size()));
}
//does the sequence have more elements?
  int next(){
    if(hasNext()){
      currentIndex++;
      return data.get(currentIndex--);
    }
    else{
      throw new NoSuchElementException("No element next.");
    }
  }     //return the current value in the sequence and advances to the next element.
  int length(){
    return (data.length);
  }     //returns the total length of the sequence
  void reset();     //start over from the start of the sequence


}
