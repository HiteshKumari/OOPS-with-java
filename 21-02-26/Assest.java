class Asset {

    String assetId;
    String assetName;
    boolean available;
    int securityLevel;

    Asset(String assetId, String assetName, boolean available, int securityLevel) {
        this.assetId = assetId;
        this.assetName = assetName;
        this.available = available;
        this.securityLevel = securityLevel;
    }

    void validatePolicy(String uid) {

        if (!available) {
            throw new IllegalStateException("Asset not available: " + assetId);
        }

        if (securityLevel == 3 && !uid.startsWith("KRG")) {
            throw new SecurityException("Restricted asset access: " + assetId);
        }
    }
}