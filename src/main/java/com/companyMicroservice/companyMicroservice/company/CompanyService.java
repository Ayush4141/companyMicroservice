package com.companyMicroservice.companyMicroservice.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);

    boolean deleteCompanyById(Long Id);

    Company getCompanyById(Long Id);
}
