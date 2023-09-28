package co.gov.biblored.serviciosDspace.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Requestitem")
@Table(name = "requestitem", schema = "public", indexes = {
        @Index(name = "requestitem_token_key", columnList = "token", unique = true),
        @Index(name = "requestitem_item", columnList = "item_id"),
        @Index(name = "requestitem_bitstream", columnList = "bitstream_id")
})
public class Requestitem {
    @Id
    @Column(name = "requestitem_id", nullable = false)
    private Integer id;

    @Column(name = "token", length = 48)
    private String token;

    @Column(name = "allfiles")
    private Boolean allfiles;

    @Column(name = "request_email", length = 64)
    private String requestEmail;

    @Column(name = "request_name", length = 64)
    private String requestName;

    @Column(name = "request_date")
    private Instant requestDate;

    @Column(name = "accept_request")
    private Boolean acceptRequest;

    @Column(name = "decision_date")
    private Instant decisionDate;

    @Column(name = "expires")
    private Instant expires;

    @Column(name = "request_message", length = Integer.MAX_VALUE)
    private String requestMessage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bitstream_id")
    private Bitstream bitstream;

}