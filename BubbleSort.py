def bubble_sort(v):
    for i in range(len(v)):
        for j in range(len(v) - 1, i, -1):
            if (v[j] < v[j - 1]):
                aux = v[j]
                v[j] = v[j - 1]
                v[j - 1] = aux
                
def gera_vetor(n):
    x = []
    for i in range(n):
        x.append(n - i)
    return x

v = gera_vetor(10)
print(v)
bubble_sort(v)
print(v)