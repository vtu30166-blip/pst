import java.util.*;

class UndergroundSystem {

    // id -> [stationName, checkInTime]
    private Map<Integer, CheckInData> checkInMap;

    // "start#end" -> [totalTime, tripCount]
    private Map<String, RouteData> routeMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        routeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckInData(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInData data = checkInMap.get(id);

        String startStation = data.stationName;
        int travelTime = t - data.time;

        String route = startStation + "#" + stationName;

        RouteData routeData = routeMap.getOrDefault(
            route,
            new RouteData(0, 0)
        );

        routeData.totalTime += travelTime;
        routeData.tripCount++;

        routeMap.put(route, routeData);

        // Customer has completed the journey
        checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "#" + endStation;

        RouteData data = routeMap.get(route);

        return (double) data.totalTime / data.tripCount;
    }

    // Stores customer's check-in information
    static class CheckInData {
        String stationName;
        int time;

        CheckInData(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

    // Stores route statistics
    static class RouteData {
        int totalTime;
        int tripCount;

        RouteData(int totalTime, int tripCount) {
            this.totalTime = totalTime;
            this.tripCount = tripCount;
        }
    }
}
