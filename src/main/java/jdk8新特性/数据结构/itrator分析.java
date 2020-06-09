package jdk8新特性.数据结构;//package jdk8新特性.数据结构;
//
//import java.util.Iterator;
//import java.util.function.Consumer;
//
///**
// * @description:
// * @author: 范子祺
// **/
//public class itrator分析 implements Iterator<E> {
//
////    int cursor;       // index of next element to return
////    int lastRet = -1; // index of last element returned; -1 if no such
////    int expectedModCount = modCount;
////
////    Itr() {}
////
////    public boolean hasNext() {
////        return cursor != size;
////    }
////
////    @SuppressWarnings("unchecked")
////    public E next() {
////        checkForComodification();
////        int i = cursor;
////        if (i >= size)
////            throw new NoSuchElementException();
////        Object[] elementData = ArrayList.this.elementData;
////        if (i >= elementData.length)
////            throw new ConcurrentModificationException();
////        cursor = i + 1;
////        return (E) elementData[lastRet = i];
////    }
////
////    public void remove() {
////        if (lastRet < 0)
////            throw new IllegalStateException();
////        checkForComodification();
////
////        try {
////            ArrayList.this.remove(lastRet);
////            cursor = lastRet;
////            lastRet = -1;
////            expectedModCount = modCount;
////        } catch (IndexOutOfBoundsException ex) {
////            throw new ConcurrentModificationException();
////        }
////    }
////
////    @Override
////    @SuppressWarnings("unchecked")
////    public void forEachRemaining(Consumer<? super E> consumer) {
////        Objects.requireNonNull(consumer);
////        final int size = ArrayList.this.size;
////        int i = cursor;
////        if (i >= size) {
////            return;
////        }
////        final Object[] elementData = ArrayList.this.elementData;
////        if (i >= elementData.length) {
////            throw new ConcurrentModificationException();
////        }
////        while (i != size && modCount == expectedModCount) {
////            consumer.accept((E) elementData[i++]);
////        }
////        // update once at end of iteration to reduce heap write traffic
////        cursor = i;
////        lastRet = i - 1;
////        checkForComodification();
////    }
////
////    final void checkForComodification() {
////        if (modCount != expectedModCount)
////            throw new ConcurrentModificationException();
////    }
////---------------------
////    版权声明：本文为CSDN博主「我爱吻篮板」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
////    原文链接：https://blog.csdn.net/qq_34796981/article/details/81777249
//}
