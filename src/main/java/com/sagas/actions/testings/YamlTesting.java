package com.sagas.actions.testings;

import com.google.common.base.Preconditions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;
import java.util.Map;

public class YamlTesting {
    public static void main(String args[]){
        new YamlTesting().test().testTypes().testConsructor();
    }

    public YamlTesting test(){
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("yaml/customer.yaml");
        Preconditions.checkNotNull(inputStream);
        Map<String, Object> obj = yaml.load(inputStream);
        System.out.println(obj);
        return this;
    }

    public YamlTesting testTypes(){
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("yaml/customer_with_type.yaml");
        Customer customer = yaml.load(inputStream);
        System.out.println(customer);
        return this;
    }

    public YamlTesting testConsructor(){
        Yaml yaml = new Yaml(new Constructor(Customer.class));
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("yaml/customer.yaml");
        Customer customer = yaml.load(inputStream);
        System.out.println(customer);
        return this;
    }

    /*
    Implicit Types
    In case there’s no type defined for a given property, the library automatically converts the value to an implicit type.
    For example:
    1.0 -> Float
    42 -> Integer
    2009-03-30 -> Date
    Let’s test this implicit type conversion using a test case:
     */
    public void whenLoadYAML_thenLoadCorrectImplicitTypes() {
        Yaml yaml = new Yaml();
        Map<Object, Object> document = yaml.load("3.0: 2018-07-22");

//        assertNotNull(document);
//        assertEquals(1, document.size());
//        assertTrue(document.containsKey(3.0d));
    }
}
