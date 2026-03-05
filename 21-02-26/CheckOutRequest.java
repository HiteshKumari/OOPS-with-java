class CheckoutRequest {

    String uid;
    String assetId;
    int hoursRequested;

    CheckoutRequest(String uid, String assetId, int hoursRequested) {

        ValidationUtil.validateUid(uid);
        ValidationUtil.validateAssetId(assetId);
        ValidationUtil.validateHours(hoursRequested);

        this.uid = uid;
        this.assetId = assetId;
        this.hoursRequested = hoursRequested;
    }
}