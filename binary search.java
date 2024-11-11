class binary search {
         int binarybsearch(int arr[],int i,int r,int x)
         {
                      if(">=1) {
                                int mid =1+(r-1)/2;
                                if(arr[mid]== x)
                                         return mid;


                                if(arr[mid]> x)
                                         return binarysrarc h(arr, i,mid- 1, x);
                               //else the element can only be
                             //present in right subarray
                             return binarysearch(arr,mid +1,r,x);
                      }
                      return-1;
         }
         public static void main(string args[])
         }
                     Binarysearch ob = new Binarysearch();
                    //Given array arr[]
                   int arr[]= {2,3,4,10,40,};
                   int x = 10;
                  //function call
                 int result=ob.binarysearch(arr,0,n - 1,x);  

                 if (result==-1)
                             system.out.println("element "+ "not prersent");
                else
                             system.out.println("element found"+ "at index "+result);
        }
}
