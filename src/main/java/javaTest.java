import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lichangjun1 on 2016/8/30.
 */
public class javaTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hello world");
        int a = 1;
        for (int aa = 1; aa < 10; aa++) {
            System.out.println(aa);
        }
        System.out.println("1");
        Test t = new Test();
        List<String> list = new ArrayList<String>();
        Date dd = null;
        t.setId(1);
        t.setName("lisi");
        System.out.println(dd);
        System.out.println(t.getName() + "的id是" + t.getId());
    }
}
