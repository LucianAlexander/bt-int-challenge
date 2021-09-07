package models;

import java.util.StringJoiner;

public class House {
    private String name;
    private Integer mq;


    public House(String name, Integer mq) {
        this.name = name;
        this.mq = mq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMq() {
        return mq;
    }

    public void setMq(Integer mq) {
        this.mq = mq;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", House.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("mq=" + mq)
                .toString();
    }
}
