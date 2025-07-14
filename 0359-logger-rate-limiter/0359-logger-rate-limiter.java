class Logger {

    private final int TIME = 10;
    private Map<String, Integer> log;

    public Logger() {
        log = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (log.containsKey(message) && log.get(message) > timestamp) {
            return false;
        }
        log.put(message, timestamp + TIME);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */