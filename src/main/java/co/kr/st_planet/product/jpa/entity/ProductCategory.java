package co.kr.st_planet.product.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="product_categories")
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId; // 카테고리ID (pk)

    @Column(name = "category_name")
    private String categoryName;  // 카테고리명

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products; // Products와의 일대다 관계

}
