

public class SmallerLarger{
public static void main(String args[]){
int arr[]= {21,1,-10,-99,2,102,99,100,1993};
int min=arr[0];
int max=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i] < min){
min=arr[i];
}
if(arr[i]>max){
max = arr[i];
}
}
System.out.print("Smallest" +min+"Largest"
  +max  );
}
}