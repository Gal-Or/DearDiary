package com.example.deardiary;


import java.util.ArrayList;

public class AllMeetings {

    private ArrayList<Meeting> allMeeting ;


    public AllMeetings() {
        this.allMeeting = new ArrayList<>();
    }

    public AllMeetings(ArrayList<Meeting> allMeeting) {
        this.allMeeting = allMeeting;
    }

    public boolean add (Meeting meeting){
        if(checkAvailability(meeting)){
            this.allMeeting.add(meeting);
            return true;
        }
            return false;
    }

    private boolean checkAvailability(Meeting m1) {
        if(allMeeting.size()==0)
            return true;

        for (Meeting m2: allMeeting) {
            if(m1.getDate().equals(m2.getDate())){
                double startTime1 = makeTimeDouble(m1.getTimeStart());
                double startTime2 = makeTimeDouble(m2.getTimeStart());
                double endTime1 = startTime1 + m1.getDuration();
                double endTime2 = startTime2 + m2.getDuration();

                if(startTime1> startTime2 && startTime1 < endTime2)
                    return false;
                else if(startTime2> startTime1 && startTime2 < endTime1)
                    return false;
            }
        }
        return true;
    }

    private double makeTimeDouble(String timeStart) {
        String time[] = timeStart.split(":");
        double hours = Double.parseDouble(time[0]);
        double minute= Double.parseDouble(time[1])/60;
        return hours + minute;
    }

    public void remove (int index){
        this.allMeeting.remove(index);
    }

    public ArrayList<Meeting> getAllMeeting() {
        return allMeeting;
    }

    public void setAllMeeting(ArrayList<Meeting> allMeeting) {
        this.allMeeting = allMeeting;
    }


}
