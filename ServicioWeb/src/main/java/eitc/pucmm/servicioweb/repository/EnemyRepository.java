package eitc.pucmm.servicioweb.repository;

import eitc.pucmm.servicioweb.classes.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnemyRepository extends JpaRepository<Enemy, Long> {
}