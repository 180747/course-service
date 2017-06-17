package pl.lodz.p.zzpwj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lodz.p.zzpwj.bus.Topic;

/**
 * Created by Marcin Wróbel on 17.06.17.
 */
public interface TopicRepository extends JpaRepository<Topic, Long> {

}
