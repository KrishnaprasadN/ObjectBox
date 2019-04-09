package com.kp.objectboxsample;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Course {
    @Id
    public long id;

    public String name;
}
