package com.geo.reversegeocode.repo;

import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.geo.reversegeocode.model.GeoIndia;

@Repository
public interface GeoIndiaRepo extends MongoRepository<GeoIndia, ObjectId>{

@Query(value = "{geometry:{$geoIntersects:{$geometry:{ \"type\" : \"Point\",\"coordinates\" : [ ?1,?0]}}}}",fields="{'geometry':0,'type':0,'_id':0}")
GeoIndia findState(final double lat,final double lon);

}
