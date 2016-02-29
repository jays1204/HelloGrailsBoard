package freeboard

class PointHistory {
    Date create_date
    Integer points
    String description

    static constraints = {
        description(nullable: true)
    }

    static mapping = {
        create_date defaultValue: new Date()
    }
}
