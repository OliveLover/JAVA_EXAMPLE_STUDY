public class Student {
    String name;
    String address;
    String phone;
    String email;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return this.name + " " + this.address + " " + this.phone + " " + this.email;
    }
    /*
    equals() 메소드를 Overriding 할 떄에 반드시 만족해야하는 조건
    1. 재귀(reflexive) : null이 아닌 x라는 객체의 x.equals(x) 결과는 항상 true여야만 한다.
    2. 대칭(symmetric) : null이 아닌 x와 y객체의 y.equals(x)가 true를 리턴했다면, x.equals(y)도 반드시 true를 리턴해야만 한다.
    3. 타동적(transitive) : null이 아닌 x, y, z가 있을 때 x.equals(y)가 true를 리턴하고, y.equals(z)가 true를 리턴하면, x.equals(z)는 반드시 true를 리턴해야만 한다.
    4. 일관(consistent) : null이 아닌 x와 y가 있을 때 객체가 변경되지 않은 상황에서는 몇 번을 호출하더라도 , x.equals(y)결과는 항상 true이거나 항상 false여야만 한다.
    5. null과의 비교: null이 아닌 x라는 객체의 x.equals(null) 결과는 항상 false여야만 한다.
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student) obj;

        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;

        if (address == null) {
            if (other.address != null) return false;
        } else if (!address.equals(other.address)) return false;

        if (phone == null) {
            if (other.phone != null) return false;
        } else if (!phone.equals(other.phone)) return false;

        if (email == null) {
            if (other.email != null) return false;
        } else if (!email.equals(other.email)) return false;

        return true;
    }
}
