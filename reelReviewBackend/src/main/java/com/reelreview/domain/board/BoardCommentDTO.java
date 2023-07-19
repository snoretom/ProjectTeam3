package com.reelreview.domain.board;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tbl_boardComment")
public class BoardCommentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "boardComment_seq")
    @SequenceGenerator(name = "boardComment_seq", sequenceName = "BOARDCOMMENT_SEQ", allocationSize = 1)
    private Integer commentCd;

    @ManyToOne(fetch = FetchType.LAZY) //boardCd 외래키 받아오기
    @JoinColumn(name = "boardCd")
    private BoardDTO board;

    private String commentTitle;
    private String commentWriter;
    private String commentContent;

    @CreationTimestamp
    private Timestamp commentRegdate;






}
