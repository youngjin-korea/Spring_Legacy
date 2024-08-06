package kosa.di;

import org.springframework.stereotype.Repository;

@Repository
//데이터에 접근하는 크래스
public class OracleDao implements Dao {

   public void insertBoard() {
      System.out.println("oracleDao insertBoard() 호출");
   }

}