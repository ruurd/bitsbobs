//------------------------------------------------------------------------------
// Copyright (c) 2014 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.processors;

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
    private Template template = null;

    public void process(Map<String, Object> data, Writer out, String templateName) throws ProcessorException {
        try {
            if (configuration == null) {
                configuration = new Configuration();
                configuration.setObjectWrapper(new DefaultObjectWrapper());
                template = configuration.getTemplate(templateName);
            }
            template.process(data, out);
        }
        catch (IOException iox) {
            throw new ProcessorException("IO exception while processing Freemarker template", iox);
        }
        catch (TemplateException tx) {
            throw new ProcessorException("Template exception while processing Freemarker template", tx);
        }
    }

    public void stupid(Map<String, Object> data, Writer out, String templateName) throws ProcessorException {
        try {
            configuration = new Configuration();
            configuration.setObjectWrapper(new DefaultObjectWrapper());
            template = configuration.getTemplate(templateName);
            template.process(data, out);
        } catch (IOException iox) {
            throw new ProcessorException("IO exception while processing Freemarker template", iox);
        } catch (TemplateException tx) {
            throw new ProcessorException("Template exception while processing Freemarker template", tx);
        }
    }

    public void reset() {
        configuration = null;
        template = null;
    }
}
