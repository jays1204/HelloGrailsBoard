package freeboard

class Board {
    String title
    String content
    Date create_date

    static constraints = {
    }

    static mapping = {
        create_date: new Date()
    }

}
