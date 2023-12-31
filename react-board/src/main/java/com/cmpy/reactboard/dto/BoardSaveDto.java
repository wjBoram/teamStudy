package com.cmpy.reactboard.dto;

import com.cmpy.reactboard.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardSaveDto {
    private Long idx;
    private String title;
    private String contents;
    private String createdBy;

    public BoardEntity toEntity() {
        return BoardEntity.builder()
                .idx(idx)
                .title(title)
                .contents(contents)
                .createdBy(createdBy)
                .build();
    }
}
