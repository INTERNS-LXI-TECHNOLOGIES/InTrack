package com.divisosofttech.intrackapp.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "admin_dashboard")
public class AdminDashBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "admin_name", nullable = false)
    private String adminName;

    @Lob
    @Column(name = "dashboard_data")
    private String dashboardData;

    // Constructors
    public AdminDashBoard() {}

    public AdminDashBoard(String adminName, String dashboardData) {
        this.adminName = adminName;
        this.dashboardData = dashboardData;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getDashboardData() {
        return dashboardData;
    }

    public void setDashboardData(String dashboardData) {
        this.dashboardData = dashboardData;
    }
}

