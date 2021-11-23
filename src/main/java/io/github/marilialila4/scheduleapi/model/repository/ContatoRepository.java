package io.github.marilialila4.scheduleapi.model.repository;

import io.github.marilialila4.scheduleapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
