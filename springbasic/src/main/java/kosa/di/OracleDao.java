package kosa.di;

import org.springframework.stereotype.Repository;

@Repository
//�����Ϳ� �����ϴ� ũ����
public class OracleDao implements Dao {

   public void insertBoard() {
      System.out.println("oracleDao insertBoard() ȣ��");
   }

}