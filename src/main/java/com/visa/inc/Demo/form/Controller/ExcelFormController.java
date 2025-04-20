package com.visa.inc.Demo.form.Controller;

import com.visa.inc.Demo.form.Model.Excelformmodel;
import com.visa.inc.Demo.form.Util.ExcelUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
@RequestMapping("/api")
public class ExcelFormController {

    @Autowired
    public ExcelUtil excelUtil;

    @PostMapping("/submit")
    public ResponseEntity<String> handleForm(@RequestBody Excelformmodel data) {
        try {
            // Define the folder to save Excel files (relative to project root)
            String directoryPath = "./excel/";
            File directory = new File(directoryPath);

            // Create directory if it doesn't exist
            if (!directory.exists()) {
                boolean created = directory.mkdirs();
                if (!created) {
                    return ResponseEntity.status(500).body("Failed to create directory for Excel files.");
                }
            }

            // Define the full file path
            String filePath = directoryPath + data.getFileName() + ".xlsx";

            // Write form data to Excel
            ExcelUtil.addRow(data, filePath);

            return ResponseEntity.ok("✅ Row added to Excel file: " + filePath);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("❌ Error writing to Excel: " + e.getMessage());
        }
    }
}

