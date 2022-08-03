package org.zerock.mreview.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.zerock.mreview.entity.Member;

import java.util.Arrays;
import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTests {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Test
    public void insertMembers() {
        IntStream.rangeClosed(1,100).forEach(i -> {
            Member member = Member.builder()
                    .email("r"+i +"@zerock.org")
                    .pw("1111")
                    .nickname("reviewer"+i).build();
            memberRepository.save(member);
        });
    }

    @Test
    public void testListPage(){
        PageRequest pageRequest = PageRequest.of(0,10, Sort.by(Sort.Direction.DESC,
                "mno"));
        Page<Object[]> result = movieRepository.getListPage(pageRequest);
        for (Object[] objects : result.getContent()) {
            System.out.println(Arrays.toString(objects));
        }
    }

}
