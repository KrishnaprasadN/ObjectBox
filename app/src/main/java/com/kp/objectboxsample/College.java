package com.kp.objectboxsample;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

@Entity
public class College {
    @Id
    public long id;
    public String name;

    public ToOne<Principal> principal;

    public ToMany<Branch> branches;

    @Override
    public String toString() {
        String collegeStr = "";
        if (principal != null && principal.getTarget() != null) {
            collegeStr = "id = " + id + ", name = " + name + ", principal = " + principal.getTarget().name;
        } else {
            collegeStr = "id = " + id + ", name = " + name + ", principal = " + "No Principal";
        }

        if (branches != null && branches.size() > 0) {
            collegeStr += ", branches size is " + branches.size();
        } else {
            collegeStr += ", No branches are present.";
        }

        return collegeStr;
    }
}
