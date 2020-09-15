package javaPractice.collection.array;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedList
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println(list.remove());
        System.out.println(list);


        //添加元素  增加，删除，查询
        list.addFirst(0);
        list.addLast(1);
        list.add(2,2);//必须在有索引范围内 不能跳跃  不能直接添加下标为10的
        list.add(10);//在列表结尾添加元素
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println("list:"+list);


        System.out.println(list.offer(10));//从队尾添加
        System.out.println(list);
        System.out.println(list.offerFirst(11));//对头添加
        System.out.println(list.offerLast(15));//队尾添加
        System.out.println(list);



        System.out.println(list.contains(2));
        System.out.println(list.size());

        //替换：修改
        System.out.println(list.set(1,10));//替换
        System.out.println(list);

        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(3));

        /******** Queue操作 ************************
         *
         */

        System.out.println("list："+ list);
        System.out.println(list.peek());//队列不为null
        System.out.println(list.element());//队列不为null
        System.out.println(list.peekFirst());//获取队头元素
        System.out.println(list.peekLast());//获取队尾元素

        System.out.println(list.remove());//
        System.out.println(list.poll());
        System.out.println(list);

        System.out.println(list.removeFirst());//移除队头元素并返回
        System.out.println(list.removeLast());//移除队尾元素并返回
        System.out.println(list);

        list.push(18);//插入到队头 将元素推入此列表所表示的堆栈（插入到列表的头）
        System.out.println(list);
        list.pop();//从此列表所表示的堆栈处弹出一个元素（获取并移除列表第一个元素）
        System.out.println(list);


        LinkedList<Integer> listempty  = new LinkedList<>();
        System.out.println("listempty:"+listempty);
        System.out.println("listempty.peek():"+listempty.peek());//如果对列为null，返回null
        //System.out.println("listempty.element():"+listempty.element());//如果对列为null，null指针


        /******** 遍历 ************************
         *
         */

        LinkedList<Integer> listfor  = new LinkedList<>();
        for (int i = 0; i < 100 ; i++) {
            listfor.add(i);
        }

        //
        Iterator<Integer>  iterator =  listfor.iterator();
        while(iterator.hasNext()){
            iterator.next();

        }

        for (int i = 0; i < listfor.size(); i++) {
            listfor.get(i);
        }

        for ( Integer i  : listfor) {
            listfor.get(i);
        }


    }


}
