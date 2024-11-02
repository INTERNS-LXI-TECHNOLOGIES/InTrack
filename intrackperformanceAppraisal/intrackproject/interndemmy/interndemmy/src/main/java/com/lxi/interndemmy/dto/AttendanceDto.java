package com.lxi.interndemmy.dto;

import java.util.List;

import com.lxi.interndemmy.model.Attendance;

public class AttendanceDto {
    private List<Attendance> attendanceList;
    private double attendancePercentage;

    public AttendanceDto(List<Attendance> attendanceList, double attendancePercentage) {
        this.attendanceList = attendanceList;
        this.attendancePercentage = attendancePercentage;
    }

    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }

    public void setAttendanceList(List<Attendance> attendanceList) {
        this.attendanceList = attendanceList;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }
}
