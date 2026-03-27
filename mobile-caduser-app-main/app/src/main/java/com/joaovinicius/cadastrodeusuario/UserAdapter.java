package com.joaovinicius.cadastrodeusuario;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



//Classe adapter:ferencia a criaçao e o preenchimento dos itens na RecycleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    //atributo privado que armazena a referencia dos dados que serão exibidos
    private List<String> ListaUsuario;

    //Construtor que permite que MainActivity "entregue" a lista de dados para este adapter
    //atributo privado que armazena a referencia dos dados que serão exibidos
    private List<String> ListaUsuario;

    //Construtor que permite que MainActivity "entregue" a lista de dados para este adapter

    public UserAdapter(list<String> lista){
        this.ListaUsuario = lista;

    }

    //metodo 1 : cria "do zero" o visual de uma linha da lista(+ViewHolder)
    @NoNull
    @Override
    public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        //LayoutInflater transforma o arquivo XML em um objeto View Java
        //Aqui usamos um layout padrão do android (simple_list_item_1) para facilitar
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);

        //Retorna uma nova instancia da nossa classe interna ViewHolder com a View Criada
        return new UserViewHolder(view);

    }

    //metodo 2: Vincula os dados de um objeto de lista a uma linha especifica da tela
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        //Recupera os dados da lista de acordo com a posição que o android esta desenhando agora
        String nome= listaUsuario.get(position);

        //define o texto no componente visual que esta guardado dentro de 'holder'
        holder.nome.setText(nome);
    }

    // metodo 3: informa ao android quantos itens a lista possui ao todo
    @Override
    public int getItemCount() {
        // se a lista existir, retorna o tamanho. se nao, retorna zero
        return listaUsuario.size != null ? listaUsuario.size() : 0;
    }

    //classe interna ViewHolder: Servir para "segurar" as referencias dos componentes de cada linha
    //evitar chadas respectivas ao findViewById, melhorando a performance do RecycleView
    public class ViewHolder extends_RecycleView.ViewHolder{
        //referencia para o textview da linha
        TextView tvNome;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //faz o mapeamento do id do layout para o objeto java
            // android.R.id.text1 é o id padrao do layout 'simple_list_item_1'
            tvNome = itemView.findViewById(android.R.id.text1);
        }
    }




}
