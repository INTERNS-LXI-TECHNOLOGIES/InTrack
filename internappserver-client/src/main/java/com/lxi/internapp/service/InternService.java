package com.lxi.internapp.service;

import java.util.List;
import java.util.Optional;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.InternControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxi.internapp.entity.InternEnity;
import com.lxi.internapp.repository.InternRepository;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;

    // Search interns via external API
    public List<org.openapitools.client.model.InternEnity> searchIntern() throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8081");

        InternControllerApi internController = new InternControllerApi(apiClient);
        List<org.openapitools.client.model.InternEnity> readList = internController.getAll();

        return readList;
    }

    // Get intern by ID
    public Optional<InternEnity> getId(Long id) {
        return internRepository.findById(id);
    }

    // Update intern by ID
    @Transactional
    public InternEnity updateIntern(Long id, InternEnity updateintern) {
        Optional<InternEnity> updateDetail = internRepository.findById(id);

        if (updateDetail.isPresent()) {
            InternEnity existIntern = updateDetail.get();
            existIntern.setName(updateintern.getName());
            existIntern.setAge(updateintern.getAge());
            return internRepository.save(existIntern);
        } else {
            return null;
        }
    }

    // Delete intern by ID
    @Transactional
    public void deleteIntern(Long id) {
        Optional<InternEnity> deleteIntern = internRepository.findById(id);

        if (deleteIntern.isPresent()) {
            InternEnity existingIntern = deleteIntern.get();
            internRepository.delete(existingIntern);
        } else {
            System.out.println("Intern not found.");
        }
    }
}
