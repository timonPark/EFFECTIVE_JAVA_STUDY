package me.timonpark.ejs.effectivejavastudy.item03.perfact;

import java.io.Serializable;
import java.io.ObjectStreamException;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Elvis03 implements Serializable {

    private static final long serialVersionUID = 1L;

    // Holder 클래스: 싱글턴 인스턴스를 안전하게 생성하고 저장합니다.
    private static final class Holder {
        // 정적 초기화: 클래스 로딩 시점에 싱글턴 인스턴스를 생성합니다.
        private static final Elvis03 INSTANCE = new Elvis03();
    }

    // 생성자: 인스턴스가 이미 존재하는 경우 IllegalStateException을 발생시킵니다.
    private Elvis03() {
        if (Holder.INSTANCE != null) {
            throw new IllegalStateException("Instance already exists!");
        }
        // 초기화 작업 (필요한 경우)
    }

    // getInstance(): Holder 클래스의 정적 변수 INSTANCE를 반환합니다.
    public static Elvis03 getInstance() {
        return Holder.INSTANCE;
    }

    // readResolve(): 역직렬화 시 기존 싱글턴 인스턴스를 반환합니다.
    private Object readResolve() throws ObjectStreamException {
        return Holder.INSTANCE;
    }

    // readObject(): 역직렬화 시 초기화 작업을 수행할 수 있습니다.
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
    }
}

