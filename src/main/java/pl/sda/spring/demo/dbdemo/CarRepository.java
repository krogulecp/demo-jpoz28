package pl.sda.spring.demo.dbdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface CarRepositoryCustom {
    void doSomeCustomStuff();
}

interface CarRepository extends JpaRepository<CarEntity,Long>, CarRepositoryCustom {
}

@Repository
class CarRepositoryCustomImpl implements CarRepositoryCustom {

    @Override
    public void doSomeCustomStuff() {

    }
}
