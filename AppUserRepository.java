package com.website.lms.Repository;

import com.website.lms.entity.AppUser;
import org.springframework.data.repository.CrudRepository;


public interface AppUserRepository extends CrudRepository<AppUser, String>
{
	public AppUser findByTokenAndEmail(String token, String email);

}
