package Java;
import java.util.*;

class Global {
    public static Scanner scanner = new Scanner(System.in);
    public static String jogador1 = "VINI";
    public static String jogador2 = "BOTTREL";
    public static String jogador3 = "TIO MARQUIN";

    public static int random(int min, int max) // range : [min, max]
    {
        Random random = new Random();
        return random.nextInt(max + 1 - min) + min;
    }
}

class Personagem {

    private String classe;
    private int PontosDeVida;
    private int PontosDeMana;
    private int ManaMaxima;
    private int ForcaFisica;
    private int ForcaMagica;
    private int Armadura;
    private int ResistenciaMagica;
    private int Agilidade;
    private String arma;
    private int danoMinimo;
    private int danoMaximo;

    public Personagem() {

    }

    String getClasse() {
        return this.classe;
    }

    void setClasse(String classe) {
        this.classe = classe;
    }

    int getPontosDeVida() {
        return this.PontosDeVida;
    }

    void setPontosDeVida(int pontosDeVida) {
        this.PontosDeVida = pontosDeVida;
    }

    int getPontosDeMana() {
        return this.PontosDeMana;
    }

    void setPontosDeMana(int pontosDeMana) {
        this.PontosDeMana = pontosDeMana;
    }

    int getForcaFisica() {
        return this.ForcaFisica;
    }

    void setForcaFisica(int forcaFisica) {
        this.ForcaFisica = forcaFisica;
    }

    int getForcaMagica() {
        return this.ForcaMagica;
    }

    void setForcaMagica(int forcaMagica) {
        this.ForcaMagica = forcaMagica;
    }

    int getArmadura() {
        return this.Armadura;
    }

    void setArmadura(int armadura) {
        this.Armadura = armadura;
    }

    int getResistenciaMagica() {
        return this.ResistenciaMagica;
    }

    void setResistenciaMagica(int resistenciaMagica) {
        this.ResistenciaMagica = resistenciaMagica;
    }

    int getAgilidade() {
        return this.Agilidade;
    }

    void setAgilidade(int agilidade) {
        this.Agilidade = agilidade;
    }

    String getArma() {
        return this.arma;
    }

    void setArma(String arma) {
        this.arma = arma;
    }

    int getDanoMinimo() {
        return this.danoMinimo;
    }

    void setDanoMinimo(int danoMinimo) {
        this.danoMinimo = danoMinimo;
    }

    int getDanoMaximo() {
        return this.danoMaximo;
    }

    void setDanoMaximo(int danoMaximo) {
        this.danoMaximo = danoMaximo;
    }

    int getManaMaxima() {
        return this.ManaMaxima;
    }

    void setManaMaxima(int manaMaxima) {
        this.ManaMaxima = manaMaxima;
    }

    int selecionarMagia() {
        return 0;
    }

    void selecionarArma() {

    }

    // ARMAS

    void GarraLetal() {
        this.danoMinimo = 100;
        this.danoMaximo = 300;
        this.arma = "Garra Letal";
    }

    void TridenteSagrado() {
        this.danoMinimo = 220;
        this.danoMaximo = 420;
        this.arma = "Tridente Sagrado";
    }

    void EspadaBarroca() {
        this.danoMinimo = 300;
        this.danoMaximo = 500;
        this.arma = "Espada Barroca";
    }

    void Porrete() {
        this.danoMinimo = 180;
        this.danoMaximo = 380;
        this.arma = "Porrete";
    }

    void Cajado() {
        this.danoMinimo = 50;
        this.danoMaximo = 200;
        this.arma = "Cajado";
    }

    void Besta() {
        this.danoMinimo = 220;
        this.danoMaximo = 420;
        this.arma = "Besta";
    }

    void EsferaDeAtaque() {
        this.danoMinimo = 200;
        this.danoMaximo = 400;
        this.arma = "Esfera de Ataque";
    }

    // MAGIAS

    int EspadaLendaria() {
        int dano = Global.random(500, 900);
        boolean acertoCritico = Global.random(0, 100) < 30;
        if (acertoCritico == true) {
            System.out.println("**ACERTO CRITICO**");
            return dano * 2;
        } else
            return dano;
    }

    int Tempestade() {
        if (this.PontosDeMana >= 12) {
            this.PontosDeMana -= 12;
            return 200 + (this.ForcaMagica * 200 / 100);
        } else {
            System.out.println("\nMANA INSUFICIENTE!");
            return 0;
        }
    }

    void PocaoDeVida() {
        if (this.PontosDeMana >= 12) {
            this.PontosDeMana -= 12;
            this.PontosDeVida += 200;
            System.out.println("\nRECUPEROU 200 DE VIDA!");
        } else {
            System.out.println("\nMANA INSUFICIENTE!");
        }
    }

    int Bio() {
        if (this.PontosDeMana >= 14) {
            this.PontosDeMana -= 14;
            return 360 + (this.ForcaMagica * 360 / 100);
        } else {
            System.out.println("\nMANA INSUFICIENTE!");
            return 0;
        }
    }

    void Cura() {
        if (this.PontosDeMana >= 16) {
            this.PontosDeMana -= 16;
            this.PontosDeVida += 400;
            System.out.println("\nRECUPEROU 400 DE VIDA!");
        } else {
            System.out.println("\nMANA INSUFICIENTE!");
        }
    }

    int FlamaGelada() {
        if (this.PontosDeMana >= 14) {
            this.PontosDeMana -= 14;
            return 320 + (this.ForcaMagica * 360 / 100);
        } else {
            System.out.println("\nMANA INSUFICIENTE!");
            return 0;
        }
    }

    int Intoxicacao() {
        if (this.PontosDeMana >= 12) {
            this.PontosDeMana -= 12;
            return 280 + (this.ForcaMagica * 280 / 100);
        } else {
            System.out.println("\nMANA INSUFICIENTE!");
            return 0;
        }
    }

    int HalitoDeFogo() {
        if (this.PontosDeMana >= 12) {
            this.PontosDeMana -= 12;
            return 400 + (this.ForcaMagica / 100 * 400);
        } else {
            System.out.println("\nMANA INSUFICIENTE!");
            return 0;
        }
    }
};

class Guerreiro extends Personagem {

    public Guerreiro() {
        super.setClasse("Guerreiro");
        super.setPontosDeVida(4000);
        super.setPontosDeMana(30);
        super.setManaMaxima(30);
        super.setForcaFisica(100);
        super.setForcaMagica(20);
        super.setArmadura(80);
        super.setResistenciaMagica(20);
        super.setAgilidade(20);
        super.setPontosDeMana(30);
        super.Porrete();
    }

    int selecionarMagia() {
        int escolha;
        System.out.print("\n1 - TEMPESTADE\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            return Tempestade();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
        return 0;
    }

    void selecionarArma() {
        int escolha;
        System.out.print("\n1 - ESPADA BARROCA\n2 - PORRETE\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE EQUIPOU A ESPADA BARROCA!");
            EspadaBarroca();
        } else if (escolha == 2) {
            System.out.println("VOCE EQUIPOU O PORRETE!");
            Porrete();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
    }

};

class Ladrao extends Personagem {

    Ladrao() {
        super.setClasse("Ladrao");
        super.setPontosDeVida(2800);
        super.setPontosDeMana(50);
        super.setManaMaxima(50);
        super.setForcaFisica(50);
        super.setForcaMagica(30);
        super.setArmadura(40);
        super.setResistenciaMagica(50);
        super.setAgilidade(80);
        super.Cajado();
    }

    int selecionarMagia() {
        int escolha;
        System.out.print("\n1 - TEMPESTADE\n2 - INTOXICACAO\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            return Tempestade();
        } else if (escolha == 2) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            return Intoxicacao();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
        return 0;
    }

    void selecionarArma() {
        int escolha;
        System.out.print("\n1 - CAJADO\n2 - PORRETE\n3 - BESTA\n4 - ESFERA DE ATAQUE\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE EQUIPOU O CAJADO!");
            Cajado();
        } else if (escolha == 2) {
            System.out.println("VOCE EQUIPOU O PORRETE!");
            Porrete();
        } else if (escolha == 3) {
            System.out.println("VOCE EQUIPOU A BESTA!");
            Besta();
        } else if (escolha == 4) {
            System.out.println("VOCE EQUIPOU A ESFERA DE ATAQUE!");
            EsferaDeAtaque();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
    }
}

class Mago extends Personagem {

    Mago() {
        super.setClasse("Mago");
        super.setPontosDeVida(2500); // 2500
        super.setPontosDeMana(100);
        super.setManaMaxima(100);
        super.setForcaFisica(40);
        super.setForcaMagica(100);
        super.setArmadura(30);
        super.setResistenciaMagica(80);
        super.setAgilidade(40);
        Cajado();
    }

    int selecionarMagia() {
        int escolha;
        System.out.print(
                "\n1 - TEMPESTADE\n2 - INTOXICACAO\n3 - POCAO DE VIDA\n4 - BIO\n5 - CURA\n6 - FLAMA GELADA\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            return Tempestade();
        } else if (escolha == 2) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            return Intoxicacao();

        } else if (escolha == 3) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            PocaoDeVida();
            return 0;

        } else if (escolha == 4) {
            System.out.println("VOCE GASTOU 14 DE MANA");
            return Bio();

        } else if (escolha == 5) {
            System.out.println("VOCE GASTOU 16 DE MANA");
            Cura();
            return 0;

        } else if (escolha == 6) {
            System.out.println("VOCE GASTOU 14 DE MANA");
            return FlamaGelada();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
        return 0;
    }

    void selecionarArma() {
        int escolha;
        System.out.print("\n1 - TRIDENTE SAGRADO\n2 - CAJADO\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE EQUIPOU O TRIDENTE SAGRADO!");
            TridenteSagrado();
        } else if (escolha == 2) {
            System.out.println("VOCE EQUIPOU O CAJADO!");
            Cajado();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
    }
};

class Paladino extends Personagem {

    Paladino() {
        super.setClasse("Paladino");
        super.setPontosDeVida(3200);
        super.setPontosDeMana(80);
        super.setManaMaxima(80);
        super.setForcaFisica(60);
        super.setForcaMagica(50);
        super.setArmadura(60);
        super.setResistenciaMagica(60);
        super.setAgilidade(60);
        super.Besta();
    }

    int selecionarMagia() {
        int escolha;
        System.out.print("\n1 - TEMPESTADE\n2 - POCAO DE VIDA\n3 - FLAMA GELADA\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            return Tempestade();
        } else if (escolha == 2) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            PocaoDeVida();
            return 0;

        } else if (escolha == 3) {
            System.out.println("VOCE GASTOU 14 DE MANA");
            return FlamaGelada();

        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
        return 0;
    }

    void selecionarArma() {
        int escolha;
        System.out.print("\n1 - TRIDENTE SAGRADO\n2 - BESTA\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE EQUIPOU O TRIDENTE SAGRADO!");
            TridenteSagrado();
        } else if (escolha == 2) {
            System.out.println("VOCE EQUIPOU A BESTA!");
            Besta();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
    }
};

class Animal extends Personagem {

    Animal() {
        super.setClasse("Animal");
        super.setPontosDeVida(3200);
        super.setPontosDeMana(30);
        super.setManaMaxima(30);
        super.setForcaFisica(80);
        super.setForcaMagica(20);
        super.setArmadura(80);
        super.setResistenciaMagica(20);
        super.setAgilidade(50);
        super.GarraLetal();
    }

    int selecionarMagia() {
        int escolha;
        System.out.print("\n1 - BIO\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE GASTOU 14 DE MANA");
            return Bio();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");

        return 0;
    }

    void selecionarArma() {
        int escolha;
        System.out.print("\n1 - GARRA LETAL\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE EQUIPOU A GARRA LETAL!");
            GarraLetal();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
    }
};

class Troll extends Personagem {

    Troll() {
        super.setClasse("Troll");
        super.setPontosDeVida(2800);
        super.setPontosDeMana(20);
        super.setManaMaxima(20);
        super.setForcaFisica(100);
        super.setForcaMagica(20);
        super.setArmadura(80);
        super.setResistenciaMagica(20);
        super.setAgilidade(20);
        Cajado();
    }

    int selecionarMagia() {
        int escolha;
        System.out.print("\n1 - INTOXICACAO\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            return Intoxicacao();
        }

        else
            System.out.println("\nERRO! VALOR INVALIDO!");

        return 0;
    }

    void selecionarArma() {
        int escolha;
        System.out.print("\n1 - PORRETE\n2 - CAJADO\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE EQUIPOU O PORRETE!");
            Porrete();
        } else if (escolha == 2) {
            System.out.println("VOCE EQUIPOU O CAJADO!");
            Cajado();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
    }

};

class Dragao extends Personagem {

    Dragao() {
        super.setClasse("Dragao");
        super.setPontosDeVida(3000);
        super.setPontosDeMana(40);
        super.setManaMaxima(40);
        super.setForcaFisica(100);
        super.setForcaMagica(20);
        super.setArmadura(50);
        super.setResistenciaMagica(50);
        super.setAgilidade(30);
        GarraLetal();
    }

    int selecionarMagia() {
        int escolha;
        System.out.print("\n1 - HALITO DE FOGO\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            return HalitoDeFogo();
        }

        else
            System.out.println("\nERRO! VALOR INVALIDO!");

        return 0;
    }

    void selecionarArma() {
        int escolha;
        System.out.print("\n1 - GARRA LETAL\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE EQUIPOU A GARRA LETAL!");
            GarraLetal();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
    }
};

class Zumbi extends Personagem {

    public Zumbi() {
        super.setClasse("Zumbi");
        super.setPontosDeVida(2500);
        super.setPontosDeMana(20);
        super.setManaMaxima(20);
        super.setForcaFisica(40);
        super.setForcaMagica(20);
        super.setArmadura(40);
        super.setResistenciaMagica(80);
        super.setAgilidade(50);
        super.Cajado();
    }

    int selecionarMagia() {
        int escolha;
        System.out.print("\n1 - INTOXICACAO\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE GASTOU 12 DE MANA");
            return Intoxicacao();
        }

        else
            System.out.println("\nERRO! VALOR INVALIDO!");

        return 0;
    }

    void selecionarArma() {
        int escolha;
        System.out.print("\n1 - GARRA LETAL\n2 - PORRETE\n3 - CAJADO\n\nEscolha: ");
        escolha = Global.scanner.nextInt();

        if (escolha == 1) {
            System.out.println("VOCE EQUIPOU A GARRA LETAL!");
            GarraLetal();
        } else if (escolha == 2) {
            System.out.println("VOCE EQUIPOU O PORRETE!");
            Porrete();
        } else if (escolha == 3) {
            System.out.println("VOCE EQUIPOU O CAJADO");
            Cajado();
        } else
            System.out.println("\nERRO! VALOR INVALIDO!");
    }
};

class RPG {

    static int turnos = 1;

    static void playerChoiceOptions(Personagem p) {
        System.out.println("\nVOCE ESCOLHEU " + p.getClasse() + "!\n");
        System.out.print("VIDA:" + p.getPontosDeVida());
        System.out.print(" | MANA:" + p.getPontosDeMana());
        System.out.print(" | FORCA FISICA:" + p.getForcaFisica());
        System.out.print(" | FORCA MAGICA:" + p.getForcaMagica());
        System.out.print(" | ARMADURA:" + p.getArmadura() + "\n");
        System.out.print("RESISTENCIA MAGICA:" + p.getResistenciaMagica());
        System.out.print(" | AGILIDADE:" + p.getAgilidade());
        System.out.print(" | ARMA INICIAL:" + p.getArma());
    }

    static Personagem playerChoiceMenu(String player) {

        Personagem personagem = new Personagem();

        int escolha = 0;
        while (escolha < 1 || escolha > 8) {
            System.out.println("\n\n           ESCOLHA SEU PERSONAGEM " + player);
            System.out.println("\n-x- HUMANOS -x-\n  1 - GUERREIRO\n  2 - LADRAO\n  3 - MAGO\n  4 - PALADINO");
            System.out.println("\n-x- INUMANOS -x-\n  5 - ANIMAL\n  6 - TROLL\n  7 - DRAGAO\n  8 - ZUMBI");
            System.out.print("\nESCOLHA: ");
            escolha = Global.scanner.nextInt();

            switch (escolha) {
                case 1: {
                    personagem = new Guerreiro();
                    playerChoiceOptions(personagem);
                    break;
                }
                case 2: {
                    personagem = new Ladrao();
                    playerChoiceOptions(personagem);
                    break;
                }
                case 3: {
                    personagem = new Mago();
                    playerChoiceOptions(personagem);
                    break;
                }
                case 4: {
                    personagem = new Paladino();
                    playerChoiceOptions(personagem);
                    break;
                }
                case 5: {
                    personagem = new Animal();
                    playerChoiceOptions(personagem);
                    break;
                }
                case 6: {
                    personagem = new Troll();
                    playerChoiceOptions(personagem);
                    break;
                }
                case 7: {
                    personagem = new Dragao();
                    playerChoiceOptions(personagem);
                    break;
                }
                case 8: {
                    personagem = new Zumbi();
                    playerChoiceOptions(personagem);
                    break;
                }
                default: {
                    System.out.println("VALOR INVALIDO!");
                    break;
                }
            }
        }

        return personagem;
    }

    public static Personagem recuperaMana(Personagem player) {
        if (player.getPontosDeMana() < player.getManaMaxima()) {

            if (player.getPontosDeMana() + 10 > player.getManaMaxima())
                player.setPontosDeMana(player.getManaMaxima());
            else
                player.setPontosDeMana(player.getPontosDeMana() + 10);
        }

        return player;
    }

    public static Personagem selecionarPlayerAlvo(int jogadorTurno, Personagem player1, Personagem player2,
            Personagem player3) {

        int jogadorAlvo = 0;

        System.out.println("\nESCOLHA O JOGADOR ALVO:");

        if (jogadorTurno == 0) {
            if (player2.getPontosDeVida() > 0) System.out.println("1 - " + player2.getClasse() + " (" + Global.jogador2 + ")" + " - VIDA: " + player2.getPontosDeVida());

            if (player3.getPontosDeVida() > 0) System.out.println("2 - " + player3.getClasse() + " (" + Global.jogador3 + ")" + " - VIDA: " + player3.getPontosDeVida());

            System.out.print("\nESCOLHA: ");
            jogadorAlvo = Global.scanner.nextInt();

            if(jogadorAlvo == 1) return player2;
            else if(jogadorAlvo == 2) return player3;
            else new Exception ("Erro: Alvo inválido!");

        } else if (jogadorTurno == 1) {
            
            if (player1.getPontosDeVida() > 0) System.out.println("1 - " + player1.getClasse() + " (" + Global.jogador1 + ")" + " - VIDA: " + player1.getPontosDeVida());

            if (player3.getPontosDeVida() > 0) System.out.println("2 - " + player3.getClasse() + " (" + Global.jogador3 + ")" + " - VIDA: " + player3.getPontosDeVida());

            System.out.print("\nESCOLHA: ");
            jogadorAlvo = Global.scanner.nextInt();

            if(jogadorAlvo == 1) return player1;
            else if(jogadorAlvo == 2) return player3;
            else new Exception ("Erro: Alvo inválido!");

        } else {
            if (player1.getPontosDeVida() > 0) System.out.println("1 - " + player1.getClasse() + " (" + Global.jogador1 + ")" + " - VIDA: " + player1.getPontosDeVida());

            if (player2.getPontosDeVida() > 0) System.out.println("2 - " + player2.getClasse() + " (" + Global.jogador2 + ")" + " - VIDA: " + player2.getPontosDeVida());

            System.out.print("\nESCOLHA: ");
            jogadorAlvo = Global.scanner.nextInt();

            if(jogadorAlvo == 1) return player1;
            else if(jogadorAlvo == 2) return player2;
            else new Exception ("Erro: Alvo inválido!");
        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println(
                "x---------------------------------------------x\n|                RPG POR TURNOS               |\nx---------------------------------------------x");

        Personagem player1 = new Personagem();
        Personagem player2 = new Personagem();
        Personagem player3 = new Personagem();

        // escolha player 1
        player1 = playerChoiceMenu(Global.jogador1);
        // escolha player 2
        player2 = playerChoiceMenu(Global.jogador2);
        // escolha player 3
        player3 = playerChoiceMenu(Global.jogador3);

        while ((player1.getPontosDeVida() > 0 && player2.getPontosDeVida() > 0) ||
                (player2.getPontosDeVida() > 0 && player3.getPontosDeVida() > 0)
                || (player1.getPontosDeVida() > 0 && player3.getPontosDeVida() > 0)) {

            int escolha = 0;
            int jogadorTurno = turnos % 3;
            String nomeJogador = "";
            Personagem player;
            Personagem playerAlvo;

            if (jogadorTurno == 0) {
                player = player1;
                nomeJogador = Global.jogador1;
            } else if (jogadorTurno == 1) {
                player = player2;
                nomeJogador = Global.jogador2;
            } else {
                player = player3;
                nomeJogador = Global.jogador3;
            }

            if (player.getPontosDeVida() > 0) {

                System.out.println(
                        "\n===================================================================\n\n       -X- TURNO "
                                + turnos + " -X-");

                System.out.println("\nVEZ DE " + nomeJogador + " - " + player.getClasse() + "\nVIDA: "
                        + player.getPontosDeVida() + "   MANA: " + player.getPontosDeMana());

                System.out.println("\nx------------------x\n|      ACOES       |\nx------------------x");
                System.out.println("\n1 - ATACAR\n2 - MAGIA\n3 - TROCAR DE ARMA");

                boolean espadaLendaria = (Global.random(0, 100) < 20);

                if (espadaLendaria == true) {
                    System.out.println("4 - VOTO SOLENE DE BUL-KATHOS!");
                }

                System.out.print("\nESCOLHA: ");
                escolha = Global.scanner.nextInt();

                switch (escolha) {
                    case 1: {

                        playerAlvo = selecionarPlayerAlvo(jogadorTurno, player1, player2, player3);

                        boolean esquivou = (Global.random(0, 100)) < playerAlvo.getAgilidade()/2;

                        if (esquivou == false) {

                            int dano = Global.random(player.getDanoMinimo(), player.getDanoMaximo());
                            dano = dano + ((player.getForcaFisica() * dano) / 100);
                            int danoCausado = dano - ((playerAlvo.getArmadura() * dano) / 100);

                            playerAlvo.setPontosDeVida(playerAlvo.getPontosDeVida() - (int) danoCausado);

                            System.out.print(danoCausado + " DE DANO CAUSADO!");

                        } else
                            System.out.print("\nO ADVERSARIO ESQUIVOU DO ATAQUE!");

                        player = recuperaMana(player);

                        break;
                    }
                    case 2: {
                        int dano = player.selecionarMagia();

                        if (dano != 0) {

                            playerAlvo = selecionarPlayerAlvo(jogadorTurno, player1, player2, player3);

                            boolean esquivou = (Global.random(0, 100)) < player.getAgilidade()/2;

                            if (esquivou == false) {
                                int danoCausado = dano - ((playerAlvo.getResistenciaMagica() * dano) / 100);
                                playerAlvo.setPontosDeVida(playerAlvo.getPontosDeVida() - (int) danoCausado);

                                System.out.println("\n" + danoCausado + " DE DANO CAUSADO!");

                            } else
                                System.out.println("\nO ADVERSARIO ESQUIVOU DO ATAQUE!");
                        }
                        break;
                    }
                    case 3: {
                        player.selecionarArma();

                        player = recuperaMana(player);

                        break;
                    }
                    case 4: {

                        playerAlvo = selecionarPlayerAlvo(jogadorTurno, player1, player2, player3);

                        if (espadaLendaria == true) {
                            int dano = playerAlvo.EspadaLendaria();
                            boolean esquivou = Global.random(0, 100) < player.getAgilidade()/2;

                            if (esquivou == false) {
                                dano = dano + ((player.getForcaFisica() * dano) / 100);
                                int danoCausado = dano - ((playerAlvo.getArmadura() * dano) / 100);
                                playerAlvo.setPontosDeVida(playerAlvo.getPontosDeVida() - (int) danoCausado);
                                System.out.println("\n" + danoCausado + " DE DANO CAUSADO!");

                            } else
                                System.out.println("\nO ADVERSARIO ESQUIVOU DO ATAQUE!");
                        }

                        break;
                    }
                    default:
                        break;
                }

                if (player1.getPontosDeVida() <= 0)
                    System.out.println("\n\n" + Global.jogador1 + " ABATIDO!");
                if (player2.getPontosDeVida() <= 0)
                    System.out.println("\n\n" + Global.jogador2 + " ABATIDO!");
                if (player3.getPontosDeVida() <= 0)
                    System.out.println("\n\n" + Global.jogador3 + " ABATIDO!");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }

            turnos++;
        }

        if (player1.getPontosDeVida() <= 0 && player2.getPontosDeVida() <= 0 && player3.getPontosDeVida() > 0) {
            System.out.println(
                    "\nx-------------------------------x\n|       VITORIA DO " + Global.jogador3 + "      |\nx-------------------------------x");
        } else if (player1.getPontosDeVida() <= 0 && player2.getPontosDeVida() > 0 && player3.getPontosDeVida() <= 0) {
            System.out.println(
                    "\nx-------------------------------x\n|       VITORIA DO " + Global.jogador2 + "      |\nx-------------------------------x");
        } else if (player1.getPontosDeVida() > 0 && player2.getPontosDeVida() <= 0 && player3.getPontosDeVida() <= 0) {
            System.out.println(
                    "\nx-------------------------------x\n|       VITORIA DO " + Global.jogador1 + "      |\nx-------------------------------x");
        } else {
            System.out.println(
                    "\nx-------------------------------x\n|       EMPATE      |\nx-------------------------------x");
        }
    }
}