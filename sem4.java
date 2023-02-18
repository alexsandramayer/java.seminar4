package seminar4;
// import java.util.LinkedList;


// задача 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
// public class sem4 {
//     public static void main (String[] args){
//         LinkedList<Integer> linList = new LinkedList<>();
//         for (int i = 0; i < 6; i++){
//             linList.add(i,i); 
//         }
//         linList.add(6); 
//         linList.add(7);
//         System.out.println("Исходный список: " +linList);    
//         System.out.println("Итоговый список: " + reverse(linList)); 


//     }
//     public static LinkedList<Integer> reverse (LinkedList<Integer> listInit){
//         LinkedList<Integer> resList = new LinkedList<>();
//         for (int i = listInit.size()-1; i > -1; i--){
//             resList.add(listInit.get(i));
//         }
//         return resList;
//     }
// }

// Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// public class sem4 {
    
//     public static LinkedList<Integer> enqueue (LinkedList<Integer> list, int num){
//         list.addLast(num);
//         System.out.println(list);   
//         return list;
//     } 
//     public static int dequeue (LinkedList<Integer> list){
//         int temp = list.get(0);
//         list.remove(0);
//         System.out.println(list);
//         return temp;
//     } 
//     public static int first (LinkedList<Integer> list) {
//         return list.get(0);
//     }
// }