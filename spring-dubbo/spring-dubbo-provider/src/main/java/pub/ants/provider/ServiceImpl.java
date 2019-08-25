package pub.ants.provider;

/**
 * @author magw
 * @version 1.0
 * @date 2019/8/25 上午8:21
 * @description: No Description
 */
public class ServiceImpl implements Service {
    @Override
    public String sendMsg(String msg) {
        return "spring dubbo provicer :"+msg;
    }
}
