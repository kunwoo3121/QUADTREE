# QUADTREE

https://algospot.com/judge/problem/read/QUADTREE

# 구현 방법

그림을 상하로 뒤집을 경우 항상 제 1사분면과 제 3사분면의 위치가 바뀌고 제 2사분면과 제 4사분면의 위치가 바뀐다는 것을 알면 재귀함수를 통해 간단하게 구현할 수 있다.
```  
  ex1) xbwxwbbwb 가 입력으로 들어오는 경우
  
  제 1사분면은 b, 제 2사분면은 w  
  
  제 3사분면은 다시 4개의 사분면으로 나누어지고 제 1사분면은 w, 제 2사분면은 b, 제 3사분면은 b, 제 4사분면은 w 이므로 상하로 뒤집을 경우 xbwwb 가 된다.  
  
  그리고 마지막으로 제 4사분면은 b 이므로 상하로 뒤집을 경우 xxbwwbbbw 가 된다.
  
  ex2) xxwwwbxwxwbbbwwxxxwwbbbwwwwbb 가 입력으로 들어오는 경우
  
  제 1사분면 -> 제 1사분면 = w, 제 2사분면 = w, 제 3사분면 = w, 제 4사분면 = b 따라서 상하로 뒤집으면 xwbww가 된다.  
  제 2사분면 -> 제 1사분면 = w, 제 2사분면 -> 제 1사분면 = w, 제 2사분면 = b, 제 3사분면 = b, 제 4사분면 = b => xbbwb    
               제 3사분면 = w, 제 4사분면 = w => xwwwxbbwb
  제 3사분면 -> 제 1사분면 -> 제 1사분면 -> 제 1사분면= w, 제 2사분면 = w, 제 3사분면 = b, 제 4사분면 = b => xbbww, 제 2사분면 = b, 제 3사분면 = w, 제 4사분면 = w =>  xwwxbbwwb
               제 2사분면 = w, 제 3사분면 = w, 제 4사분면 = b => xwbxwwxbbwwbw
  제 4사분면 -> b
  
  => xxwbxwwxbbwwbwbxwbwwxwwwxbbwb 가 된다.
```  
