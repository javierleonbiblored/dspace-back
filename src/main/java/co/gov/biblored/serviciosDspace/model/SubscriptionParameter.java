package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "SubscriptionParameter")
@Table(name = "subscription_parameter", schema = "public")
public class SubscriptionParameter {
    @Id
    @Column(name = "subscription_parameter_id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private String value;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "subscription_id", nullable = false)
    private Subscription subscription;

}