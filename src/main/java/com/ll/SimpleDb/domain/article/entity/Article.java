package com.ll.SimpleDb.domain.article.entity;

import com.ll.SimpleDb.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.w3c.dom.Text;

@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class Article extends BaseEntity {

    @Column(nullable = false, length = 100)
    private String title;

    @Lob // @Lob(Large Object)은 JPA에서 대용량 데이터(텍스트 또는 바이너리 데이터)를 저장할 때 사용하는 어노테이션
    // Lazy Loading을 사용할 때는 @Lob을 사용하면 안된다.
    @Column(nullable = false)
    private Text body;

    @Column(nullable = false, columnDefinition = "BIT(1) DEFAULT 0")
    private boolean isBlind;


}
