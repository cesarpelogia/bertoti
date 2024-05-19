    package mercearia;

    public class Bebida {
        
        // Atributos
        private String nomeBebida;
        private String tipoBebida;
        private String marcaBebida;
        private int qntdBebida;
    
        public Bebida(String nomeBebida, String tipoBebida, String marcaBebida, int qntdBebida){
            this.nomeBebida = nomeBebida;
            this.tipoBebida = tipoBebida;
            this.marcaBebida = marcaBebida;
            this.qntdBebida = qntdBebida;
        }
        
        // Metodo Acesso nomeBebida
        public String getnomeBebida() {return nomeBebida;}
        public void setnomeBebida(String nomeBebida) {this.nomeBebida = nomeBebida;}

        // Metodo Acesso tipoBebida Bebida
        public String gettipoBebida() {return tipoBebida;}
        public void settipoBebida(String tipoBebida) {this.tipoBebida = tipoBebida;}

        // Metodo Acesso marcaBebida Bebida
        public String getmarcaBebida() {return marcaBebida;}
        public void setmarcaBebida(String marcaBebida) {this.marcaBebida = marcaBebida;}

        // Metodo Acesso Quantidade Bebida
        public int getQuantidade() {return qntdBebida;}
        public void setQuantidade(int qntdBebida) {this.qntdBebida = qntdBebida;}
    }
