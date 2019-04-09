package com.kp.objectboxsample;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Principal {
    @Id
    public long id;

    public String name;

    @Override
    public String toString() {
        return "Principal id = " + id + ", name = " + name;
    }
}
