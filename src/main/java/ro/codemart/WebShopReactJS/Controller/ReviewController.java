package ro.codemart.WebShopReactJS.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.codemart.WebShopReactJS.Entities.Review;
import ro.codemart.WebShopReactJS.Service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    private ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/getByProductId/{id}")
    public List<Review> getReviewsByProductId(@PathVariable("id") Integer id){
        return reviewService.getByProductId(id);
    }

    @PostMapping("/saveReview")
    public void saveReview(@RequestBody Review review){
        reviewService.saveReview(review);
    }

    @DeleteMapping("/deleteByReviewId/{id}")
    public void deleteReviewById(@PathVariable("id") Integer id){
        reviewService.deleteReviewById(id);
    }

    @DeleteMapping("/deleteByProductId/{id}")
    public void deleteByProductId(@PathVariable("id") Integer id){
        reviewService.deleteAllByProductId(id);
    }
}
