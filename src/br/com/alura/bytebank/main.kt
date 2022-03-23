import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.teste.testaContasDiferentes

fun main() {
    testaContasDiferentes()
    println("total contas ${Conta.Contador.total}")
}