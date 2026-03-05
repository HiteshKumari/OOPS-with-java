import java.util.HashMap;

class AssetStore {

    HashMap<String, Asset> assets = new HashMap<>();

    void addAsset(Asset a) {
        assets.put(a.assetId, a);
    }

    Asset findAsset(String assetId) {

        Asset a = assets.get(assetId);

        if (a == null) {
            throw new NullPointerException("Asset not found: " + assetId);
        }

        return a;
    }

    void markBorrowed(Asset a) {

        if (!a.available) {
            throw new IllegalStateException("Asset already borrowed");
        }

        a.available = false;
    }
}