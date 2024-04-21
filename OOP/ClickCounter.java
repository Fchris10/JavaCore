package OOP;

    public class ClickCounter{

        int value;

        public ClickCounter(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public void click(){
            value++;
        }
        public void undo(){
            if(value != 0){
                value--;
            }
        }
        public void reset(){
            value = 0;
        }
    }