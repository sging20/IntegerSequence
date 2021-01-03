import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
    private int currentIndex;
    private int []data;

    public ArraySequence(int[] other){
    this.data= new int[other.length];
    for(int i=0; i< other.length; i++){
      this.data[i]= other[i];
    }
    this.currentIndex= 0;
   }

   public boolean hasNext(){
  return this.currentIndex< this.length();
}
//does the sequence have more elements?
  public int next(){
    int ret= 0;
    if(hasNext() == false){
      throw new NoSuchElementException("No element next.");
  }
  ret= data[currentIndex];
  currentIndex++;
  return ret;
}
       //return the current value in the sequence and advances to the next element.
  public int length(){
    return (this.data.length);
  }     //returns the total length of the sequence

  public void reset(){
    this.currentIndex= 0;
  }     //start over from the start of the sequence

  public ArraySequence(IntegerSequence otherseq){
    otherseq.reset();
    data= new int[otherseq.length()];
    int index=0;
    while(otherseq.hasNext()){
        data[index]= otherseq.next();
        index++;
    }
    otherseq.reset();
  }


}
