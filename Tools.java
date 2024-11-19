public class Tools {
    int i=0;
    public int countRepitition(int a,int[] b){
        int res=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==a){
             res++;
            }
        }
        return res;
    }
    public boolean existElement(int a,int[] b){
        for(int i=0;i<b.length;i++){
            if(b[i]==a){
                return true;
            }
        }
        return false;
    }
    public int[] addElement(int a,int b[]){
        for(int i=0;i<b.length;i++){
            if(b[i]==-1){
                b[i]=a;
                return b;
            }
        }
        return b;
    }

}
