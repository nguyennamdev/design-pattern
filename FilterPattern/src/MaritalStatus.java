public enum MaritalStatus {
    marrired, single;

    public int rawValue() {
        switch (this) {
            case marrired:
                return 0;
            case single:
                return 1;
        }
        return -1;
    }

    public MaritalStatus initStatus(int status) {
        switch (status) {
            case 0:
                return marrired;
            case 1:
                return single;
             default:
                 return null;
        }
    }

}
