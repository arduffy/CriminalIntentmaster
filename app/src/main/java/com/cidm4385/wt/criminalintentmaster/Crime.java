package com.cidm4385.wt.criminalintentmaster;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Date mTime;
    private boolean mSolved;
    private DateFormat dfTime = DateFormat.getTimeInstance();
    private DateFormat dfDay = DateFormat.getDateInstance();


    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
        mTime = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public Date getTime() {
        return mTime;
    }

    public void setTime(Date date) {
        mTime = date;
    }

    public void setDate(Date date) {
        mDate = date;
    }


    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getDateAndTime() {
        return dfTime.format(mTime) + " " + dfDay.format(mDate);
    }
}

