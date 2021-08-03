package ie.clientsoultions.sandbox.scantest.repository;

import ie.clientsoultions.sandbox.scantest.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
