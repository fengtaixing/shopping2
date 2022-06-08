package com.itheima.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author taixing
 * @date 2021/7/18
 */
public class ListController {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6);
        Collections.addAll(list2,4,5,13,14,15,16);
      //  getRemove(list, list2);
        Iterator<Integer> iterator = list.iterator();
        Iterator<Integer> it = list2.iterator();
        boolean fay = false;
        while (iterator.hasNext()){
            Integer next = iterator.next();
            while (it.hasNext()){
                Integer next1 = it.next();
                if (next.equals(next1)){
                    fay = false;
                }else {
                   fay = true;

                }
            }
            if (!fay){
              iterator.remove();
            }
        }
list.forEach(System.out::println);

    }

    private static void getRemove(List<Integer> list, List<Integer> list2) {
        //一个集合倒序遍历删除
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 2){
              list.remove(i);
            }
        }
        System.out.println("list:============");
        list.forEach(System.out::println);

        //一个集合使用迭代器遍历删除
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == 13){
                iterator.remove();
            }
            if (iterator.next() == 14){
                iterator.remove();
            }
        }
        System.out.println("list2:=============");
        list2.forEach(System.out::println);
    }

}
