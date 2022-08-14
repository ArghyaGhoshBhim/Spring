package com.mycompany.app.model;


import org.springframework.stereotype.Component;


/**Here spring container will create address bean and the name of the bean will be "address"
 * By default name of this bean will be "address"
 * No need to create a obj usin @Bean annotaion.
 * @Component("add1") we can provide the name also instead of the default one.
 */
@Component("adr1")
public class Address {
    private String city;
    private String state;


    public Address() {

    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

}
