class Player {
    private String name;
    private String club;
    private int weight;

    public Player(String name, String club, int weight) {
        this.name = name;
        this.club = club;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getClub() {
        return club;
    }
}

