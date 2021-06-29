package com.company;

import com.company.adapter.Person;
import com.company.adapter.PersonAdapter;
import com.company.builder.Text;
import com.company.factory.IDCard;
import com.company.factory.IDCardFactory;
import com.company.factory.Product;
import com.company.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        //BUILDER패턴
//        Text text = new Text.Builder()
//                .setTeitle("hello")
//                .setContent("CONTENT")
//                .setItem("항목1", "항목2", "항목3")
//                .build();
//        System.out.println(text);

        //FACTORY
        // 실제 IDCard는 import안함으로써 결합도를 낮춰서 좋음.
//        IDCardFactory factory = new IDCardFactory();
//        Product idCard1 = factory.createProduct("홍길동");
//        Product idCard2 = factory.createProduct("한석봉");
//        idCard1.use();
//        idCard2.use();
//        //결합도를 신경안쓰고 코딩쉽게하려면
//        IDCard idCard3 = IDCard.Factory.create("신사임당");
//        idCard3.use();

        //SINGLETON패턴
//        Singleton singleton1 = Singleton.getInstance();//하나의 인스턴스만 보장
//        //생성자가 private이라서 불가능. Singleton singleton2 = new Singleton();
//        Singleton singleton2 = Singleton.getInstance();
//        if (singleton1 == singleton2) {
//            System.out.println("같음");
//        } else {
//            System.out.println("다름");
//        }

        //adapter
        Person person = new Person("홍길동", 30);
        PersonAdapter adapter = new PersonAdapter(person);

        System.out.println(adapter.showName());
        System.out.println(adapter.showAge());
    }
}
