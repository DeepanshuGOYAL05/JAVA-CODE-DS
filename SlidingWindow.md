#Sliding Window

Time        Space
Using Iteration :             O(n*k)        O(1)
Using AVL Trees/Priority Queue:     O(n * logk)    O(k)
Using Deque        Amortized     O(N)         O(k)
since each element is processed (add/remove) at most twice.

Eg. a = {4 , 1 , 3 , 5 , 1, 2 , 3 , 2 , 1 , 1 , 5 }  , k=3
Ans  =  {4, 5 , 5 , 5 , 3, 3, 3, 2, 5 }
Use a max heap, we insert the first 3 elements. And then return the top element 4.


```
public int[] maxSlidingWindow(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int[] res = new int[nums.length-k+1];
    for(int i = 0; i<k; i++) {
        pq.add(nums[i]);
    }
    int j=0;
    res[j++] = pq.peek();
    pq.remove(nums[0]);
   
    for(int i=k; i<nums.length;i++) {
        pq.add(nums[i]);
        res[j++]=pq.peek();
        pq.remove(nums[i-k+1]);
    }
   
    return res;
}
```
