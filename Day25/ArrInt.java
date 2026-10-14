package Day25;

public class ArrInt {
    int i = 0;
    int count = 0;

    int CalculateWriteIndex(char[] str) {
        count = 0;
        for (i = 0; i < str.length; i++) {
            if (str[i] >= '2' && str[i] <= '9') {
                count += str[i] - '0';
            } else {
                count++;
            }
        }
        return count - 1;
    }

    int CopyCharFromRighttoLeft(char[] str, char ch, int count, int writeIndex) {
        while (count > 0) {
            str[writeIndex] = ch;
            writeIndex--;
            count--;
        }
        return writeIndex;
    }

    void ExpandString(char[] str) {
        int writeIndex = CalculateWriteIndex(str);
        int readIndex = str.length - 1;
        while (writeIndex >= 0 && readIndex >= 0) {
            if (str[readIndex] >= '2' && str[readIndex] <= '9') {
                int repeatCount = str[readIndex] - '0';
                writeIndex = CopyCharFromRighttoLeft(str, str[readIndex - 1], repeatCount, writeIndex);
                readIndex--;
            } else {
                str[writeIndex] = str[readIndex];
                writeIndex--;
                readIndex--;
            }
        }
    }

    public static void main(String[] args) {

        ArrInt aInt = new ArrInt();
        aInt.CalculateWriteIndex(new char[0]);
        aInt.CopyCharFromRighttoLeft(null, '\0', 0, 5);
        aInt.ExpandString(null);
    }
}
