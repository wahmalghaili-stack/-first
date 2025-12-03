package Array;

public class arreyss {
    public void tre(int []a){
        System.out.print(" the elment is:");
        for (int i=0;i<a.length;i++)
            System.out.println("index ["+i+"] = "+a[i]);


    }
    public void updata(int[]a,int index,int nvale){
        if(index<0 || index>=a.length)
            System.out.println("index not found");
        else
            a[index]=nvale;
       // System.out.println(a);

    }
    public void dalet(int[]a,int index){
        if(index<0 || index>=a.length)
            System.out.println("index not found");
        else
            a[index]=0;

       // System.out.println(a);

    }
public void shiftLaft_daleet(int[]a,int index){
        for (int i=index;i<a.length-1;i++)
               a[i]=a[i+1];
        a[a.length-1]=Integer.MIN_VALUE;
}
   public int linersearsh(int[]a,int svalue){
          for ( int i=0;i<a.length;i++){

              if (svalue==a[i])
                  return i;

          }
                  return -1;
}
   public int linersearsh(int[]a,int svalue){
        for (int i=0;i<a.length;i++){
            if (svalue==a[i])
                return i;
        }
        return -1;
        }
        public int binarySearsh(int []a,int svale ,int findex,int lindex){
        while (findex<=lindex){
            int mid=(findex+lindex)/2;
            if (svale==a[mid])
                return mid;
            if (svale>a[mid])
                findex=mid+1;
            if(svale<a[mid])
                lindex=mid-1;

        }
return -1;
        int result=arr.binarySearsh(number,2,0,numbers.length-1);
        if(result!=-1)
            System.out.println("vale found at index"+ result);
        else
            System.out.println("not found");
        }
}

//التكليف
public void shiftRight_delete(int[] a, int index) {
    for (int i = index; i > 0; i--) {
        a[i] = a[i - 1];
    }
    a[0] = Integer.MIN_VALUE;
}
