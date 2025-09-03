import java.util.ArrayList;

public class array {
    public static void main(String[]args){
       ArrayList<Integer> aa=new ArrayList<>();
        int order[]={1,2,3,4,5};
        int friends[]={3,4,5,6};
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(friends[j]==order[i]){
                    aa.add(order[i]);
                    break;
                    
                }
            }
            
        }
        int a1[]=new int[aa.size()];
        for(int a=0;a<aa.size();a++){
            a1[a]=aa.get(a);
        }
        System.out.println(a1);

    }
}
