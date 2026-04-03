class Worker(val name: String, val hourlyRate: Int) {
    init {
        if (hourlyRate <= 0) {
            throw IllegalArgumentException("Hourly rate must be greater than zero")
        }
    }
    var hoursWorked: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    val salary: Int
        get() = hourlyRate * hoursWorked
}