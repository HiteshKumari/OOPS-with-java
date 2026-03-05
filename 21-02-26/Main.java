import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        AssetStore store = new AssetStore();

        store.addAsset(new Asset("LAB-101", "HDMI Cable", true, 1));
        store.addAsset(new Asset("LAB-102", "Oscilloscope", true, 3));
        store.addAsset(new Asset("LAB-103", "Ethernet Cable", true, 1));

        HashMap<String, Student> students = new HashMap<>();

        students.put("KRG20281", new Student("KRG20281", "Hitesh", 0, 0));
        students.put("ABC12345", new Student("ABC12345", "Rahul", 100, 0));
        students.put("KRG20282", new Student("KRG20282", "Neha", 0, 2));

        CheckoutService service = new CheckoutService(store, students);

        CheckoutRequest[] requests = {

                new CheckoutRequest("KRG20281", "LAB-101", 4),
                new CheckoutRequest("KRG20281", "LAB-999", 2),
                new CheckoutRequest("ABC12345", "LAB-102", 2)

        };

        for (CheckoutRequest req : requests) {

            try {

                String receipt = service.checkout(req);
                System.out.println("SUCCESS: " + receipt);

            } catch (IllegalArgumentException e) {

                AuditLogger.logError(e);

            } catch (NullPointerException e) {

                AuditLogger.logError(e);

            } catch (SecurityException e) {

                AuditLogger.logError(e);

            } catch (IllegalStateException e) {

                AuditLogger.logError(e);

            } finally {

                AuditLogger.log("Attempt finished for UID=" + req.uid + ", asset=" + req.assetId);

            }
        }
    }
}