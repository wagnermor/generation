programa {

  funcao inicio() {
//ExercÃ­cio 1

    inteiro numero
    inteiro contador = 1

    escreva("Digite um número (1 - 10): ")
    leia(numero)

    faca{
      escreva("\n", numero, " x ", contador, " = ", numero * contador)
      contador++
    }enquanto(contador <= 10)

//Exercicio 2

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

    //Exercicio 3

    inteiro num
    inteiro totalDeNumerosPares = 0
    inteiro totalDeNumerosImpares = 0

    para(inteiro x = 1; x <= 10; x++) {
      escreva("Digite o ", x, "° número: ")
      leia(num)
      
      se(num % 2 == 0)
        totalDeNumerosPares++
      senao
        totalDeNumerosImpares++
    }
    escreva("\n\tTotal de números pares: ", totalDeNumerosPares)
    escreva("\n\tTotal de números ímpares: ", totalDeNumerosImpares)

//ExercÃ­cio 4

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
    
    //Exercicio 5

    caracter desejaContinuar = 's'
    inteiro age
    inteiro sexo
    inteiro categoria

    inteiro totalPessoasDevsBackend = 0
    inteiro totalMulheresDevsFrontend = 0
    inteiro totalHomensDevsMobileMaiores40 = 0
    inteiro totalMulheresDevsFullStackMenores30 = 0

    enquanto(desejaContinuar == 'S' ou desejaContinuar == 's') {
      escreva("Digite a Idade: ")
      leia(age)
      
      escreva("\n1 - Masculino\n2 - Feminino\n3 - Outros")
      escreva("\nDigite o Sexo: ")
      leia(sexo)

      escreva("\n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack")
      escreva("\nDigite a Categoria: ")
      leia(categoria)

      se(categoria == 1)
        totalPessoasDevsBackend++
      
      se(categoria == 2 e sexo == 2)
        totalMulheresDevsFrontend++

      se(categoria == 3 e age > 40 e sexo == 1)
        totalHomensDevsMobileMaiores40++

      se(categoria == 4 e age < 30 e sexo == 2)
        totalMulheresDevsFullStackMenores30++

        escreva("Deseja continuar (S/N): ")
        leia(desejaContinuar)
    }
    escreva("\nTotal de pessoas desenvolvedoras Backend: ", totalPessoasDevsBackend)
    escreva("\nTotal de mulheres desenvolvedoras Frontend: ", totalMulheresDevsFrontend)
    escreva("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: ", totalHomensDevsMobileMaiores40)
    escreva("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: ", totalMulheresDevsFullStackMenores30)
  }
}
