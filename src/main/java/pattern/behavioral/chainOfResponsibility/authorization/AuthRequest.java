package pattern.behavioral.chainOfResponsibility.authorization;

class AuthRequest {
    private final String username;
    private final String password;
    private final String token;
    private final String ipAddress;

    public AuthRequest(String username, String password, String token, String ip) {
        this.username = username;
        this.password = password;
        this.token = token;
        this.ipAddress = ip;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getToken() { return token; }
    public String getIpAddress() { return ipAddress; }
}

