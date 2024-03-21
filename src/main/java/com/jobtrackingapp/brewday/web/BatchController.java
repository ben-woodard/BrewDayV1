package com.jobtrackingapp.brewday.web;

import com.jobtrackingapp.brewday.domain.Batch;
import com.jobtrackingapp.brewday.service.BatchService;
import com.jobtrackingapp.brewday.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BatchController {

    private final CompanyService companyService;
    private final BatchService batchService;

    @Autowired
    public BatchController(CompanyService companyService, BatchService batchService) {
        this.companyService = companyService;
        this.batchService = batchService;
    }

    @GetMapping("createbatch/{companyId}")
    public String getCreateBatch(ModelMap model, @PathVariable Long companyId) {
        model.put("batch", new Batch());
        model.put("company", companyService.findById(companyId));
        return "batch/create";
    }

//    @PostMapping("createbatch/{companyId}")
//    public String postCreateBatch(Batch batch, @PathVariable Long companyId) {
//        batchService.save(batch, companyId);
//        return "batch/create";
//    }

}
