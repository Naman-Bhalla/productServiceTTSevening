package dev.naman.productservicettsevening.inheritanceexamples.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TPCMentorRepository extends JpaRepository<Mentor, Long> {

    Mentor save(Mentor mentor);

    Mentor findMentorById(Long id);
}