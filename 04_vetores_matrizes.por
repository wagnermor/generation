programa {
  inclua biblioteca Util --> u
  funcao inicio() {
    //Exercicio 1
  
    inteiro aux
    inteiro listaNumerica[] = {2, 5, 1, 3, 4, 9, 7, 8, 100, 6}
    //inteiro tamanhoDoVetor = u.numero_elementos(listaNumerica) 

    escreva(listaNumerica)

    para(inteiro x = 0; x < 10; x++) {
      
      para(inteiro y = 0; y < 10; y++) {
        
        se(listaNumerica[x] > listaNumerica[y]){
         
          aux = listaNumerica[x]
          listaNumerica[x] = listaNumerica[y]
          listaNumerica[y] = aux
        }
      }
  
    }
    escreva("\n", listaNumerica)

    //Exercicio 2

    inteiro elementoslista[] = {2,5,1,3,4,9,7,8,10,6}
    inteiro elementosIndicesPares[5]
    inteiro indice01 = 0
    inteiro elementosPares[5]
    inteiro indice02 = 0
    inteiro somaElementos = 0
    inteiro mediaElementos

    inteiro tamanhoLista = u.numero_elementos(elementoslista)

    para(inteiro x = 0; x < tamanhoLista; x++) {

      se(x % 2 == 0){
        elementosIndicesPares[indice01] = elementoslista[x]
        indice01++
      }
      
      se(elementoslista[x] % 2 == 0){
        elementosPares[indice02] = elementoslista[x]
        indice02++
      }

      somaElementos += elementoslista[x]
    }
      mediaElementos = somaElementos / tamanhoLista

      escreva("\nElementos nos índices pares: \n", elementosIndicesPares)
      escreva("\nElementos pares: \n", elementosPares)
      escreva("\nSoma: \n", somaElementos)
      escreva("\nMédia: \n", mediaElementos)

      //Exercicio 3

    
    inteiro listaDiagonais[][] = {{1,2,3}, {4,5,6}, {7,8,9}}
    inteiro somaPrincipal = 0
    inteiro somaSecundaria = 0

    escreva("\nElementos da Diagonal Principal:\n")

    para(inteiro x = 0; x < 3; x++) {
      para(inteiro y = 0; y < 3; y++) {
        se(x == y){
          escreva(listaDiagonais[x][y])
          somaPrincipal += listaDiagonais[x][y]
        }
      }
    }

    escreva("\nElementos da Diagonal Secundária:\n")

    para(inteiro x = 0; x < 3; x++) {
      para(inteiro y = 0; y < 3; y++) {

        se((x == 1 e y == 1) ou (x == 0 e y == 2) ou (x == 2 e y == 0)){
          escreva(listaDiagonais[x][y])
          somaSecundaria += listaDiagonais[x][y]
        }
      }
    }

    escreva("\nSoma dos Elementos da Diagonal Principal:\n", somaPrincipal)
    escreva("\nSoma dos Elementos da Diagonal Secundária:\n", somaSecundaria)

  }
}
