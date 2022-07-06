package com.itheima.B;

import com.itheima.C.Demo_C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taixing
 * @date 2021/7/18
 */
@RestController
public class Demo_B {
    public static void main(String[] args) {
        System.out.println("分支111，数据");
        System.out.println("分支111，数据");
    }

    @Autowired
    private Demo_C demo_c;

    @GetMapping("test")
    public  void test01() {
        System.out.println("分支111，数据2222");
        demo_c.test01();
    }
}
