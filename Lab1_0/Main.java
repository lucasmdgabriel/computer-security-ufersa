package Lab1_0;

class Main {
    public static void main(String[] args) {
        CaesarCypher cc = new CaesarCypher(7);
        System.out.println(cc.encrypt("LUCAS"));
        System.out.println(cc.decrypt("MVDBT"));

    }
}