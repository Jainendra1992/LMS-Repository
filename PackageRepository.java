package com.website.lms.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PackageRepository  extends CrudRepository<com.website.lms.entity.Package, Integer>{

	@Query(value = "select * from Package where package_Name = 'Java'",nativeQuery = true)
	
	public Iterable<com.website.lms.entity.Package>getName();
}


/*
   {
    
    "id":1,
    "PackageName":"java",
    "PackageFees":5000,
    "PackageDuration":"6-month",
    "PackageHours":52
  
   }
  
 * */
