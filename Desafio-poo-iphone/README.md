classDiagram IphoneCelular

class IPhoneCelular {
  - musicas: List<Musica>
  - telefone: Telefone
  - navegador: Navegador

  + tocar()
  + pausar()
  + selecionarMusica(index:int)
  + ligar()
  + atender()
  + iniciarCorreiroVoz()
  + exibirPagina()
  + adicionarNovaAba()
  + atualizarPagina()
}

class Musica {
  # nome: String
  # artista: String

  + tocar()
  + pausar()	
}

class Telefone {
  # numero: String

  + ligar(telefone:String)
  + atender()
  + iniciarCorreiroVoz()
}

class Navegador {
  - urlAtual: String

  + exibirPagina(url:String)
  + adicionarNovaAba()
  + atualizarPagina()
}

iPhone "1" o-- "n" Musica
iPhone "1" o-- "1" Telefone
iPhone "1" o-- "1" Navegador
