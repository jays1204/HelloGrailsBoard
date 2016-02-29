package freeboard

class Board {
    String title
    String content
    Date create_date = new Date()

    static constraints = {
    }

    static belongsTo = [user: User]
}
