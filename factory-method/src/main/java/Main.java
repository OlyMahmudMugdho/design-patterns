import concreteCreator.UnixDialog;
import concreteCreator.WindowsDialog;
import creator.Dialog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String os;
        Dialog dialog;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your os : ");
        os = scanner.nextLine();
        scanner.close();

        // create dialog based on os
        switch (os) {
            case "linux", "mac":
                dialog = new UnixDialog();
                break;
            case "windows":
                dialog = new WindowsDialog();
                break;
            default:
                dialog = null;
                System.out.println("unsupported os");
                break;
        }

        if (dialog != null) dialog.showDialog();
    }
}
