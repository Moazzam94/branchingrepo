package com.company;

public class Stopwatch {
     // data fields with getter  methods
     private long startTime;
     private long endTime;
     //A no-arg constructor that initializes startTime with the current time.
     Stopwatch(){
          startTime= System.currentTimeMillis();
     }
     // METHODS:
// 1-method named start() that resets the startTime to the current time
     public void start(){
          this.startTime= System.currentTimeMillis();
     }
     //■ A method named stop() that sets the endTime to the current time.
     public void stop(){
          this.endTime= System.currentTimeMillis();
     }
     //A method named getElapsedTime() that returns the elapsed time for the
//stopwatch in milliseconds.
     public long getElapsedTime(){
          return (endTime-startTime);
     }
     public long getStartTime() {
          return startTime;
     }
     public long getEndTime() {
          return endTime;
     }
}