
tam = 10
f = []
print('Determine os filmes: ')
for i in range(tam):
  f.append(input())

def lista(l):
  for i in range(tam):
    print('Você já assistiu ',f[i],'? ',sep='',end='')
    l.append(input().lower())
    if l[i] == 'sim':
      l[i] = True
    else:
      l[i] = False

print('\n--------- USUÁRIO 1 ---------\n(Responda com "sim" ou "não")\n')
u1 = []
lista(u1)
print('\n--------- USUÁRIO 2 ---------\n(Responda com "sim" ou "não")\n')
u2 = []
lista(u2)
print('\n-------------------------------\nRECOMENDAÇÕES PARA O USUÁRIO 1\n-------------------------------')
for i in range(tam):
  if u1[i] == False and u2[i] == True:
    print(f[i])
print('\n-------------------------------\nRECOMENDAÇÕES PARA O USUÁRIO 2\n-------------------------------')
for i in range(tam):
  if u1[i] == True and u2[i] == False:
    print(f[i])