package dominoproj;

public class Player {
    private String nome;
    private Pedra pedra = new Pedra();
    private int[] pontos = new int[7];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getPontos() {
        return pontos;
    }

    public void setPontos(int rodada, int pontosRodada) {
        pontos[rodada] = pontosRodada;
    }

    public String getPedraFormatada() {
        return pedra.getPedraFormatada();
    }

    public String getPedraFormatadaInvertida() {
        return pedra.getPedraFormatadaInvertida();
    }

    public int getValorPedra() {
        return pedra.getValorPedra();
    }

    public void setValorPontas() {
        pedra.setPedra();
    }

    public int getPontuacaoFinal() {
        int soma = 0;
        for (int i = 0; i < pontos.length; i++) {
            soma += pontos[i];
        }
        return soma;
    }
}