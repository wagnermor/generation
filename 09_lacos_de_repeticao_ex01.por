programa {
  funcao inicio() {
    //Exerc�cio 01
    inteiro numero
    inteiro contador = 1

    escreva("Digite um n�mero (1 - 10): ")
    leia(numero)

    faca {
      escreva("\n", numero, " x ", contador, " = ", numero * contador)
      contador++
    }
    enquanto(contador <= 10)
  }
}
