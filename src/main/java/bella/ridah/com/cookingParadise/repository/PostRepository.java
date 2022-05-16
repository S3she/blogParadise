package bella.ridah.com.cookingParadise.repository;

import bella.ridah.com.cookingParadise.dao.PostDAO;
import bella.ridah.com.cookingParadise.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PostRepository extends JpaRepository<Post, Long> {

    PostDAO createPost(PostDAO postDAO);
    PostDAO getPostById(long id);

    Post deletePostById(long id);

}











