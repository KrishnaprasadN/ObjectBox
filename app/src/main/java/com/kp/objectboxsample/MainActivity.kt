package com.kp.objectboxsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Note
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DBManager.clearDB()

        var principal: Principal = Principal()
        principal.name = "Principal 1"

        var branch:Branch = Branch()
        branch.name = "Branch 1"


        var college: College = College()
        college.name = "College 1"
        college.principal.target = principal
        college.branches.add(branch)

        DBManager.insertOrUpdateCollege(college)

        DBManager.printAllColleges()
        DBManager.printAllPrincipals()
        DBManager.printAllBranches()

    }
}
