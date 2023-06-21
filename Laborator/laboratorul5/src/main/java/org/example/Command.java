package org.example;
import java.io.IOException;
import java.net.URISyntaxException;

import com.liferay.portal.kernel.template.TemplateException;


public interface Command {
    void execute() throws CommandException, IOException, TemplateException, URISyntaxException;
}
