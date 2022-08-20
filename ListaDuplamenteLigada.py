class Celula:
  def __init__(self, anterior=None, valor=None, posterior=None):
    self.anterior = anterior
    self.valor = valor
    self.posterior = posterior

def inserir_dLigada(L, k):
  if L.valor == None:
    L.valor = k
  else:
    nova = Celula()
    nova.valor = k
    nova.posterior = L
    if L != None:
       L.anterior = nova
    L = nova
  return L 

def inserir_dLigada_fim(L, k):
  x = L
  while x.posterior != None:
    x = x.posterior
  nova = Celula()
  nova.valor = k
  x.posterior = nova
  nova.anterior = x

def imprime_lista(L):
  x = L
  while x.posterior != None:
    print(x.valor)
    x = x.posterior
  print(x.valor)

def busca(L, k):
  x = L
  while x.posterior != None and x.valor != k:
    x = x.posterior
  return x

def remover(L, q):
  if q.anterior == None:
    L = q.posterior
    q.posterior.anterior = None
  else:
    p = q.anterior
    p.posterior = q.posterior
    if q.posterior != None:
      q.posterior.anterior = p
  return L
  
L = Celula()
L = inserir_dLigada(L, 10)
L = inserir_dLigada(L, 20)
L = inserir_dLigada(L, 30)
inserir_dLigada_fim(L, 40)
L = remover(L, busca(L, 10))

imprime_lista(L)