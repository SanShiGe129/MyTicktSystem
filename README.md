++++直接运行test可以运行本程序+++++<br>

# 1.0版

 + 实现了题目输出样例要求打印信息<br>

# 2.0版

* 添加了原价 折后价等信息

* 注意打折问题不存在精度损失！2019.6.21
* ++存在问题

 + 学生票,普通票每次输入票信息是都要输入钱数，增加了出错的几率，当电影名
 +  相同时，他们的价格相同,可以通过提前设置电影名和价格来规避这个问题！
 +  子类重复打印输出信息,代码不够简洁
 + 2019.6.21;<br>

# 3.0版(本程序版本)

* 实现2.0版问题里的功能

 + ++++存在的问题
 + 在判断有固定长度对象数组里，是否存在对象中的某一个元素！没有元素时,遍历到最后一个元素为空的问题
 +  非静态数组不能数据共享 可以用静态解决这个问题！
 + 发现找到票后无法有效设置钱数！(已修复)
 + 变量类型没有考虑好导致重复修改！
 + 数组的下标出错！
 + 无法从有效的引用类型的数据中查找某个元素
 + 完成时间2019年6月24日00:53:43<br>

# 4.0版(下一版本)

 +  在（4.0Ver分支）
 +  开发菜单功能可以返回上一个目录 可以进入下个目录，且可以退出！
 +  简化键入功能 
