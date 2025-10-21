function calcularSoma(numeros) {
  let soma = 0;
  for (let i = 0; i < numeros.length; i++) {
    soma += numeros[i];
  }
  return soma;
}

const minhaLista = [10, 20, 30, 40]; // array list


const resultado = calcularSoma(minhaLista); //pega resultado do calculo sobre minha lista

console.log("O resultado é:", resultado);