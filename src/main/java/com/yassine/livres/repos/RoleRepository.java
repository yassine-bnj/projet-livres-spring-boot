package com.yassine.livres.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.livres.entities.Role;



public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}