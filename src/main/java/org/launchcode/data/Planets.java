
package data;

public enum Planets {
    MERCURY("mercury", 88),
    VENUS("venus", 255),
    EARTH("earth", 365),
    MARS("mars", 687),
    JUPITER("jupiter", 4333),
    SATURN("saturn", 10759),
    URANUS("uranus", 30687),
    NEPTUNE("neptune", 60200);

    private String name;

    private int yearLength;

    Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }
}