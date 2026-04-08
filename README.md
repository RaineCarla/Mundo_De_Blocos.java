# Mundo de Blocos — Padrão Flyweight

# Descrição:
Projeto simples que aplica o padrão de projeto Flyweight, permitindo compartilhar blocos iguais para economizar memória. As características do bloco são reutilizadas, enquanto a posição é informada externamente.

--- 

# Tecnologias :
- Java

- Programação Orientada a Objetos (POO)

- Padrão de Projeto Flyweight

---

# Estrutura :
- Interface: Bloco
Define o comportamento comum:
exibir(int x, int y, int z)

 - Classe: TipoBloco (Flyweight)
Representa o tipo do bloco (estado compartilhado).
Atributos:
nome
textura
solido

Função:
Exibir o bloco com sua posição

- Classe: BlocoFactory

Responsável por criar e reutilizar blocos.

Função:
Evitar duplicação de objetos
Retornar instâncias já existentes

- Classe: Main
Responsável por testar o sistema.
---

# Funcionalidades
- Compartilhar blocos iguais
- Evitar criação de objetos duplicados
- Informar posição externamente
- Economizar memória

--- 

# Autora: 

Raine Carla
