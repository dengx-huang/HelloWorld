package com.demo.threads;

import com.demo.bean.UserInfo;

public class ThreadRunnable implements Runnable {
    private UserInfo userInfo;

    public ThreadRunnable(UserInfo userInfo){
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        excute();
    }

    private void excute(){
        System.out.println("run方法执行业务逻辑代码,打印userInfo信息");
        System.out.println(userInfo.toString());

    }
}
