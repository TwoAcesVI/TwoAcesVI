import java.util.*;

public class p6point1 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int howMany = sc.nextInt();
        for(int i = 0; i<howMany;i++){
            int Randomnumber =(int) (Math.random()*10)+1;
            numberList.add(Randomnumber);
        }
        System.out.println(Arrays.toString(numberList.toArray()));
        evenNumbers(numberList);
        evenIndex(numberList);
        reverseArray(numberList);
        firstAndlastArray(numberList);

    }
    public void evenNumbers(ArrayList<Integer> list){
        ArrayList<Integer> evennumbersList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                evennumbersList.add(list.get(i));
            }else{
                continue;
            }
        }
        System.out.println(Arrays.toString(evennumbersList.toArray()));
    }
    public void evenIndex(ArrayList<Integer> list){
        ArrayList<Integer> evenIndexList =new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                evenIndexList.add(list.get(i));
            }
            else{
                continue;
            }
        }
        System.out.println(Arrays.toString(evenIndexList.toArray()));
    }
    public void reverseArray(ArrayList<Integer> list) {
        ArrayList<Integer> reverseArray = new ArrayList<>();
        for (int i = list.size(); i > 0; i--) {
            reverseArray.add(list.get(i - 1));
        }
        System.out.println(Arrays.toString(reverseArray.toArray()));
    }
    public void firstAndlastArray(ArrayList<Integer>list){
        System.out.println("["+list.get(0)+", "+list.get(list.size()-1)+"]");
    }

    public static void main(String[] args){
        new p6point1().run();
    }
}

