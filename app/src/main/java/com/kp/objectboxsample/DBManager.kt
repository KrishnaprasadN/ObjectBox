package com.kp.objectboxsample

import android.content.Context
import android.util.Log
import io.objectbox.Box
import io.objectbox.BoxStore


object DBManager {
    var boxStore: BoxStore? = null

    // this should be called only once from Application class
    fun initBox(context: Context) {
       boxStore = MyObjectBox.builder().androidContext(context).build()

    }

    fun getCollegeBox() : Box<College> {
        return boxStore!!.boxFor(College::class.java)
    }

    fun getBranchBox() : Box<Branch> {
        return boxStore!!.boxFor(Branch::class.java)
    }

    fun getPrincipalBox() : Box<Principal> {
        return boxStore!!.boxFor(Principal::class.java)
    }

    fun insertOrUpdateBranch(branch: Branch) {
        getBranchBox().put(branch)
    }

    fun insertOrUpdateCollege(college: College) {
        getCollegeBox().put(college)
    }

    fun getAllBranches(): List<Branch> {
        return getBranchBox().all
    }

    fun getAllColleges(): List<College> {
        return getCollegeBox().all
    }

    fun getAllPrincipals(): List<Principal> {
        return getPrincipalBox().all
    }


    fun printAllColleges() {
        val allColleges = getAllColleges()

        allColleges.forEach {
            Log.d("KP", "***** College is - ${it.toString()}");
        }
    }

    fun printAllPrincipals() {
        val allPrincipals = getAllPrincipals()

        allPrincipals.forEach {
            Log.d("KP", "***** Principal is - ${it.toString()}");
        }
    }

    fun printAllBranches() {
        val allBranches = getAllBranches()

        allBranches.forEach {
            Log.d("KP", "***** Branch is - ${it.toString()}");
        }
    }

    fun removeCollege(id:Long) {
        getCollegeBox().remove(id)
    }

    fun clearDB() {
        getCollegeBox().removeAll()
        getPrincipalBox().removeAll()
        getBranchBox().removeAll()
    }
}