class Main {

    // Method to calculate BMI
    public static double calculateBmi(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Height and weight must be positive values.");
        }
        return weight / (height * height);
    }

    // Method to determine BMI category
    public String getBmiCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese"; // BMI >= 30
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            // Define height and weight variables
            double height = 1.75; 
            double weight = 75;   

            // Calculate BMI
            double bmi = calculateBmi(height, weight);
            System.out.println("BMI: " + bmi);

            // Determine BMI category
            Main mainObject = new Main();
            String category = mainObject.getBmiCategory(bmi);
            System.out.println("BMI Category: " + category);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}