package com.visa.inc.Demo.form.Util;


import com.visa.inc.Demo.form.Model.Excelformmodel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ExcelUtil {
    
    public static void addRow(Excelformmodel data, String filePath) throws IOException {
        File file = new File(filePath);
        Workbook workbook;
        Sheet sheet;

        if (file.exists()) {
            // Open existing Excel file
            FileInputStream fis = new FileInputStream(file);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheetAt(0);
        } else {
            // Create a new Excel file if not found
            workbook = new XSSFWorkbook();
            sheet = workbook.createSheet("FormData");

            // Create headers
            Row header = sheet.createRow(0);
            String[] headers = {
                    "Date Opened", "File Name", "Work Effort", "Reviewer Name",
                    "Line Code Number", "Complexity", "Comment", "Action Taken",
                    "Last Date Updated", "Developer Name"
            };

            // Set header values
            for (int i = 0; i < headers.length; i++) {
                header.createCell(i).setCellValue(headers[i]);
            }
        }

        // Add new row with data
        int lastRow = sheet.getLastRowNum();
        Row row = sheet.createRow(lastRow + 1);

        row.createCell(0).setCellValue(data.dateOpened);
        row.createCell(1).setCellValue(data.fileName);
        row.createCell(2).setCellValue(data.workEffort);
        row.createCell(3).setCellValue(data.reviewerName);
        row.createCell(4).setCellValue(data.lineCodeNumber);
        row.createCell(5).setCellValue(data.complexity);
        row.createCell(6).setCellValue(data.comment);
        row.createCell(7).setCellValue(data.actionTaken);
        row.createCell(8).setCellValue(data.lastDateUpdated);
        row.createCell(9).setCellValue(data.developerName);

        // Write the data to the file
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        fos.close();
        workbook.close();
    }
}

