package com.kp.objectboxsample;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

@Entity
public class Branch {
    @Id
    public long id;
    public String name;

   // public ToOne<College> college;

    @Override
    public String toString() {
        /*if (college != null) {
            return "Branch id = " + id + ", name = " + name + ", college id " + college.getTargetId();
        } else {
            return "Branch id = " + id + ", name = " + name;
        }*/

        return "Branch id = " + id + ", name = " + name;

    }
}
