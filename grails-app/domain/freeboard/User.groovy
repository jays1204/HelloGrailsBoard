package freeboard

class User {
    String username //uuid, allow only small english characters, max size is 10
    String password //user account
    Integer points // natural number
    String email // email account, optional
    Date create_date

    static constraints = {
        username(maxSize: 10, unique: true)
        email(nullable: true, matches: "[a-zA-Z0-9-_]+[@]1[A-Za-z0-9-_].[A-Za-z]+")
    }

    static mapping = {
        points defaultValue: 100
        create_date defaultValue: new Date()
    }

    static hasMany = [pointHistorys: PointHistory, boards: Board]
}
