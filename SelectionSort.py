def gera_vetor(n):
    x = []
    for i in range(n):
        x.append(n - i)
    return x

def selection_sort(v):
    for i in range(len(v) - 1):
        min = i
        for j in range(i + 1, len(v)):
            if v[j] < v[min]:
                min = j
        if v[i] != v[min]:
            aux = v[min]
            v[min] = v[i]
            v[i] = aux

v = gera_vetor(5)
print(v)
selection_sort(v)
print(v)