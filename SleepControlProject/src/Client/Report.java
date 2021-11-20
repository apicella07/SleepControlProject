/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.util.*;



public class Report {
    
    private Date todaysDate;
    private String sleepQuality; //Have you slept well during the night? yes or no
    private String exhaustion; //Do you feel exhausted like you didn’t sleep through the night? yes or no
    private String averageHours; //What is the average of hours you sleep daily? 
    private String movement; //Did you stir a lot during the night?
    private String timeToFallAsleep; // How long until you fall asleep? Does it take too long or a few minutes?
    private String rest; //Have you rested? yes o no
    private String stayAwake; //Are you able to stay awake during the day? yes or no
    private String timesAwake; //How many times did you wake up during the night?
    private String dreams; //Do you remember the dream? yes or no
    private String worries; //Do you feel nervous or have any worries? yes or no
    private String todaysMood; //How do you feel today? Symptons?
    private String doubtsForDoctor;

    public Report(){
        super();
    }
    public Report(Date todaysDate,String sleepQuality, String exhaustion,String averageHours,String movement,String timeToFallAsleep,String rest,String stayAwake, String timesAwake, String dreams, String worries, String todaysMood, String doubtsForDoctor){
       this.todaysDate = todaysDate;
        this.sleepQuality= sleepQuality;
        this.exhaustion= exhaustion;
        this.averageHours= averageHours;
        this.movement= movement;
        this.timeToFallAsleep= timeToFallAsleep;
        this.rest= rest;
        this.stayAwake= stayAwake;
        this.timesAwake= timesAwake;
        this.dreams= dreams;
        this.worries= worries;
        this.todaysMood= todaysMood;
        this.doubtsForDoctor=doubtsForDoctor;
    }   
        
        
    public Date getTodaysDate() {
        return todaysDate;
    }

    public void setTodaysDate(Date todaysDate) {
        this.todaysDate = todaysDate;
    }

    public String getsleepQuality() {
        return sleepQuality;
    }

    public void setsleepQuality(String sleepQuality) {
        this.sleepQuality = sleepQuality;
    }

    public String getExhaustion() {
        return exhaustion;
    }

    public void setExhaustion(String exhaustion) {
        this.exhaustion = exhaustion;
    }

    public String getAverageHours() {
        return averageHours;
    }

    public void setAverageHours(String averageHours) {
        this.averageHours = averageHours;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String gettimeToFallAsleep() {
        return timeToFallAsleep;
    }

    public void settimeToFallAsleep(String timeToFallAsleep) {
        this.timeToFallAsleep = timeToFallAsleep;
    }

    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }

    public String getStayAwake() {
        return stayAwake;
    }

    public void setStayAwake(String stayAwake) {
        this.stayAwake = stayAwake;
    }

    public String getTimesAwake() {
        return timesAwake;
    }

    public void setTimesAwake(String timesAwake) {
        this.timesAwake = timesAwake;
    }

    public String getDreams() {
        return dreams;
    }

    public void setDreams(String dreams) {
        this.dreams = dreams;
    }

    public String getWorries() {
        return worries;
    }

    public void setWorries(String worries) {
        this.worries = worries;
    }

    public String getTodaysMood() {
        return todaysMood;
    }

    public void setTodaysMood(String todaysMood) {
        this.todaysMood = todaysMood;
    }
    
    public String getdoubtsForDoctor(){
        return doubtsForDoctor;
    }
    
    public void setdoubtsForDoctor(String doubtsForDoctor){
        this.doubtsForDoctor = doubtsForDoctor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.todaysDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Report other = (Report) obj;
        if (!Objects.equals(this.todaysDate, other.todaysDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Report{" + "todaysDate=" + todaysDate + ", Sleep Quality=" + sleepQuality + ", Exhaustion=" + exhaustion + ", Average Hours=" + averageHours + ", Movement=" + movement + ", Time to fall Asleep=" + timeToFallAsleep + ", Rest=" + rest + ", Stay Awake=" + stayAwake + ", Times Awake=" + timesAwake + ", Dreams=" + dreams + ", Worries=" + worries + ", Todays Mood=" + todaysMood + ", Doubts for the Doctor=" + doubtsForDoctor +'}';
    }
     
   
    
}
