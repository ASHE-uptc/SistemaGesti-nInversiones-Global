package co.edu.uptc.model;

public class PortfolioReportDTO {
    private String investorId;
    private String name;
    private String email;
    private double availableCapital;
    private double currentPortfolioValue;
    private double yieldPercentage;
    private double averageRisk;

    public PortfolioReportDTO() {}

    public PortfolioReportDTO(String investorId, String name, String email, double availableCapital, 
                              double currentPortfolioValue, double yieldPercentage, double averageRisk) {
        this.investorId = investorId;
        this.name = name;
        this.email = email;
        this.availableCapital = availableCapital;
        this.currentPortfolioValue = currentPortfolioValue;
        this.yieldPercentage = yieldPercentage;
        this.averageRisk = averageRisk;
    }

    // Getters and Setters
    public String getInvestorId() { return investorId; }
    public void setInvestorId(String investorId) { this.investorId = investorId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getAvailableCapital() { return availableCapital; }
    public void setAvailableCapital(double availableCapital) { this.availableCapital = availableCapital; }

    public double getCurrentPortfolioValue() { return currentPortfolioValue; }
    public void setCurrentPortfolioValue(double currentPortfolioValue) { this.currentPortfolioValue = currentPortfolioValue; }

    public double getYieldPercentage() { return yieldPercentage; }
    public void setYieldPercentage(double yieldPercentage) { this.yieldPercentage = yieldPercentage; }

    public double getAverageRisk() { return averageRisk; }
    public void setAverageRisk(double averageRisk) { this.averageRisk = averageRisk; }
}
