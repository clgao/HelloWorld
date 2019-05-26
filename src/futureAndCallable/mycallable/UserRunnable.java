package futureAndCallable.mycallable;

import futureAndCallable.entity.Userinfo;

public class UserRunnable implements Runnable {

    private Userinfo userinfo;

    public UserRunnable(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        userinfo.setUsername("usernameValue");
        userinfo.setPassword("passwordValue");
    }
}
