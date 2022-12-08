A=[[1,2,3],[4,5,6],[7,8,9]]
B=[[9,8,7],[6,5,4],[3,2,1]]
C=[[0,0,0],[0,0,0],[0,0,0]]
for i in range(3):
    sum=0
    for j in range (3):
          for k in range (3):
                sum=sum+A[i][k]*B[k][j]
          C[i][j]=sum
print(A)
print(B)
print(C)
