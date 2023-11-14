package TheCore.Spring

public class ChristmasTree {
    public static void main(String[] args) {
        System.out.println("*************************".length());
        String[] tree = mySolution(1,1);
        for(String s:tree){
            System.out.println(s);
        }
    }

    private static String[] mySolution(int levelNum, int levelHeight) {
        int treeSize = 3;
        treeSize += levelNum * levelHeight;
        treeSize += levelNum;
        String[] tree = new String[treeSize];
        int maxWidth = 3;
        int copyHeight = levelHeight;
        int copyLevel = levelNum;
        if (copyLevel >= 1) {
            while (copyHeight != 0) {
                maxWidth += 2;
                copyHeight--;
            }
            if(copyLevel>1){
                for(int i=0;i<levelNum-1;i++){
                    maxWidth+=2;
                }
            }
        }
        tree[0] = buildLine("*", maxWidth);
        tree[1] = buildLine("*", maxWidth);
        tree[2] = buildLine("***", maxWidth);
        int levels = 0;
        for (int i = 3; i <= tree.length - 2; i++) {
            if(levelNum == 0){
                break;
            }
            if (levelNum >= 1) {
                StringBuilder newLine = new StringBuilder("*" + tree[2].trim() + "*");
                int copyLevels = levels;
                while(copyLevels>0) {
                    newLine.append("**");
                    copyLevels--;
                }
                int j;
                for (j = 0; j < levelHeight; j++) {
                    tree[i + j] = buildLine(newLine.toString(), maxWidth);
                    newLine = new StringBuilder("*" + tree[i + j].trim() + "*");
                }
                i += j-1;
                levelNum--;
                levels++;
            }

        }
        for (int i = tree.length - 1; i >= tree.length- copyLevel; i--) {
            StringBuilder sb = new StringBuilder();
            if (levelHeight % 2 == 1) {
                sb.append("*".repeat(levelHeight));
            } else {
                sb.append("*".repeat(levelHeight + 1));
            }
            tree[i] = buildLine(sb.toString(),maxWidth);
        }
        return tree;
    }

    private static String buildLine(String initial, int size) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ".repeat(Math.max(0, size)));
        stringBuilder.replace(size / 2 - initial.length() / 2, size / 2 + initial.length() / 2 + 1, initial);
        return stringBuilder.substring(0,size / 2 + initial.length() / 2 + 1);
    }
}
