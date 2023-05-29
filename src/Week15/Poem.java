package Week15;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Introduce:第十五周作业
 * Author:AixCert
 * Date:2023/5/29 18:51
 */
public class Poem {
    //创建一个诗歌类
    private String title;//标题
    private String author;//作者
    private String content;//内容

    public Poem() {

    }

    public Poem(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Poem> poems = new HashMap<>();//创建一个HashMap集合

        //创建诗歌
        Poem poem1 = new Poem("静夜思", "李白", "床前明月光，疑是地上霜。");
        Poem poem2 = new Poem("春晓", "孟浩然", "春眠不觉晓，处处闻啼鸟。");
        Poem poem3 = new Poem("登鹳雀楼", "王之涣", "白日依山尽，黄河入海流。");
        Poem poem4 = new Poem("望庐山瀑布", "李白", "日照香炉生紫烟，遥看瀑布挂前川。");
        Poem poem5 = new Poem("江雪", "柳宗元", "千山鸟飞绝，万径人踪灭。");

        //将诗歌添加到集合中
        poems.put(poem1.getTitle(), poem1);
        poems.put(poem2.getTitle(), poem2);
        poems.put(poem3.getTitle(), poem3);
        poems.put(poem4.getTitle(), poem4);
        poems.put(poem5.getTitle(), poem5);

        //输入对应的诗歌标题，输出诗歌内容，输入“exit”退出程序
        while (true) {
            System.out.print("请输入诗歌标题(输入‘exit’退出程序)：");
            String title = scan.nextLine();
            //判断是否退出程序
            if (title.equals("exit")) {
                System.out.println("程序退出！");
                break;
            }
            if (poems.containsKey(title)) {
                System.out.println(poems.get(title).getContent());
            } else {
                System.out.println("没有找到对应的诗歌！");
            }
        }

    }
}
