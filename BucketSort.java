public class BucketSort{

//1.先便利数组，确定最大值
//2.确定长度：最大值+1
//3.创造新的数组，计数：每找到一次数，在相对应地数组上+1
//4.输出数组里不为0的
  public static void main(String[] args){
  int a[] = {1,2,3,9,5};
  int temp = 0;
  for(int i = 0; i < a.length; i++){
    if(a[i] > temp){
      temp = a[i];
    }
  }
// a {1,2,0,100,2} b {0,1,2...1}
//                    0 1 2 ..100
  int[] b = new int[temp+1];
  for(int n = 0; n < a.length; n++){
    b[a[n]]++;//b[n] = b[n] + 1;
  }
  for(int c = 0; c < b.length; c++){
    if(b[c] != 0){
      int d = b[c];
      while(d > 0){
        System.out.print(c);
        d--;
      }
    }
  }
}
}