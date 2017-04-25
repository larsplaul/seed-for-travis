package test;

import entity.PU;

public class Rest_IntegrationTest {//extends RestUser_MockDB_IntegrationTest {

  public void setupUsersInDB() {
    if (System.getenv("TRAVIS") != null) {
      PU.setPU_Name("pu_mySql_travis_Integration");
    } else {
      PU.setPU_Name("pu_memorydb_mock");
    }
    utils.makeTestUsers.main(null);
  }
}
