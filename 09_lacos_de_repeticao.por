programa {
  funcao inicio() {
    //Exercício 01
    inteiro numero
    inteiro contador = 1

    escreva("Digite um número (1 - 10): ")
    leia(numero)

    faca {
      escreva("\n", numero, " x ", contador, " = ", numero * contador)
      contador++
    }
    enquanto(contador <= 10)
  }

  funcao inicio() {
    //Exercício 02
    inteiro firstNumber
    inteiro secoundNumber

    para(inteiro x = 0; x < 4; x++){
      inteiro eCrescente = 1
      escreva("\nDigite o primeiro número do intervalo: ")
      leia(firstNumber)
      escreva("\nDigite o segundo número do intervalo: ")
      leia(secoundNumber)

      se(firstNumber < secoundNumber e firstNumber % 3 == 0)
        escreva("\n",firstNumber, " é múltiplo de 5 e 3")
      senao se(firstNumber < secoundNumber e firstNumber % 3 != 0)
        escreva("\n",firstNumber, " não é múltiplo de 5 e 3")
      senao
        escreva("Intervalo inválido!")

      se(firstNumber < secoundNumber e secoundNumber % 3 == 0)
        escreva("\n", secoundNumber, " é múltiplo de 5 e 3")
      senao se(firstNumber < secoundNumber e secoundNumber % 3 != 0)
        escreva("\n", secoundNumber, " não é múltiplo de 5 e 3")
    }
  }

  funcao inicio() {
    //Exercício 04
    inteiro continua = 1
    inteiro idade
    inteiro somaTotalMenor21 = 0
    inteiro somaTotalMaior50 = 0

    enquanto(continua == 1){
      escreva("Digite uma idade: ")
      leia(idade)

      se(idade < 21 e idade > 0)
        somaTotalMenor21++
      senao se(idade > 50)
        somaTotalMaior50++

      se(idade < 0)
        continua = 0
    }

    escreva("\nTotal de pessoas menores de 21 anos: ", somaTotalMenor21)
    escreva("\nTotal de pessoas maiores de 50 anos: ", somaTotalMaior50)
  }
}
