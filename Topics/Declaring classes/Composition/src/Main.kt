class OperatingSystem {
    var name: String = "blah"
}
class DualBoot{
    var primaryOs = OperatingSystem()
    primaryOs.name = "bleh"
    var secondaryOs = OperatingSystem()
    secondaryOs.name = "bloh"
}

