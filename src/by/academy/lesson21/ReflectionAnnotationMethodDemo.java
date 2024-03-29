package by.academy.lesson21;

import by.academy.lesson21.method.Car;
import jdk.jfr.Description;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionAnnotationMethodDemo {
    public static void main(String[] args) {
        Car car = new Car(100, "AA180A1");
        Class<? extends Car> carClass = car.getClass();

        Method getHorsepowerMethod;
        try {
            getHorsepowerMethod = carClass.getMethod("getHorsepower");
            Annotation[] annotations = getHorsepowerMethod.getAnnotations();
            System.out.println(Arrays.toString(annotations));

            Description[] annotationsByType = getHorsepowerMethod.getAnnotationsByType(Description.class);
            System.out.println(Arrays.toString(annotationsByType));

            Description descriptionAnnotation = getHorsepowerMethod.getAnnotation(Description.class);
            System.out.println(descriptionAnnotation);
            System.out.println(descriptionAnnotation.value());
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }

}


