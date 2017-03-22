//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.processors;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

/**
 * Pass it a freemarker template and the referenced data and get back the result
 */
public class FreemarkerProcessor {

    private Configuration configuration = null;

    public FreemarkerProcessor() {
    }

    public FreemarkerProcessor(Configuration configuration) {
        this.configuration = configuration;
        configuration.setObjectWrapper(new DefaultObjectWrapper());
    }

    public void process(Map<String, Object> data, Writer out, String templateName) throws ProcessorException {
        try {
            if (configuration == null) {
                configuration = new Configuration();
                configuration.setObjectWrapper(new DefaultObjectWrapper());
            }
            Template template = configuration.getTemplate(templateName);
            template.process(data, out);
        }
        catch (IOException iox) {
            throw new ProcessorException("IO exception while processing Freemarker template", iox);
        }
        catch (TemplateException tx) {
            throw new ProcessorException("Template exception while processing Freemarker template", tx);
        }
    }
}
