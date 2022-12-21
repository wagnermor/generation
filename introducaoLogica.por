programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    //Exercicio 01
    /*real salario
    real abono
    real novoSalario

    escreva("Digite o Salário: ")
    leia(salario)
    escreva("Digite o Abono: ")
    leia(abono)
    
    novoSalario = salario + abono
    escreva("\nNovo salário: R$ ", mat.arredondar(novoSalario,2))*/

    //Exercicio 02

    /*real nota01
    real nota02
    real nota03
    real nota04

    para(inteiro x = 1; x <= 4; x++){
      escreva("Nota ", x, ": ")
      escolha(x){
        caso 1:
          leia(nota01)
          pare
        caso 2:
          leia(nota02)
          pare
        caso 3:
          leia(nota03)
          pare
        caso 4:
          leia(nota04)
          pare
      }
    }
      escreva("Média final: ", mat.arredondar(((nota01 + nota02 + nota03 + nota04) / 4), 1)*/

      //Exercicio 03

      /*real salarioBruto
      real adicionalNoturno
      real horasExtras
      real descontos
      real salarioLiquido

      escreva("Salário Bruto: ")
      leia(salarioBruto)
      escreva("Adicional Noturno: ")
      leia(adicionalNoturno)
      escreva("Horas Extras: ")
      leia(horasExtras)
      escreva("Descontos: ")
      leia(descontos)

      salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos

      escreva("\nSalário Líquido: ", mat.arredondar(salarioLiquido,2)*/

      //Exercicio 04

      inteiro numero1, numero2, numero3, numero4

      escreva("numero1: ")
      leia(numero1)
      escreva("numero2: ")
      leia(numero2)
      escreva("numero3: ")
      leia(numero3)
      escreva("numero4: ")
      leia(numero4)

      escreva("Diferença: ", (numero1 * numero2) - (numero3 * numero4))
  }
}
