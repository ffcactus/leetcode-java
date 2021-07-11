# leetcode-java

# Backtracking
Backtracking is a kind of BFS.
The helper function has the following form.
```java
void backtracking(参数) {
    if (终止条件) {
        存放结果;
        return;
    }

    for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）) {
        处理节点;
        backtracking(路径，选择列表); // 递归
        回溯，撤销处理结果
    }
}
```
## Typical questions
1. Given 4 numbers, find all the solutions that using them to form a time expression.
   For example give your [1,2,3,4], the time expression can be 12:34, 12:43, 13:24, 13:42 and etc.
   Here is the feature to this question:
   * A solution need includes all the inputs.
   * Permutation problem
2. Give your a number string, for example "123345" find out all the possible IPv4 expression.
   For example, it can be "12.33.45", "123.3.45", "1.233.4.5" and etc.
   Here is the feature to this question:
   * A solution must follow the order to the input.