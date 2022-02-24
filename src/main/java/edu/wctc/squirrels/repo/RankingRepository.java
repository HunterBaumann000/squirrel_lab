package edu.wctc.squirrels.repo;

import edu.wctc.squirrels.entity.Sighting;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RankingRepository  extends CrudRepository<Sighting, Integer> {
    //List<Sighting> findAllBySquirrelIdOrderBySpottedAt(int squirrelId);
}