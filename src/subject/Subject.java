package subject;


import observer.Observer;

/**
 * Description:
 * Designer: jack
 * Date: 2017/8/7
 * Version: 1.0.0
 */
public interface Subject {
    void registerObserver(Observer observer);    // 注册观察者

    void removeObserver(Observer observer);      //删除观察者

    void notifyObservers();      //当主题改变时，调用这个方法通知所有观察者
}
