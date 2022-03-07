public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    private int errorValue;





    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback, int errorValue) {
        this.callback = callback;
        this.errorCallback = errorCallback;
        this.errorValue = errorValue;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != 33){
                callback.onDone("Task " + i + " is done");

            } else {
                errorCallback.onError("Task " + i + " is error");
            }
        }
    }
}
