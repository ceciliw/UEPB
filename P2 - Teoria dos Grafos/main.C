#include <stdio.h>

void quantlacos (int qvertices, int gra[][qvertices]) {
	int cont=0;
	for (int i=0;i<qvertices;i++) {
		cont += gra[i][i] * 2;
	}
	printf("O grafo possui %d laços",cont);
}

void maiorgrau (int qvertices, int gra[][qvertices]) {
	int maior=gra[0][0];
	for (int i=0;i<qvertices;i++) {
		for (int j=0;j<qvertices;j++) {
			if (gra[i][j]>maior)
				maior = gra[i][j];
		}
	}
	printf("O maior grau do grafo é %d",maior);
}

void menorgrau (int qvertices, int gra[][qvertices]) {
	int menor=gra[0][0];
	for (int i=0;i<qvertices;i++) {
		for (int j=0;j<qvertices;j++) {
			if (gra[i][j]<menor)
				menor = gra[i][j];
		}
	}
	printf("O menor grau do grafo é %d",menor);
}

void multigrafo (int gra[][10], int qvertices) {
	int verif = 0, i, j;
	for (i=0;i<qvertices;i++) {
		for (j=0;j<qvertices;j++) {
			if (gra[i][j]>1);
				verif = 1;
		}
	}
	if (verif == 1) 
		printf("\nÉ um multigrafo");
	else 
		printf("\nNão é um multigrafo");
}

void simples (int gra[][10], int qvertices) {
	int verif = 0, i, j;
	for (i=0;i<qvertices;i++) {
		for (j=0;j<qvertices;j++) {
			if (gra[i][i]>0 || (i!=j && gra[i][j]>1)) 
				verif = 1;
		}
	}
	if (verif == 1)
		printf("\nNão é um grafo simples");
	else 
		printf("\nÉ um grafo simples");
}

void isolado (int gra[][10],int qvertices) {
	int verif;
	int vert = -1;
	for (int i=0;i<qvertices;i++) {
		verif = 1;
		vert++;
	  for (int j=0;i<qvertices;j++) {
			if (gra[i][j]!=0) {
				verif = 0;
			}
		if (verif ==1) {
			break;
		}
		}
	}
	if (verif==0) 
    printf("\nO grafo não possui vértice isolado");
	else
	  printf("\nO grafo possui vértice isolado");
}

void folha (int gra[][10],int qvertices) {
  int verif=0;
	for (int i=0;i<qvertices;i++) {
		for (int j=0;j<qvertices;j++) {
			if ((gra[i][j]==gra[j][i]) && gra[i][j]<2){
				if (gra[i][j] == 1)
					verif++;
			}
		}
	}
	if (verif==1)
    printf("O grafo possui vértice folha");
	else
		printf("O grafo não possui vértice folha");
}

void completo (int gra[][10],int qvertices){
	int verif=1, i, j;
	for (i=0;i<qvertices;i++) {
		for (j=0;j<qvertices;j++) {
			if (gra[i][i] != 0) 
				verif = 0;
			else if (i!=j&&gra[i][j]!=1)
				verif = 0;
		}
	}
	if (verif == 1)
		printf("\nÉ um grafo completo");
	else 
		printf("\nNão é um grafo completo");
}

int main (void) {
	
	int ndever,tipo,representacao;
	printf("Informe a quantidade de vértices do grafo: ");
	scanf("%d",&ndever);
  int grafo[ndever][ndever];
	
	printf("\nInforme o tipo do grafo: \n1 - Direcionado\n2 - Não direcionado\n");
	scanf("%d",&tipo);

	printf("\nPreencha o grafo\n");
	int i, j, quantares;
	for (i=0;i<ndever;i++) {
		for (j=0;j<ndever;j++) {
			if (tipo == 2) {
				if (i<j || i==j) {
					printf("Ligações entre o vértice %d e %d: ",i,j);
					scanf("%d",&quantares);
					grafo[i][j] = quantares;
					grafo[j][i] = quantares;
				}
			} else {
				printf("Ligações entre o vértice %d e %d: ",i,j);
				scanf("%d",&quantares);
				grafo[i][j] = quantares;
			}
		}
	}

	printf("\nInforme a representação: \n1 - Matriz\n2 - Lista\n");
	scanf("%d",&representacao);
	if (representacao == 1){
		printf("\nMatriz de adjacências: \n");
    printf("    ");
		for (i=0;i<=ndever-1;i++) {
			printf("%d ",i);
		}
		printf("\n");
		for (i=0;i<ndever;i++) {
			printf("%d | ",i);
			for (j=0;j<ndever;j++) {
				printf("%d ",grafo[i][j]);
			}
			printf("|\n");
		}
	} else {
		printf("\nLista de adjacências: \n");
		for (i=0;i<ndever;i++) {
			printf("%d | ",i);
			for (j=0;j<ndever;j++) {
				if (grafo[i][j] != 0) {
				printf("%d ",j);
				}	
			}
			printf("\n");
		}
	}
	
	int continuar, gostaria, menu;
	printf("\nDigite 1 para saber mais informações sobre o grafo: ");
	scanf("%d",&gostaria);
	
	if (gostaria == 1) {
		printf("\n1 - Mostrar quantos laços tem o grafo\n2 - Mostrar maior grau do grafo\n3 - Mostrar menor grau do grafo\n4 - Saber se é um multigrafo\n5 - Saber se é um grafo simples\n6 - Verificar se existe vértice isolado\n7 - Verificar se existe vértice folha\n8 - Verificar se é um grafo completo\n");
		
		do {
			
			printf("\nQual você gostaria saber? ");
			scanf("%d",&menu);
			
			switch (menu) {
				case 1:
					quantlacos(grafo,ndever);
					break;
				case 2:
					maiorgrau(grafo,ndever);
					break;
				case 3:
					menorgrau(grafo,ndever);
					break;
				case 4:
					multigrafo(grafo,ndever);
					break;
				case 5:
					simples(grafo,ndever);
					break;
				case 6:
				  isolado(grafo,ndever);
				  break;
				case 7:
				  folha(grafo,ndever);
          break;
				case 8:
				  completo(grafo,ndever);
          break;
				default:
					printf("\nInválido");
					break;
			}
			
			printf("\n\nDigite 1 para outras informações: ");
			scanf("%d",&continuar);
			
		} while (continuar == 1);
	}	
  return 0;
}