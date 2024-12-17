package co.kr.st_planet.product.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="products")
@Entity
public class Product {

    @Id
    @Column(name="product_id")
    private int productId; // 상품 ID

    @Column(name="product_name")
    private String productName; // 상품 이름

    @Column(name ="product_price")
    private BigDecimal productPrice; // 가격

    @Column(name="stock")
    private int stock; // 재고 수량

    @Column(name="manufacturer")
    private String manufacturer; // 제조사

    @Column(name="brand")
    private String brand; // 브랜드 이름

    @Column(name="is_active")
    private String isActive; // 상품 상태

    @Column(name="category_id")
    private int categoryId; // 카테고리 ID

    @ManyToOne
    @JoinColumn(name = "category_id") // FK 설정
    private ProductCategory category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductReviews> reviews; // ProductReviews와의 일대다 관계

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Sales> sales; // Sales와의 일대다 관계
}
