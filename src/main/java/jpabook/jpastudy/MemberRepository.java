package jpabook.jpastudy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) { // query로 분류되어 return 값을 안 만듦
        em.persist(member);
        return member.getId(); // commend와 query를 분리
    }

    public Member find(Long id) {
        return em.find(Member.class, id); // id 조회
    }

}
