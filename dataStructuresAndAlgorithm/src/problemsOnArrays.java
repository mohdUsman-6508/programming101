public class problemsOnArrays {

    //////////////////////////////////////////////////////////////////////////////////////////////////
    public static int uniqueNum(int[] array){

        int size=array.length;

        int ans=-1;

        for (int i=0;i<array.length;i++){

            for (int j=i+1;j<array.length;j++){

                if (array[i]==array[j]){

                    array[i]=-1;
                    array[j]=-1;

                }

            }

        }


        for (int i=0;i<array.length;i++){
            if (array[i]>-1){
                ans=array[i];

            }
        }

        return ans;
    }

    public static void main(String[] args) {



/////////////////////////***********problem - 1*********////////////////////////////////
//        int[] arr={4,6,3,5,8,9,1};
//        int target=9;
//        int count=0;
//
//
//        for (int i=0;i<arr.length;i++){
//
//            for (int j=i+1;j<arr.length;j++){
//                if (target==arr[i]+arr[j]){
//                    System.out.println("("+arr[i]+","+arr[j]+")");
//                    count++;
//                }
//
//
//            }
//
//
//
//        }
//        System.out.println("total number of unique pairs : "+ count);
//

    //////////////////////////////////////////triplet/////////////////////////////////


//    int[] arr={1,4,5,6,3};
//    int target=12;
//    int count=0;
//
//
//        for (int i=0;i<arr.length;i++){
//
//             for (int j=i+1;j<arr.length;j++){
//
//                 for (int k=j+1;k<arr.length;k++){
//
//                     if (target==arr[i]+arr[j]+arr[k]){
//                         System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
//                         count++;
//                     }
//                 }
//
//
//             }
//
//        }
//        System.out.println("total number of unique pairs : "+ count);

        //////////////////////////////////unique element while given every element is occurring twice///////////////////////////

///itna lamba code likhne ke baad bhi ye code sirf positive no ke liye he kaam kar raha he pata nhe itna complex kyun sochta hun
 int[] arr={0,1,2};

 int max1=0;
 for (int i=0;i<arr.length;i++){
     if (max1<arr[i]){
         max1=arr[i];
     }
 }
//        System.out.println(max1);
//        System.out.println(uniqueNum(arr));


        int[] arr2=new int[arr.length];


        int[] temparr=new int[arr.length];

        for (int i=0;i<temparr.length;i++){
            temparr[i]=max1;
        }


       arr2=arr.clone();
        int[] farr=new int[arr.length];

        for (int i=0;i<arr2.length;i++){

            farr[i]=temparr[i]-arr2[i];
        }

//        for (int i=0;i<farr.length;i++){
//            if (farr[i]==0){
//                farr[i]=max1;
//            }
//        }

        for(int i=0;i<arr2.length;i++){
            System.out.println(farr[i]);


      }

        int ans=0;
        int min=max1;
       for (int i=0;i<farr.length;i++){
           if (farr[i]!=0 && min>farr[i]){
               min=farr[i];
               ans=i;
           }
       }

//        System.out.println(min);
          System.out.println(ans);

        System.out.println("second largest element in the given array :"+arr[ans]);
    }}