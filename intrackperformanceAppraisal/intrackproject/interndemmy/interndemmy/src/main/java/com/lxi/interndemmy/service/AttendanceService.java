package com.lxi.interndemmy.service;

import com.lxi.interndemmy.model.Attendance;
import com.lxi.interndemmy.model.Intern;
import com.lxi.interndemmy.repository.AttendanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.lxi.interndemmy.dto.AttendanceDto;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    public Attendance saveAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }



    public List<Attendance> getAllAttendances() {
        return attendanceRepository.findAll();
    }

    // Combined method to get attendance records and percentage
    public AttendanceDto findAttendanceByInternId(Long internId) {
        List<Attendance> attendanceList = attendanceRepository.findByInternId(internId);

        // Calculate attendance percentage
        double attendancePercentage = 0.0;

        if (!attendanceList.isEmpty()) {
            int totalDays = attendanceList.size();
            int presentDays = (int) attendanceList.stream().filter(Attendance::getPresent).count();
            attendancePercentage = (double) presentDays / totalDays * 100; // Return percentage
        }

        // Return the response object containing both attendance records and percentage
        return new AttendanceDto(attendanceList, attendancePercentage);
    }
}
