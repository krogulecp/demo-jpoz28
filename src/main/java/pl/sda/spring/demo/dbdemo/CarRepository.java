package pl.sda.spring.demo.dbdemo;

import org.springframework.data.jpa.repository.JpaRepository;

interface CarRepository extends JpaRepository<CarEntity,Long> {
}
