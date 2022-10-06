import java.io.*;
import java.util.Arrays;

public class Main {

    public static String printTextPerRole(String[] roles, String[] textLines) {

        /*System.out.println(roles[0]);
        String first = roles[0];
        System.out.println(first + ":");*/
        int indRole; // индекс для перебора ролей в roles
        int indText; // индекс для перебора реплик в textLines
        for (indRole = 0; indRole < roles.length; indRole++) {
            System.out.println(roles[indRole] + ":");
            for (indText = 0; indText < textLines.length; indText++ ) {
                System.out.println(textLines[indText]);
            }

        }


        return null;
    }
    public static void main(String[] args) {
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука",
                "Без реплики",
                "Лука Лукич"

        };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука: Господи боже! Я уронил своё пасхальное яйцо от неожиданности!"
        };
        printTextPerRole(roles, textLines);


    }
}