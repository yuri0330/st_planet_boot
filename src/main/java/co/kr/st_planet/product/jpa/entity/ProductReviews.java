package co.kr.st_planet.product.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "product_reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductReviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Integer reviewId;

    @ManyToOne
    @JoinColumn(name = "product_id") // FK 설정
    private Product product;

    @Column(name = "email")
    private String email;

    @Column(name = "star")
    private Integer star;

    @Column(name = "review_title")
    private String reviewTitle;

    @Column(name = "review_content")
    private String reviewContent;

    @Column(name = "review_created_at")
    private LocalDateTime reviewCreatedAt;

    @Column(name = "review_updated_at")
    private LocalDateTime reviewUpdatedAt;

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    private List<ProductReviewImages> reviewImages; // ProductReviewImages와의 일대다 관계
}