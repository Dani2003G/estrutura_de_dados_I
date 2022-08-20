def gera_vetor(n):
    x = []
    for i in range(n):
        x.append(n - i)
    return x

def insertion_sort(v):
    for j in range(1, len(v)):
        chave = v[j]
        i = j - 1
        while i >= 0 and v[i] > chave:
            v[i + 1] = v[i]
            i -= 1
            v[i + 1] = chave

v = gera_vetor(5)
print(v)
insertion_sort(v)
print(v)