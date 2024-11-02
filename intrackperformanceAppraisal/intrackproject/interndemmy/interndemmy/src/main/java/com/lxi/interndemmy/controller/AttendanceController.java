package com.lxi.interndemmy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lxi.interndemmy.dto.AttendanceDto;
import com.lxi.interndemmy.model.Attendance;
import com.lxi.interndemmy.model.Intern;
import com.lxi.interndemmy.service.AttendanceService;
import com.lxi.interndemmy.service.InternService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    
    @Autowired
    private AttendanceService attendanceService;
    
    @Autowired
    private InternService internService;

    // POST: Create attendance for a specific intern
    @PostMapping
public ResponseEntity<Attendance> createAttendance(@RequestBody Attendance attendance, @RequestParam Long internId) {
    Optional<Intern> internOptional = internService.findById(internId);
    
    // Check if the intern exists
    if (!internOptional.isPresent()) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
    
    // Get the intern from the Optional
    Intern intern = internOptional.get(); // Safely retrieve the intern
    
    // Associate the attendance with the intern
    attendance.setIntern(intern);
    Attendance savedAttendance = attendanceService.saveAttendance(attendance);
    return ResponseEntity.status(HttpStatus.CREATED).body(savedAttendance);
}

// GET: Retrieve attendance records and percentage for a specific intern
@GetMapping("/{internId}")
public ResponseEntity<AttendanceDto> getAttendanceByInternId(@PathVariable Long internId) {
    AttendanceDto response = attendanceService.findAttendanceByInternId(internId);
    
    // Check if there are any attendance records
    if (response.getAttendanceList().isEmpty()) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    return ResponseEntity.ok(response);
}

}
