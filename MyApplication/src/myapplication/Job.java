/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;
import java.io.*;

/**
 *
 * @author Rutuja
 */
public class Job implements Serializable {
    protected String nameOfJob;
    protected Double salary;

    public Job(String nameOfJob, double salary) {
        this.nameOfJob = nameOfJob;
        this.salary = salary;
    }

    public boolean equals(Job job)
    {
        return(this.salary == job.salary && this.nameOfJob.equals(job.nameOfJob));
    }
        
    public String getNameOfJob() {
        return nameOfJob;
    }

    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
