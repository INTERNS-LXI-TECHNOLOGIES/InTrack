package com.divisosoft.internproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.internproject.entity.Intern;
import com.divisosoft.internproject.repo.InternRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;

    public Intern createIntern(Intern intern) { // Add this method
        return internRepository.save(intern);
    }

    public List<Intern> getAllInterns() {
        return internRepository.findAll();
    }

    public Optional<Intern> getInternById(Long id) {
        return internRepository.findById(id);
    }

    // Update an intern
    public Intern updateIntern(Long id, Intern updatedIntern) {
        Optional<Intern> internOptional = internRepository.findById(id);
        if (internOptional.isPresent()) {
            Intern existingIntern = internOptional.get();
            existingIntern.setName(updatedIntern.getName());
            existingIntern.setAge(updatedIntern.getAge());
            return internRepository.save(existingIntern);
        }
        return null;
    }

    public void deleteIntern(Long id) {
        internRepository.deleteById(id);
    }
}
