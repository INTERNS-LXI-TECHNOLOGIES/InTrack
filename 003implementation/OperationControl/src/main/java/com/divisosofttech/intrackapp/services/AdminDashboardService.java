/*package com.divisosofttech.intrackapp.services;



import java.util.List;
import java.util.Optional;

import com.divisosofttech.intrackapp.domain.AdminDashBoard;
import com.divisosofttech.intrackapp.repository.AdminDashboardRepository;

@Service
public class AdminDashboardService {

    private final AdminDashboardRepository adminDashboardRepository;

    @Autowired
    public AdminDashboardService(AdminDashboardRepository adminDashboardRepository) {
        this.adminDashboardRepository = adminDashboardRepository;
    }

    // Save or update an AdminDashboard
    public AdminDashboard saveOrUpdateAdminDashboard(AdminDashBoard adminDashboard) {
        return adminDashboardRepository.save(adminDashboard);
    }

    // Find an AdminDashboard by ID
    public Optional<AdminDashboard> findAdminDashboardById(Long id) {
        return adminDashboardRepository.findById(id);
    }

    // Get all AdminDashboards
    public List<AdminDashboard> getAllAdminDashboards() {
        return adminDashboardRepository.findAll();
    }

    // Delete an AdminDashboard by ID
    public void deleteAdminDashboardById(Long id) {
        adminDashboardRepository.deleteById(id);
    }
}
*/