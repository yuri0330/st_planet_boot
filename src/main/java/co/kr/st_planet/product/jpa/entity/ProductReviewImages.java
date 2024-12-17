package co.kr.st_planet.product.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_review_images")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductReviewImages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Integer reviewId;

    @Column(name = "reviewImageURL")
    private String reviewImageURL;

    @ManyToOne
    @JoinColumn(name = "review_id", insertable = false, updatable = false) // FK 설정
    private ProductReviews review;
}

