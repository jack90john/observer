package observer;

/**
 * Description:
 * Designer: jack
 * Date: 2017/8/7
 * Version: 1.0.0
 */
public interface Observer {
    void update(String position, String strategy); //当需要改变战术时将新的战术通知给对应当球员
}

///**
// * 策略接口（战术）
// */
//interface Strategy {
//
//    void executeStrategy();
//
//}
//
///**
// * 具体策略实现类（越位战术）
// */
//class OverSideStrategy implements Strategy {
//
//    @Override
//    public void executeStrategy() {
//        System.out.println("采用越位战术！");
//    }
//
//}
//
///**
// * 具体策略实现类（进攻战术）
// */
//class AttackStarategy implements Strategy {
//
//    @Override
//    public void executeStrategy() {
//        System.out.println("采用进攻战术！");
//    }
//
//}
