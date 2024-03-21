package com.jobtrackingapp.brewday.web;

import com.jobtrackingapp.brewday.domain.Brand;
import com.jobtrackingapp.brewday.service.BrandService;
import com.jobtrackingapp.brewday.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BrandController {

    private final BrandService brandService;
    private final CompanyService companyService;

    @Autowired
    public BrandController(BrandService brandService, CompanyService companyService) {
        this.brandService = brandService;
        this.companyService = companyService;
    }

    @GetMapping("/brands/{companyId}")
    public String getBrands(ModelMap model, @PathVariable Long companyId) {
        model.put("brand", new Brand());
        model.put("company", companyService.findById(companyId));
        return "brand/dashboard";
    }
}
