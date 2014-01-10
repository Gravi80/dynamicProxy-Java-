package Example2;

import java.lang.reflect.Proxy;

public class SumFactory {
    public ISum createSum(Integer val1, Integer val2) {
        Sum sum = new Sum(val1, val2);
        Handler handler = new Handler(sum);

        Class[] interfacesArray = new Class[] {ISum.class};

        return (ISum) Proxy.newProxyInstance(Sum.class.getClassLoader(), interfacesArray, handler);
    }
}
