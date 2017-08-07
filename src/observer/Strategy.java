package observer;

import subject.Subject;

/**
 * Description:
 * Designer: jack
 * Date: 2017/8/7
 * Version: 1.0.0
 */
public class Strategy implements Observer{

    public void registerObserver(Subject subject) {
        subject.registerObserver(this);
    }

    public void removeObserver(Subject subject) {
        subject.removeObserver(this);
    }

    @Override
    public void update(String position, String strategy) {
        System.out.println(position + "，执行：" + strategy);
    }
}
