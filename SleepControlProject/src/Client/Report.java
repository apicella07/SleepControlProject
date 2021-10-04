/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.util.*;
/**
 *
 * @author gabri
 */
public class Report {
    
    private Date todaysDate;
    private String question1; //Have you slept well during the night? yes or no
    private String question2; //Do you feel exhausted like you didn’t sleep through the night? yes or no
    private String question3; //What is the average of hours you sleep daily? 
    private String question4; //Did you stir a lot during the night?
    private String question5; // How long until you fall asleep? Does it take too long or a few minutes?
    private String question6; //Have you rested? yes o no
    private String question7; //Are you able to stay awake during the day? yes or no
    private String question8; //How many times did you wake up during the night?
    private String question9; //Do you remember the dream? yes or no
    private String question10; //Do you feel nervous or have any worries? yes or no
    private String question11; //How do you feel today? Symptons?

    public Report(){
        super();
    }
    
    public Report(Date todaysDate,String question1, String question2,String question3,String question4,String question5,String question6,String question7, String question8, String question9, String question10, String question11){
       this.todaysDate = todaysDate;
        this.question1= question1;
        this.question2= question2;
        this.question3= question3;
        this.question4= question4;
        this.question5= question5;
        this.question6= question6;
        this.question7= question7;
        this.question8= question8;
        this.question9= question9;
        this.question10= question10;
        this.question11= question11;
    }   
        
        
    public Date getTodaysDate() {
        return todaysDate;
    }

    public void setTodaysDate(Date todaysDate) {
        this.todaysDate = todaysDate;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    public String getQuestion6() {
        return question6;
    }

    public void setQuestion6(String question6) {
        this.question6 = question6;
    }

    public String getQuestion7() {
        return question7;
    }

    public void setQuestion7(String question7) {
        this.question7 = question7;
    }

    public String getQuestion8() {
        return question8;
    }

    public void setQuestion8(String question8) {
        this.question8 = question8;
    }

    public String getQuestion9() {
        return question9;
    }

    public void setQuestion9(String question9) {
        this.question9 = question9;
    }

    public String getQuestion10() {
        return question10;
    }

    public void setQuestion10(String question10) {
        this.question10 = question10;
    }

    public String getQuestion11() {
        return question11;
    }

    public void setQuestion11(String question11) {
        this.question11 = question11;
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
        return "Report{" + "todaysDate=" + todaysDate + ", question1=" + question1 + ", question2=" + question2 + ", question3=" + question3 + ", question4=" + question4 + ", question5=" + question5 + ", question6=" + question6 + ", question7=" + question7 + ", question8=" + question8 + ", question9=" + question9 + ", question10=" + question10 + ", question11=" + question11 + '}';
    }
     
   
    
}
