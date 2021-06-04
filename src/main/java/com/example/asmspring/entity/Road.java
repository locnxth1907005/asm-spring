package com.example.asmspring.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Road {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String createAt;
    private String description;
    private int status;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "countryId")
    private Country country;
    @Column(insertable = false,updatable = false)
    private int countryId;





    public String getStatusString() {
        return this.getStatus() == 1 ? "Đang sử dụng" : (this.getStatus() == 0 ? "Đang thi công" : "Đang tu sửa");
    }

}
