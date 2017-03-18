package com.emajar.repository;

import com.emajar.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by drago on 17/03/17.
 */
@Repository
public interface PostRepository extends CrudRepository<Post, Long>{


}
