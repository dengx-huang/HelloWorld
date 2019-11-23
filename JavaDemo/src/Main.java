import com.demo.bean.UserInfo;
import com.demo.threads.ThreadRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        System.out.println("Hello World!");
        UserInfo userInfo = createUser();
        if (userInfo == null){
            System.out.println("userInfo对象为空");
            return;
        }
        Thread t1 = new Thread(new ThreadRunnable(userInfo));
        Thread t2 = new Thread(new ThreadRunnable(userInfo));
        t1.start();
        t2.start();
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        executorService.submit(new ThreadRunnable(userInfo));

        System.out.println("----------main end----------");
        System.out.println("耗时："+(System.currentTimeMillis()-t) + "ms");
    }

    public static UserInfo createUser(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("Tom");
        userInfo.setAge(20);
        userInfo.setAddr("beijing");
        userInfo.setCode("001");
        return userInfo;
    }
}
