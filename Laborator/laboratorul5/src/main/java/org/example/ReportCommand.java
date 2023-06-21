package org.example;
import java.io.*;
import java.util.*;
import org.example.Command;
import org.example.Desktop;
import java.lang.module.Configuration;
import com.liferay.portal.kernel.template.Template;
import com.liferay.portal.kernel.template.TemplateException;


public class ReportCommand implements Command {

    private String templatePath;
    private String outputPath;
    private static final String TEMPLATE_FILE = "C:\\Date\\Facultate\\Anul 3\\Semestrul 2\\Java\\Laborator\\laboratorul5\\Documente\\reportTemplate.html";

    
    public ReportCommand(String templatePath, String outputPath) {
        this.templatePath = templatePath;
        this.outputPath = outputPath;
    }


    @Override
    public void execute() throws IOException, TemplateException {

        // Load the template file
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);
        cfg.setClassForTemplateLoading(ReportCommand.class, "/");
        Template template = cfg.getTemplate(TEMPLATE_FILE);


        // Set up the data model
        Map<String, Object> data = new HashMap<>();
        data.put("catalog", templatePath);


        // Generate the report file
        Writer fileWriter = new FileWriter(outputPath);
        template.process(data, fileWriter);
        fileWriter.close();

        
        // Open the report file in the default browser
        File reportFile = new File(outputPath);
        Desktop.getDesktop().browse(reportFile.toURI());
    }
}
