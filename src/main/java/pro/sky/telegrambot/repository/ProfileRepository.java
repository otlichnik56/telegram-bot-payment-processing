package pro.sky.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
