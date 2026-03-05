class Student {

    String uid;
    String name;
    int fineAmount;
    int currentBorrowCount;

    Student(String uid, String name, int fineAmount, int currentBorrowCount) {
        this.uid = uid;
        this.name = name;
        this.fineAmount = fineAmount;
        this.currentBorrowCount = currentBorrowCount;
    }

    void validatePolicy() {
        if (fineAmount > 0) {
            throw new IllegalStateException("Checkout blocked: Pending fine for student " + uid);
        }

        if (currentBorrowCount >= 2) {
            throw new IllegalStateException("Checkout blocked: Borrow limit reached for " + uid);
        }
    }
}
