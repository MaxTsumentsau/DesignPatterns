package pattern.chainOfResponsibility;

import java.util.Set;

class IPFilterHandler extends AuthHandler {
    private final Set<String> blockedIPs = Set.of("192.168.1.100", "10.0.0.5");

    @Override
    public boolean handle(AuthRequest request) {
        System.out.println("Проверка IP адреса...");

        if (blockedIPs.contains(request.getIpAddress())) {
            System.out.println("IP адрес заблокирован: " + request.getIpAddress());
            return false;
        }

        System.out.println("IP адрес разрешен");
        return handleNext(request);
    }
}
