programa {
  funcao inicio() {
    //Exerc�cio 02
    inteiro firstNumber
    inteiro secoundNumber

    para(inteiro x = 0; x < 4; x++){
      inteiro eCrescente = 1
      escreva("\nDigite o primeiro n�mero do intervalo: ")
      leia(firstNumber)
      escreva("\nDigite o segundo n�mero do intervalo: ")
      leia(secoundNumber)

      se(firstNumber < secoundNumber e firstNumber % 3 == 0)
        escreva("\n",firstNumber, " � m�ltiplo de 5 e 3")
      senao se(firstNumber < secoundNumber e firstNumber % 3 != 0)
        escreva("\n",firstNumber, " n�o � m�ltiplo de 5 e 3")
      senao
        escreva("Intervalo inv�lido!")

      se(firstNumber < secoundNumber e secoundNumber % 3 == 0)
        escreva("\n", secoundNumber, " � m�ltiplo de 5 e 3")
      senao se(firstNumber < secoundNumber e secoundNumber % 3 != 0)
        escreva("\n", secoundNumber, " n�o � m�ltiplo de 5 e 3")
    }

  }
}
