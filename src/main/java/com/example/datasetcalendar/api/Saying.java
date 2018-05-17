package com.example.datasetcalendar.api;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class Saying {
    private long id;

    @Length(max = 3)
    private String content;
    
    
    private String stats;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(long id, String content, String stats) {
        this.id = id;
        this.content = content;
        this.stats = stats;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }


    @JsonProperty
	public String getStats() {
		return stats;
	}

	
}