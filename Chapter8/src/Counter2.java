public class Counter2 {
    private int count;
    private int limit;

    public int getCount(){
        return this.count;
    }
    public void setLimit(int maximum){
        this.limit=maximum;
    }
    public void undo(){
        if(this.count>0){
            this.count-=1;
        }else{
            this.count=0;
        }
    }
    public void count(){
        if(this.count==this.limit){
            System.out.println("Limit is reached!");
        }else{
            this.count=this.count+1;
        }
    }
    public void reset(){
        this.count=0;
    }
}
