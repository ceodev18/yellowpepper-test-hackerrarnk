package com.test.zuul.repository;

import java.util.Optional;


import com.test.zuul.models.ERole;
import com.test.zuul.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
