package cronicas;

public class CronicasDoEstudanteSistema {
    private Cronica[] cronicas;
    private int proxIndiceLivre;
    private Cronica cronicaMaisLida;

    public CronicasDoEstudanteSistema() {
        this.cronicas = new Cronica[1000];
        this.proxIndiceLivre = 0;
        this.cronicaMaisLida = null;
    }

    public void cadastrarCronica(String titulo, String texto, String data, String autor) {
        this.cronicas[proxIndiceLivre++] = new Cronica(proxIndiceLivre, titulo, texto, data, autor);
    }

    public void cadastrarCronica(String titulo, String texto, String data) {
        this.cronicas[proxIndiceLivre++] = new Cronica(proxIndiceLivre, titulo, texto, data);
    }

    public String listarCronicas() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < this.cronicas.length; i++){
            if (this.cronicas[i] == null) {
                break;
            }
            out.append(this.cronicas[i].toString());
        }
        return out.toString();
    }

    public String lerCronica(int i) {
        Cronica cronica = this.cronicas[i - 1];
        if (this.cronicaMaisLida == null || cronica.getQtdLeituras() > this.cronicaMaisLida.getQtdLeituras()){
            this.cronicaMaisLida = cronica;
        }
        return cronica.ler();
    }

    public String exibirCronicaMaisLida() {

    }

    public void criarLivreto(int[]) {

    } //array com a posição das crônicas a serem inseridas no Livreto

    public String lerLivreto(int i) {

    } //i é o indice do livreto

}
