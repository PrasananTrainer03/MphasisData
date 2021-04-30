package com.java.day3;

public class Leave {
    private int leaveId;
    private LeaveStatus leaveStatus;
    private LeaveType leaveType;
    private String leaveReason;

    public Leave() {}

    public Leave(int argLeaveid, LeaveStatus argLeaveStatus,
                        LeaveType argLeaveType, String argLeaveReason) {
        this.leaveId = argLeaveid;
        this.leaveStatus = argLeaveStatus;
        this.leaveType = argLeaveType;
        this.leaveReason = argLeaveReason;
    }

    @Override 
    public String toString() {
        return String.format("%d %s %s %s", leaveId, leaveStatus, leaveType, leaveReason);
    }
}