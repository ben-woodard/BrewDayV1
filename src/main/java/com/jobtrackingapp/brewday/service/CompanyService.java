package com.jobtrackingapp.brewday.service;

import com.jobtrackingapp.brewday.domain.Company;
import com.jobtrackingapp.brewday.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private final CompanyRepository companyRepo;

    @Autowired
    public CompanyService(CompanyRepository companyRepo) {
        this.companyRepo = companyRepo;
    }

    public Company save(Company company) {
        return companyRepo.save(company);
    }

    public Company findById(Long companyId) {
        return companyRepo.findById(companyId).orElse(null);
    }
}
