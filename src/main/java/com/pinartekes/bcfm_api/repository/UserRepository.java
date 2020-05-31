package com.pinartekes.bcfm_api.repository;

import com.pinartekes.bcfm_api.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
