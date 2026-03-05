import java.time.LocalDate;

class CheckoutService {

    AssetStore store;
    java.util.HashMap<String, Student> students;

    CheckoutService(AssetStore store, java.util.HashMap<String, Student> students) {
        this.store = store;
        this.students = students;
    }

    public String checkout(CheckoutRequest req)
            throws IllegalArgumentException, IllegalStateException,
            SecurityException, NullPointerException {

        ValidationUtil.validateUid(req.uid);
        ValidationUtil.validateAssetId(req.assetId);
        ValidationUtil.validateHours(req.hoursRequested);

        Student s = students.get(req.uid);

        if (s == null) {
            throw new NullPointerException("Student not found: " + req.uid);
        }

        Asset a = store.findAsset(req.assetId);

        s.validatePolicy();
        a.validatePolicy(req.uid);

        int hours = req.hoursRequested;

        if (hours == 6) {
            System.out.println("Note: Max duration selected. Return strictly on time.");
        }

        if (a.assetName.contains("Cable") && hours > 3) {
            hours = 3;
            System.out.println("Policy applied: Cables can be issued max 3 hours. Updated to 3.");
        }

        store.markBorrowed(a);
        s.currentBorrowCount++;

        String receipt = "TXN-" + LocalDate.now().toString().replace("-", "")
                + "-" + a.assetId + "-" + req.uid;

        return receipt;
    }
}