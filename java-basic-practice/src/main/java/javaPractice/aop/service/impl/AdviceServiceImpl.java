package javaPractice.aop.service.impl;

import javaPractice.aop.service.AdviceService;
import org.springframework.stereotype.Service;

@Service
public class AdviceServiceImpl implements AdviceService {
    private String name;

    @Override
    public String findUser() {
        System.out.println("***************执行业务方法findUser,查找的用户名字为:"+name+"****************");

        return null;
    }

    @Override
    public void addUser() {
        System.out.println("***************执行业务方法addUser****************");
        throw new RuntimeException();
    }
}
