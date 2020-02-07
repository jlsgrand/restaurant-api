package co.simplon.restaurant.service;

import co.simplon.restaurant.model.Review;
import co.simplon.restaurant.repository.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review createReview(Review reviewToCreate) {
        return reviewRepository.save(reviewToCreate);
    }
}
