class AuditLogger {

    static void log(String msg) {
        System.out.println("AUDIT: " + msg);
    }

    static void logError(Exception e) {
        System.out.println("ERROR: " + e.getMessage());
    }
}