package com.jobtrackingapp.brewday.web;

import com.jobtrackingapp.brewday.domain.Batch;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BatchController {

    @GetMapping("createbatch/{companyId}")
    public String getCreateBatch(ModelMap model) {
        model.put("batch", new Batch());
        return "batch-create";
    }
}
