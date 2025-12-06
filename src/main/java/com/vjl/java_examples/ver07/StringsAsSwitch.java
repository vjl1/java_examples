package com.vjl.java_examples.ver07;

public class StringsAsSwitch {

    public void printRoleMessageBeforeJava7(String role) {
        if (role == null) {
            System.out.println("no role");
            return;
        }
        if (role.equals("admin")) {
            System.out.println("You have all the access");
        } else if (role.equals("editor")) {
            System.out.println("You can edit content");
        } else if (role.equals("viewer")) {
            System.out.println("You can view content");
        } else {
            System.out.println("No role assigned");
        }
    }

    public void printRoleMessage(String role) {
        if (role == null) {
            System.out.println("no role");
            return;
        }
        switch (role) {
            case "admin":
                System.out.println("You have all the access");
                break;
            case "editor":
                System.out.println("You can edit content");
                break;
            case "viewer":
                System.out.println("You can view content");
                break;
            default:
                System.out.println("No role assigned");
        }
    }

    public static void main(String[] args) {
        StringsAsSwitch example = new StringsAsSwitch();
        example.printRoleMessage(null);
        example.printRoleMessage("admin");
        example.printRoleMessageBeforeJava7(null);
        example.printRoleMessageBeforeJava7("admin");
    }

}
