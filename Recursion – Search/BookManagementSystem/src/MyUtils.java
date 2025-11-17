
/**
 * Utility class containing search methods and ISBN validation
 * This class provides sequential search, binary search, and value range search functionality
 */

public class MyUtils {

    /**
     * Sequential search for integers in an array
        - array: The array to search in
        - target: The integer value to search for
        - count: The number of actual elements in the array
        return: The index if found, -1 if not found
     */
    public static int seqSearch(int[] array, int target, int count) {
        for (int i = 0; i < count; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Sequential search for integers in an array
        - array: The array to search in
        - target: The integer value to search for
        - count: The number of actual elements in the array
        return: The index if found, -1 if not found
     */
    public static int seqSearch(String[] array, String target, int count) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Binary search for integers in a sorted array
        - array The sorted array to search in
        - target: The integer value to search for
        - count: The number of actual elements in the array
        return: The index if found, -1 if not found
     */
    public static int binSearch(int[] array, int target, int count) {
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Binary search for strings in a sorted array
        - array The sorted array to search in
        - target: The integer value to search for
        - count: The number of actual elements in the array
        return: The index if found, -1 if not found
     */
    public static int binSearch(String[] array, String target, int count) {
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = array[mid].compareTo(target);

            if (comparison == 0) {
                return mid;
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Search for books within a price range
        - books The array of books
        - count The number of actual books in the array
        - minPrice The minimum price
        - maxPrice The maximum price
     */
    public static void valueSearch(Book[] books, int count, double minPrice, double maxPrice) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getPrice() >= minPrice && books[i].getPrice() <= maxPrice) {
                books[i].displayBookInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found in the price range " + minPrice + " - " + maxPrice + "€");
        }
    }

    /**
     * Validates ISBN-10 or ISBN-13 format
        - isbn The ISBN string to validate
        return true if valid, false if invalid
     */
    public static boolean isValidISBN(String isbn) {
        // Remove any hyphens or spaces
        String cleanIsbn = isbn.replaceAll("[\\-\\s]", "");

        // Check if it's ISBN-10 (10 digits)
        if (cleanIsbn.length() == 10) {
            return isValidISBN10(cleanIsbn);
        }
        // Check if it's ISBN-13 (13 digits)
        else if (cleanIsbn.length() == 13) {
            return isValidISBN13(cleanIsbn);
        }
        // Invalid length
        else {
            return false;
        }
    }

    /**
     * Validates ISBN-10 format
     */
    private static boolean isValidISBN10(String isbn) {
        // Check if all characters are digits
        if (!isbn.matches("\\d{10}")) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i));
            int weight = 10 - i;
            sum += digit * weight;
        }

        return (sum % 11 == 0);
    }

    /**
     * Validates ISBN-13 format
     */
    private static boolean isValidISBN13(String isbn) {
        // Check if all characters are digits
        if (!isbn.matches("\\d{13}")) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 13; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i));
            int weight = (i % 2 == 0) ? 1 : 3;
            sum += digit * weight;
        }

        return (sum % 10 == 0);
    }
}
