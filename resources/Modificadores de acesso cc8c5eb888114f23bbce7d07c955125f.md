# Modificadores de acesso

## Public

Pode ser acessada  de qualquer lugar por qualquer entidade que possa visualizar a classe a que ela pertence.

## Private

Os métodos e atributos da classe definidos como privados não pode ser acessados ou usados por nenhuma outra classe. Esses atributos e métodos também não podem ser visualizados pelas classes herdadas.

## Protected

Torna o membro acessível às classes no mesmo pacote ou através de herança, seus membros herdados não são acessíveis a outras classes fora do pacote em que foram declarados

## Default

A classe e/ou seus membros são acessíveis somente por classes do mesmo pacote, na sua declaração não é definido nenhum tipo de modificador, sendo este identificado pelo compilador.

---

## Abstract

Esse modificador não é aplicado nas variáveis, apenas em classes e métodos.

Métodos abstratos não possuem corpo.

Uma classe abstrata não pode ser instanciada.

Se houver alguma declaração de um método como abstract (abstrato), a classe também deve ser marcada como abstract.

## Static

É usado para a criação de uma variável que poderá ser acessada por todas as instâncias de objetos desta classe como uma variável comum, ou seja, a variável criada será a mesma em todas as instâncias e quando seu conteúdo é modificado numa das instâncias, a modificação ocorre em todas as demais. E nas declarações de métodos ajudam no acesso direto à classe, portanto não é necessários instanciar um objeto para acessar o método.

## Final

Quando é aplicado na classe, não permite estender, nos métodos impede que o mesmo seja sobrescrito (overriding) na subclasse, e nos valores de variáveis não pode ser alterado depois que já
tenha sido atribuído um valor.