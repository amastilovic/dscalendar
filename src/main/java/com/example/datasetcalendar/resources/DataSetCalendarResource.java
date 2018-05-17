package com.example.datasetcalendar.resources;

import com.example.datasetcalendar.api.Saying;
import com.google.common.base.Optional;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/dataset-calendar")
@Produces(MediaType.APPLICATION_JSON)
public class DataSetCalendarResource {
	 private final String template;
	    private final String defaultName;
	    private final AtomicLong counter;
	    
	    private String testData = "Sample json from file";

	    public DataSetCalendarResource(String template, String defaultName) {
	        this.template = template;
	        this.defaultName = defaultName;
	        this.counter = new AtomicLong();
	        this.testData = testData;
	    }

	    @GET
	    @Timed
	    public Saying sayHello(@QueryParam("name") Optional<String> name) {
	        final String value = String.format(template, name.or(defaultName));
	        return new Saying(counter.incrementAndGet(), value, this.testData);
	    }

}
