package ro.codemart.WebShopReactJS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.codemart.WebShopReactJS.Entities.Review;
import ro.codemart.WebShopReactJS.Repo.ReviewRepo;

import java.util.List;

@Service
public class ReviewService {

    private ReviewRepo reviewRepo;

    @Autowired
    public ReviewService(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    public List<Review> getByProductId(Integer id){
        return reviewRepo.findAllByProductId(id);
    }

    public void saveReview(Review review){
        reviewRepo.save(review);
    }

    public void deleteReviewById(Integer id){
        reviewRepo.deleteById(id);
    }

    public void deleteAllByProductId(Integer id){
        reviewRepo.deleteAllByProductId(id);
    }
}
