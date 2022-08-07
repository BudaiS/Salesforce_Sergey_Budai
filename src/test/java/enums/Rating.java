package enums;

public enum Rating {
    HOT("Hot"),
    WARM("Warm"),
    COLD("Cold");
    private String name;

    Rating(String name) {
        this.name = name;
    }

    public static Rating fromString(String value) {
        for (Rating contactRating : Rating.values()) {
            if (contactRating.getName().equals(value)) {
                return contactRating;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
