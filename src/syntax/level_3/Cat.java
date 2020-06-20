package syntax.level_3;



public class Cat {
    public static void main(String[] args) {
        Object [] mass = new Object[12];
        String[] array = new String[]{
                "e",
                "r",
                "t",
                "y",
                "u",
                "i",
                "o",
                "j",
                "b",
                "v",
                "c",
                "x"
        };
        for (int i = 0; i < 5; i++) {
            Zerg zerg = new Zerg();
            zerg.name = array[i];
            mass[i] = zerg;
        }
        for (int i = 5; i < 8; i++) {
            Protoss protoss = new Protoss();
            protoss.name = array[i];
            mass[i] = protoss;
        }
        for (int i = 8; i < 12; i++) {
            Terran terran = new Terran();
            terran.name = array[i];
            mass [i] = terran;
        }

        new Zerg().toString();

    }
        public static class Zerg {
            public String name;
        }

        public static class Protoss {
            public String name;
        }

        public static class Terran {
            public String name;
        }
    }

