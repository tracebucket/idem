package com.tracebucket.idem.repository.jpa;

import com.tracebucket.idem.domain.User;
import com.tracebucket.tron.ddd.domain.EntityId;
import com.tracebucket.tron.ddd.jpa.BaseEntityRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author FFL
 * @since 12-03-2015
 */
public interface UserRepository extends BaseEntityRepository<User,EntityId> {
    public User findByUsername(String username);
    public void deleteByUsername(String username);

    @Modifying(clearAutomatically = true)
    @Query(value = "update com.tracebucket.idem.domain.User u set u.password = :newPassword where u.username = :username")
    public void updatePassword(@Param("newPassword") String newPassword, @Param("username") String username);
}