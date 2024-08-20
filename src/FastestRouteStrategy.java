interface NavigationStrategy {
    void navigate();
}

class FastestRouteStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("Navigating using the fastest route.");
    }
}

class ShortestRouteStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("Navigating using the shortest route.");
    }
}
