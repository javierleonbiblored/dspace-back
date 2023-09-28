package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Webapp")
@Table(name = "webapp", schema = "public")
public class Webapp {
    @Id
    @Column(name = "webapp_id", nullable = false)
    private Integer id;

    @Column(name = "appname", length = 32)
    private String appname;

    @Column(name = "url", length = Integer.MAX_VALUE)
    private String url;

    @Column(name = "started")
    private Instant started;

    @Column(name = "isui")
    private Integer isui;

}