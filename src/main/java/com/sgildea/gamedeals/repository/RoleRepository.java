package com.sgildea.gamedeals.repository;

import com.sgildea.gamedeals.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public Role findByName(String name);
}
