package Example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {

    public Sum trueSum;

    public Handler(Sum trueSum) {
        this.trueSum = trueSum;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        try {
            return method.invoke(trueSum, args);    //@param obj  the object the underlying method is invoked from
//        } catch (Exception e) {                    //@param args the arguments used for the method call
//            return new Integer(0);
//        }                                         //@return the result of dispatching the method represented by
                                                 //this object on {@code obj} with parameters
    }
}
