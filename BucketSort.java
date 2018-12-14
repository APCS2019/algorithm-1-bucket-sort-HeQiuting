1.先便利数组，确定最大值
2.确定长度：最大值+1
3.创造新的数组，计数：每找到一次数，在相对应地数组上+1
4.输出数组里不为0的
int temp = 0;
for(int i = 0; i < a.length; i++){
  if(a[i] > temp){
    temp = a[i];
  }
}
int[] b = new int[temp+1];
for(int n = 0; n < b.length; n++){
  if(a[i] == n){
    b[n]++;
  }
}


  
