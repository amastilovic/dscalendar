package com.example.datasetcalendar;


import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.example.datasetcalendar.resources.DataSetCalendarResource;

public class DataSetApplication extends Application<DataSetConfiguration> {
    public static void main(String[] args) throws Exception {
        new DataSetApplication().run(args);
    }

    @Override
    public String getName() {
        return "dataset_calendar";
    }

    @Override
    public void initialize(Bootstrap<DataSetConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(DataSetConfiguration configuration,
                    Environment environment) {
        // nothing to do yet
    	
    	  final DataSetCalendarResource resource = new DataSetCalendarResource(
    		        configuration.getTemplate(),
    		        configuration.getDefaultName()
    		    );
    		    environment.jersey().register(resource);
    	
    	
    }

}
