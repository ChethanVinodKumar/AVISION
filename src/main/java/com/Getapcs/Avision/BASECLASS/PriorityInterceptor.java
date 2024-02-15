package com.Getapcs.Avision.BASECLASS;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import java.util.List;

public class PriorityInterceptor implements IMethodInterceptor {

    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
        for (IMethodInstance method : methods) {
            Method javaMethod = method.getMethod().getConstructorOrMethod().getMethod();
            if (javaMethod.isAnnotationPresent(AutoPriority.class)) {
                // Logic to calculate priority based on criteria
                int priority = calculatePriority(javaMethod);
                // Update test method's priority
                method.getMethod().setPriority(priority);
            }
        }
        // Return the modified list of methods
        return methods;
    }

    private int calculatePriority(Method method) {
        // Your logic to calculate priority dynamically
        // For example, based on criticality, execution time, etc.
        return 1; // Placeholder, replace with actual logic
    }
}