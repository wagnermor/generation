programa {
  funcao inicio() {
    //Exerc�cio 01
    inteiro numero
    cadeia parOuImpar
    cadeia negativoOuPositivo

    escreva("Digite um n�mero: ")
    leia(numero)

    se(numero % 2 == 0)
      parOuImpar = "par"
    senao
      parOuImpar = "impar"

    se(numero < 0)
      negativoOuPositivo = "negativo"
    senao
      negativoOuPositivo = "positivo"

    escreva("\nO N�mero " + numero + " � " + parOuImpar + " e " + negativoOuPositivo)
    
    //Exerc�cio 03
    inteiro idade

    cadeia votoFacutativo
    cadeia aptaAVotar = " est� apta a votar "

    escreva("\nDigite a idade: ")
    leia(idade)

    se((idade >= 16 e idade < 18) ou (idade >= 65)) {
      votoFacutativo = "e o voto � facultativo"
    }
    senao se(idade >= 18 e idade < 65) {
      votoFacutativo = "e o voto � obrigat�rio"
    }
    senao {
      aptaAVotar = " n�o est� apta a votar"
      votoFacutativo = ""
    }

    escreva("\nA pessoa" + aptaAVotar + votoFacutativo + ".")

  }
}
