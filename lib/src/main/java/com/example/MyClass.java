package com.example;

public class MyClass {
    private final static String spilt = "剑";

    public static void main(String[] args) {
        String str = "<item>尸骨钢骨刀</item>\n" +
                "        <item>夺心斩钢刀</item>\n" +
                "        <item>世尊破山刀</item>\n" +
                "        <item>双龙夺魄刀</item>\n" +
                "        <item>五蕴雪花刀</item>\n" +
                "        <item>残阳飞沙刀</item>\n" +
                "        <item>琉璃蛇蝎刀</item>\n" +
                "        <item>如意乘风刀</item>\n" +
                "        <item>穿空天照刀</item>\n" +
                "        <item>星罗炼狱刀</item>\n" +
                "        <item>丹鼎狼爪刀</item>\n" +
                "        <item>如意镰鼬刀</item>\n" +
                "        <item>尖锋战龙刀</item>\n" +
                "        <item>破元天凤刀</item>\n" +
                "        <item>封脉震天刀</item><!---->\n" +
                "        <item>屠魔蛇蝎刀</item>\n" +
                "        <item>真元玛瑙刀</item>\n" +
                "        <item>穿云皇极刀</item>\n" +
                "        <item>血魔罗刹刀</item>\n" +
                "        <item>赤阳拂柳刀</item>\n" +
                "        <item>圣光天心刀</item>\n" +
                "        <item>鱼翔地煞刀</item>\n" +
                "        <item>自在解脱刀</item>\n" +
                "        <item>湿婆金铜刀</item>\n" +
                "        <item>无影神妖刀</item>\n" +
                "        <item>丹心九天刀</item>\n" +
                "        <item>乾天少阳刀</item>\n" +
                "        <item>天元丹阳刀</item>\n" +
                "        <item>风云龙宫刀</item>\n" +
                "        <item>天翔震天刀</item>\n" +
                "        <item>蛊风天照刀</item>\n" +
                "        <item>青雷辟心刀</item>\n" +
                "        <item>紫雷赤雷刀</item>\n" +
                "        <item>妖灵天日刀</item>\n" +
                "        <item>慈航炼气刀</item>\n" +
                "        <item>丹阳无想刀</item>\n" +
                "        <item>天外旋锋刀</item>\n" +
                "        <item>掩日法性刀</item>\n" +
                "        <item>十绝迅蛇刀</item>\n" +
                "        <item>蚀魂双龙刀</item>\n" +
                "        <item>毒蛛轩辕刀</item>\n" +
                "        <item>断筋追魂刀</item>\n" +
                "        <item>双极凶虎刀</item>\n" +
                "        <item>天问凌霄刀</item>\n" +
                "        <item>疾风苍羽刀</item>\n" +
                "        <item>惊雷毒蛛刀</item>\n" +
                "        <item>流离罗刹刀</item>\n" +
                "        <item>绝情自然刀</item>";
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
                System.out.println("<item>" + s + "</item>          " + String.format("<!--%-4s-->", (num > 0 ? num * 10 : 1) + "级"));
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
