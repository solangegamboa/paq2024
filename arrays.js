array = [10, 1, 13, 17];

// Dado um vertor unidimensional (array), quero somar todos os numeros dele e retornar o resultado
// console.log(array);
//Dica: usar estrutura de repetição

// soma = 0;
// for (var i = 0; i <= 3; i++) {
//   console.log("i: ", i);
//   console.log("array de i: ", array[i]);
//   soma = soma + array[i];
// }

// console.log("soma: " + soma);

// Ordenar o vetor do menor para o maior

/**
 * Ler cada item do array
 * Gerar um novo array com esses itens
 * Comparar se o item atual do array é menor ou igual o item atual do array novo
 * Se o item for menor, você vai mover o item pro indice do array -1
 *
 */

array1 = [10, 1, 13, 17];
array2 = [10, 1, 13, 17];

// array1[0] < array2[0+2]
// SIM (10 > 1)
//     então array2[0] = array2[0+1]
// array2 [1, 2]

console.log("arrayOrdenado: " + arrayOrdenado);
