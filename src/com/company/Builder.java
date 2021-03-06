package com.company;

public interface Builder {
    Builder setFirstName(String name);

    Builder setLastName(String lastName);

    Builder setAge(int age);

    Builder setAddress(String address);

    Person build();
}