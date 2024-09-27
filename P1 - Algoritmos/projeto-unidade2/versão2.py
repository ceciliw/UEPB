def assistiu(l1,l2):
  for i in l1:
    print('Você já assistiu ',i,'? ',sep='',end='')
    m = input().lower()
    if m == 'sim':
      l2.append(i)

def recomend(l,l2,r):
  for i in l:
    if i not in l2:
      r.append(i)

f = []
l2 = []
l3 = []

r1 = []
r2 = []
print('Insira os filmes: ')
for i in range(3):
  f.append(input())
assistiu(f,l2)
assistiu(f,l3)
recomend(l2,l3,r2)
recomend(l3,l2,r1)
print('\nRecomendaçoes pro usuário 1: ',*r1,'\nRecomendacões para o usuário 2: ',*r2)