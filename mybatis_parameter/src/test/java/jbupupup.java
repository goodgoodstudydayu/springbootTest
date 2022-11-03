import org.junit.Test;

import java.util.HashMap;

public class jbupupup {
    @Test
    public  void zzybiandajihua() throws Exception{
        People zzy = new zzy();
        for (int i = 0; i < 20; i++) {
            zzy.setSize(zizhuzhangdaUtil.grow(zzy.getSize()));
            zzy.setCrude(zizhuzhangdaUtil.grow(zzy.getCrude()));
            System.out.println("小zzy的Size: "+ zzy.getSize()+"小zzy的Crude "+zzy.getCrude());
            Thread.sleep(500);
        }
    }
}
class People{
    double size=0.1;
    double crude=0.1;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getCrude() {
        return crude;
    }

    public void setCrude(double crude) {
        this.crude = crude;
    }
}
class zzy extends People{

}
class zizhuzhangdaUtil{
    public static double grow(double something){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        return something+1;
    }
}
