package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class dddd {
    public static void main(String[] args) {

        List<SortBean> list = new ArrayList<>();

        SortBean sortBean0 = new SortBean("德玛", 20, 20180001);
        SortBean sortBean1 = new SortBean("寒冰", 18, 20180009);
        SortBean sortBean2 = new SortBean("流浪", 99, 20180002);

        list.add(sortBean0);
        list.add(sortBean1);
        list.add(sortBean2);

        System.out.println("before sort ");
        for (SortBean sortBean : list) {
            System.out.println("name: " + sortBean.getName() + "  age: " + sortBean.getAge());
        }

        Collections.sort(list, new Comparator<SortBean>() {
            @Override
            public int compare(SortBean o1, SortBean o2) {
                if (o1.getUserId() - o2.getUserId() < 0) { //变成 < 可以变成递减排序
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        System.out.println("after sort ");
        for (SortBean sortBean : list) {
            System.out.println("name: " + sortBean.getName() + "  age: " + sortBean.getAge());
        }
    }
}

