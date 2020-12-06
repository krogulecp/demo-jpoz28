package pl.sda.spring.demo.dbdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

interface CarRepositoryCustom {
    void doSomeCustomStuff();
}

interface CarRepository extends JpaRepository<CarEntity,Long>, CarRepositoryCustom {

    List<CarEntity> findByModel(String model);

}

@Repository
class CarRepositoryCustomImpl implements CarRepositoryCustom {

    @Override
    public void doSomeCustomStuff() {

    }
}
