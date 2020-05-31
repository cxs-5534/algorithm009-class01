### 本周要点

本周主要学习了哈希表、树、堆。树的内容中主要是前中后序遍历内容；堆在面试中可以解决最大k个元素等问题，可以调用heapq模块进行实现。接下来着重对哈希表进行总结。

#### 什么是哈希表

**哈希表**：
在哈希表中，我们可以利用哈希函数快速访问到数组中的目标数据。如果发生哈希冲突，就使用链表进行存储。这样一来，不管数据量为多少，我们都能够灵活应对。如果数组的空间太小，使用哈希表的时候就容易发生冲突，线性查找的使用频率也会更高；反过来，如果数组的空间太大，就会出现很多空箱子，造成内存的浪费。因此，给数组设定合适的空间非常重要。

**哈希函数的6个特征：**

①输出的哈希值数据长度不变
②如果输入的数据相同，那么输出的哈希值也必定相同
③即使输入的数据相似，但哪怕它们只有一比特的差别，那么输出的哈希值也会有很大的差异。输入相似的数据并不会导致输出的哈希值也相似
④即使输入的两个数据完全不同，输出的哈希值也有可能是相同的，虽然出现这种情况的概率比较低。这种情况叫作“哈希冲突”
⑤不可能从哈希值反向推算出原本的数据，即输入和输出不可逆
⑥求哈希值的计算相对容易。哈希函数的算法中具有代表性的是MD5、SHA-12和SHA-2等。其中SHA-2是现在应用较为广泛的一个，而MD5和SHA-1存在安全隐患，不推荐使用

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200531180908769.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2N4czU1MzQ=,size_16,color_FFFFFF,t_70#pic_center)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200531181232863.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2N4czU1MzQ=,size_16,color_FFFFFF,t_70#pic_center)
注：图1为哈希表存储位置“冲突”时的情况，图2为“哈希冲突”，这两个不是一回事。

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200531211459552.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2N4czU1MzQ=,size_16,color_FFFFFF,t_70)
---
>参考链接：
>Java Set 文档
><http://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Set.html>
>Java Map 文档
><http://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Map.html>
>美国旧金山大学整理制作的算法可视化动画演示网站
><https://www.cs.usfca.edu/~galles/visualization/Algorithms.html>
>数据结构动态可视化网站：
><https://visualgo.net/zh>