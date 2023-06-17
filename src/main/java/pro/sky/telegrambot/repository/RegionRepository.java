package pro.sky.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.entity.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {

}
