public class counter {
    private int count;

    public void addCount(){
        count= count+1;
    }
    public int getCount(){
        return count;
    }
    public void setCount(int newCount){
        this.count=newCount;
    }
    public void undo(){
        if(this.count>0){
            count=count-1;
        }else{
            System.out.println("Counter is already on 0!");
        }
    }
}
