package com.slack.slackteam.model;

import java.io.Serializable;

/**
 * Created by jacobkoikkara on 8/12/15.
 */
public class SLTeam implements Serializable{

    //    private boolean ok = false;
    private SLMember[] members = null;

//    public boolean isOk() {
//        return ok;
//    }
//
//    public void setOk(boolean ok) {
//        this.ok = ok;
//    }

    public SLMember[] getMembers() {
        return members;
    }

    public void setMembers(SLMember[] members) {
        this.members = members;
    }
}
