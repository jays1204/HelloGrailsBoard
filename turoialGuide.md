# Step 1

## Project Scaffolding 설명  

## Domain 생성하기
${ProjectHome}/grails-app/conf/DataSource.groovy 에서 DB생성 설정을 기존 create-drop에서 update로 변경한다.  
기존의 앱 실행시마다 삭제 후 새로 생성에서 업데이트로 변경된다.  

```groovy  
development {
  dataSource {
    dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
      url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
  }
}
```


