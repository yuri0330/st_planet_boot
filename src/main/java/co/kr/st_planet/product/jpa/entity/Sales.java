package co.kr.st_planet.product.jpa.entity;


import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "sales")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Integer saleId;

    @ManyToOne
    @JoinColumn(name = "product_id") // FK 설정
    private Product product;

    @Column(name = "customer_email")
    private String customerEmail;

    @Column(name = "sale_quantity")
    private Integer saleQuantity;

    @Column(name = "sale_price")
    private BigDecimal salePrice;

    @Column(name = "sale_date")
    private LocalDateTime saleDate;

    @Column(name = "order_status")
    private String orderStatus;
}

