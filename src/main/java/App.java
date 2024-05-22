import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld", HelloWorld.class );
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld", HelloWorld.class);


        System.out.println("Переменные ссылаются на один и тот же объект?" +
                (bean1 == bean2));
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());



        Cat myCat1 = (Cat) applicationContext.getBean("cat", Cat.class);
        Cat myCat2 = (Cat) applicationContext.getBean("cat", Cat.class);

        System.out.println("Переменные ссылаются на один и тот же объект?" +
                (myCat1 == myCat2));

        System.out.println(myCat1.getName());
        System.out.println(myCat2.getName());
    }
}