package com.geo.reversegeocode.model;

import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("india_state")
public class GeoIndia {
	
	@Id
	private ObjectId id;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Map<Object, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<Object, Object> properties) {
		this.properties = properties;
	}

	private Map<Object,Object> properties;

}
