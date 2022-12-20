programa {
  funcao inicio() {
    //Exercício 01
    inteiro numero
    cadeia parOuImpar
    cadeia negativoOuPositivo

    escreva("Digite um número: ")
    leia(numero)

    se(numero % 2 == 0)
      parOuImpar = "par"
    senao
      parOuImpar = "impar"

    se(numero < 0)
      negativoOuPositivo = "negativo"
    senao
      negativoOuPositivo = "positivo"

    escreva("\nO Número " + numero + " é " + parOuImpar + " e " + negativoOuPositivo)
    
    //Exercício 03
    inteiro idade

    cadeia votoFacutativo
    cadeia aptaAVotar = " está apta a votar "

    escreva("\nDigite a idade: ")
    leia(idade)

    se((idade >= 16 e idade < 18) ou (idade >= 65)) {
      votoFacutativo = "e o voto é facultativo"
    }
    senao se(idade >= 18 e idade < 65) {
      votoFacutativo = "e o voto é obrigatório"
    }
    senao {
      aptaAVotar = " não está apta a votar"
      votoFacutativo = ""
    }

    escreva("\nA pessoa" + aptaAVotar + votoFacutativo + ".")

  }
}
