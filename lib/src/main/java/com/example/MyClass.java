package com.example;

public class MyClass {
    private final static String spilt = "��";

    public static void main(String[] args) {
        String str = "<item>ʬ�Ǹֹǵ�</item>\n" +
                "        <item>����ն�ֵ�</item>\n" +
                "        <item>������ɽ��</item>\n" +
                "        <item>˫�����ǵ�</item>\n" +
                "        <item>����ѩ����</item>\n" +
                "        <item>������ɳ��</item>\n" +
                "        <item>������Ы��</item>\n" +
                "        <item>����˷絶</item>\n" +
                "        <item>�������յ�</item>\n" +
                "        <item>����������</item>\n" +
                "        <item>������צ��</item>\n" +
                "        <item>����������</item>\n" +
                "        <item>���ս����</item>\n" +
                "        <item>��Ԫ��ﵶ</item>\n" +
                "        <item>�������쵶</item><!---->\n" +
                "        <item>��ħ��Ы��</item>\n" +
                "        <item>��Ԫ��觵�</item>\n" +
                "        <item>���ƻʼ���</item>\n" +
                "        <item>Ѫħ��ɲ��</item>\n" +
                "        <item>����������</item>\n" +
                "        <item>ʥ�����ĵ�</item>\n" +
                "        <item>�����ɷ��</item>\n" +
                "        <item>���ڽ��ѵ�</item>\n" +
                "        <item>ʪ�Ž�ͭ��</item>\n" +
                "        <item>��Ӱ������</item>\n" +
                "        <item>���ľ��쵶</item>\n" +
                "        <item>Ǭ��������</item>\n" +
                "        <item>��Ԫ������</item>\n" +
                "        <item>����������</item>\n" +
                "        <item>�������쵶</item>\n" +
                "        <item>�Ʒ����յ�</item>\n" +
                "        <item>���ױ��ĵ�</item>\n" +
                "        <item>���׳��׵�</item>\n" +
                "        <item>�������յ�</item>\n" +
                "        <item>�Ⱥ�������</item>\n" +
                "        <item>�������뵶</item>\n" +
                "        <item>�������浶</item>\n" +
                "        <item>���շ��Ե�</item>\n" +
                "        <item>ʮ��Ѹ�ߵ�</item>\n" +
                "        <item>ʴ��˫����</item>\n" +
                "        <item>������ԯ��</item>\n" +
                "        <item>�Ͻ�׷�굶</item>\n" +
                "        <item>˫���׻���</item>\n" +
                "        <item>����������</item>\n" +
                "        <item>�������</item>\n" +
                "        <item>���׶��뵶</item>\n" +
                "        <item>������ɲ��</item>\n" +
                "        <item>������Ȼ��</item>";
        str = str.replace(" ", "");
        str = str.replace("<item>", "");
        str = str.replace("</item>", "");
        str = str.replace("\n", "");
        str = str.replace("<", "");
        str = str.replace("-", "");
        str = str.replace("!", "");
        str = str.replace(">", "");

        str = str.trim();
        final String spilt = str.charAt(4) + "";
        str = str.replace(spilt, spilt + " ");
        System.out.println(str);
        String[] weapon = str.split(" ");
        System.out.println(weapon.length);
        int num = 0;
        for (String s : weapon) {
            if (s.length() == 5) {
                System.out.println("<item>" + s + "</item>          " + String.format("<!--%-4s-->", (num > 0 ? num * 10 : 1) + "��"));
                num++;
            }
        }
        for (String s : weapon) {
            if (s.length() == 4)
                System.out.println("<item>" + s + "</item>");
        }
        System.out.println(num);
    }
}
