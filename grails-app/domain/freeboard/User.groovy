package freeboard

import grails.rest.Resource

@Resource(uri='/users', formats=['json', 'xml'])
class User {
    String username //uuid, allow only small english characters, max size is 10
    String password //user account
    Integer points = 100 // natural number
    String email // email account, optional
    Date create_date = new Date()

    static constraints = {
        username(maxSize: 10, unique: true)
        email(nullable: true, email: true)
    }

    static mapping = {
//        points defaultValue: 100
//        create_date defaultValue: "now()"
    }

    static hasMany = [pointHistorys: PointHistory, boards: Board]
}
