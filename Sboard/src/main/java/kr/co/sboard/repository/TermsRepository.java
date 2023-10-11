package kr.co.sboard.repository;

import kr.co.sboard.entity.TermsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Entity로 terms 테이블 생성하기
@Repository
public interface TermsRepository extends JpaRepository<TermsEntity, Integer> {
}