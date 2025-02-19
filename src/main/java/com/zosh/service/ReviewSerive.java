package com.zosh.service;

import java.util.List;

import com.zosh.Exception.ReviewException;
import com.zosh.model.Review;
import com.zosh.model.Client;
import com.zosh.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,Client client);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
