package org.librairy.service.nlp.service;

import org.junit.Before;
import org.junit.Test;
import org.librairy.service.nlp.facade.model.Annotation;
import org.librairy.service.nlp.facade.model.PoS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class IXAServiceTest {


    private static final Logger LOG = LoggerFactory.getLogger(IXAServiceTest.class);


    IXAService service;

    @Before
    public void setup(){
        service = new IXAService("src/main/bin");
        service.setup();
    }

    @Test
    public void annotation() throws IOException {

        String text = "Pouvez-vous me faire le change ?";

        List<PoS> filter = Collections.emptyList();

        List<Annotation> annotations = service.annotations(text, filter);

        annotations.forEach(annotation -> LOG.info(annotation.toString()));

//        Assert.assertEquals(2, annotations.size());
    }

}