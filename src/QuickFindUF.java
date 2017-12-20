/*
Есть массив. Индексы - номера объектов.
Надо соединить два объеекта и выснить есть ли между двумя объектами путь.
Объекты соединены <=> их элементы массива одинаковы.
 */


public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i]=i;
        }
    }

    public boolean connected (int p, int q){
        return id[p]==id[q];
    }

    public void union (int p, int q){
        int pid = id[p];
        int qid = id [q];
        for (int i = 0; i < id.length; i++){
            if (id[p] == pid)
                id[i] = qid;
        }
    }

}
