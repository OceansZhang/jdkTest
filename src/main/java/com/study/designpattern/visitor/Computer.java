package com.study.designpattern.visitor;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author zy
 * @Date 2020/6/15 下午5:33
 */
//适用于内部固定
    //避免了不同visitor的if-else
public class Computer {
    ComputerComponent cpu = new CPU();
    ComputerComponent memory = new Memory();
    ComputerComponent board = new Board();

    public void accept(Vistor vistor){
        cpu.accept(vistor);
        memory.accept(vistor);
        board.accept(vistor);
    }
}

class MainClient{
    public static void main(String[] args) {
        PersonVistor personVistor = new PersonVistor();
        new Computer().accept(personVistor);
        System.out.println(personVistor.totalPrice);
    }
}


abstract class ComputerComponent{
    abstract double  getPricre();
    abstract void accept(Vistor vistor);
}

class CPU extends ComputerComponent{

    @Override
    double getPricre() {
        return 100;
    }

    @Override
    void accept(Vistor vistor) {
        vistor.visitCpu(this);
    }
}

class Memory extends ComputerComponent{

    @Override
    double getPricre() {
        return 200;
    }

    @Override
    void accept(Vistor vistor) {
        vistor.visitMemory(this);
    }
}
class Board extends ComputerComponent{

    @Override
    double getPricre() {
        return 300;
    }

    @Override
    void accept(Vistor vistor) {
        vistor.visitBoard(this);
    }
}

interface Vistor{
    void visitCpu(CPU cpu);
    void visitMemory(Memory memory);
    void visitBoard(Board board);
}

class PersonVistor implements Vistor{
    double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
       totalPrice += cpu.getPricre()*0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPricre()*0.9;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPricre()*0.9;
    }

}

class CorpVistor implements Vistor{

    double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPricre()*0.8;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPricre()*0.8;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPricre()*0.8;
    }
}
