package model;

public class Respons {
    private int activeConnections;
    private int accepts;
    private int handled;
    private int requests;

    public int getActiveConnections() {
        return activeConnections;
    }

    public void setActiveConnections(int activeConnections) {
        this.activeConnections = activeConnections;
    }

    public int getAccepts() {
        return accepts;
    }

    public void setAccepts(int accepts) {
        this.accepts = accepts;
    }

    public int getHandled() {
        return handled;
    }

    public void setHandled(int handled) {
        this.handled = handled;
    }

    public int getRequests() {
        return requests;
    }

    public void setRequests(int requests) {
        this.requests = requests;
    }
}
