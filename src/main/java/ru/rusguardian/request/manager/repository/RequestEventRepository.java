package ru.rusguardian.request.manager.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rusguardian.request.manager.domain.RequestEvent;

@Repository
public interface RequestEventRepository extends JpaRepository<RequestEvent, Long> {
}
