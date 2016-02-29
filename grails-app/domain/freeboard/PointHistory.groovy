package freeboard

class PointHistory {
    Date create_date = new Date()
    Integer points
    String description

    static constraints = {
        description(nullable: true)
    }
}
