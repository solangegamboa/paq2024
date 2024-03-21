const main = () => {
  categoria = "EE";
  nome_cliente = "Sol";
  preco = 200;

  const calcularPorcentagem = (preco, porcentagem) => {
    return preco - preco * (porcentagem / 100);
  };

  switch (categoria) {
    case "A":
      return calcularPorcentagem(preco, 10);
    case "B":
      return calcularPorcentagem(preco, 15);
    case "C":
      return calcularPorcentagem(preco, 20);
    case "D":
      return calcularPorcentagem(preco, 25);
    case "E":
      return calcularPorcentagem(preco, 50);
    default:
      return calcularPorcentagem(preco, 0);
  }
};

console.log(main());
