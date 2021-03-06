/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin.
 */
package org.apache.camel.salesforce.dto;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.Attributes;
import org.apache.camel.component.salesforce.api.dto.ChildRelationShip;
import org.apache.camel.component.salesforce.api.dto.InfoUrls;
import org.apache.camel.component.salesforce.api.dto.NamedLayoutInfo;
import org.apache.camel.component.salesforce.api.dto.RecordTypeInfo;
import org.apache.camel.component.salesforce.api.dto.SObjectDescription;
import org.apache.camel.component.salesforce.api.dto.SObjectDescriptionUrls;
import org.apache.camel.component.salesforce.api.dto.SObjectField;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import org.apache.camel.component.salesforce.api.utils.AsNestedPropertyResolver;

/**
 * Salesforce DTO for SObject Opportunity
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public class Opportunity extends AbstractDescribedSObjectBase {

    public Opportunity() {
        getAttributes().setType("Opportunity");
    }

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    private AbstractDescribedSObjectBase Account;

    @JsonProperty("Account")
    public AbstractDescribedSObjectBase getAccount() {
        return this.Account;
    }

    @JsonProperty("Account")
    public void setAccount(AbstractDescribedSObjectBase Account) {
        this.Account = Account;
    }
    private Boolean IsPrivate;

    @JsonProperty("IsPrivate")
    public Boolean getIsPrivate() {
        return this.IsPrivate;
    }

    @JsonProperty("IsPrivate")
    public void setIsPrivate(Boolean IsPrivate) {
        this.IsPrivate = IsPrivate;
    }

    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    private Opportunity_StageNameEnum StageName;

    @JsonProperty("StageName")
    public Opportunity_StageNameEnum getStageName() {
        return this.StageName;
    }

    @JsonProperty("StageName")
    public void setStageName(Opportunity_StageNameEnum StageName) {
        this.StageName = StageName;
    }

    private Double Amount;

    @JsonProperty("Amount")
    public Double getAmount() {
        return this.Amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    private Double Probability;

    @JsonProperty("Probability")
    public Double getProbability() {
        return this.Probability;
    }

    @JsonProperty("Probability")
    public void setProbability(Double Probability) {
        this.Probability = Probability;
    }

    private Double ExpectedRevenue;

    @JsonProperty("ExpectedRevenue")
    public Double getExpectedRevenue() {
        return this.ExpectedRevenue;
    }

    @JsonProperty("ExpectedRevenue")
    public void setExpectedRevenue(Double ExpectedRevenue) {
        this.ExpectedRevenue = ExpectedRevenue;
    }

    private Double TotalOpportunityQuantity;

    @JsonProperty("TotalOpportunityQuantity")
    public Double getTotalOpportunityQuantity() {
        return this.TotalOpportunityQuantity;
    }

    @JsonProperty("TotalOpportunityQuantity")
    public void setTotalOpportunityQuantity(Double TotalOpportunityQuantity) {
        this.TotalOpportunityQuantity = TotalOpportunityQuantity;
    }

    private java.time.LocalDate CloseDate;

    @JsonProperty("CloseDate")
    public java.time.LocalDate getCloseDate() {
        return this.CloseDate;
    }

    @JsonProperty("CloseDate")
    public void setCloseDate(java.time.LocalDate CloseDate) {
        this.CloseDate = CloseDate;
    }

    private Opportunity_TypeEnum Type;

    @JsonProperty("Type")
    public Opportunity_TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(Opportunity_TypeEnum Type) {
        this.Type = Type;
    }

    private String NextStep;

    @JsonProperty("NextStep")
    public String getNextStep() {
        return this.NextStep;
    }

    @JsonProperty("NextStep")
    public void setNextStep(String NextStep) {
        this.NextStep = NextStep;
    }

    private Opportunity_LeadSourceEnum LeadSource;

    @JsonProperty("LeadSource")
    public Opportunity_LeadSourceEnum getLeadSource() {
        return this.LeadSource;
    }

    @JsonProperty("LeadSource")
    public void setLeadSource(Opportunity_LeadSourceEnum LeadSource) {
        this.LeadSource = LeadSource;
    }

    private Boolean IsClosed;

    @JsonProperty("IsClosed")
    public Boolean getIsClosed() {
        return this.IsClosed;
    }

    @JsonProperty("IsClosed")
    public void setIsClosed(Boolean IsClosed) {
        this.IsClosed = IsClosed;
    }

    private Boolean IsWon;

    @JsonProperty("IsWon")
    public Boolean getIsWon() {
        return this.IsWon;
    }

    @JsonProperty("IsWon")
    public void setIsWon(Boolean IsWon) {
        this.IsWon = IsWon;
    }

    private Opportunity_ForecastCategoryEnum ForecastCategory;

    @JsonProperty("ForecastCategory")
    public Opportunity_ForecastCategoryEnum getForecastCategory() {
        return this.ForecastCategory;
    }

    @JsonProperty("ForecastCategory")
    public void setForecastCategory(Opportunity_ForecastCategoryEnum ForecastCategory) {
        this.ForecastCategory = ForecastCategory;
    }

    private Opportunity_ForecastCategoryNameEnum ForecastCategoryName;

    @JsonProperty("ForecastCategoryName")
    public Opportunity_ForecastCategoryNameEnum getForecastCategoryName() {
        return this.ForecastCategoryName;
    }

    @JsonProperty("ForecastCategoryName")
    public void setForecastCategoryName(Opportunity_ForecastCategoryNameEnum ForecastCategoryName) {
        this.ForecastCategoryName = ForecastCategoryName;
    }

    private String CampaignId;

    @JsonProperty("CampaignId")
    public String getCampaignId() {
        return this.CampaignId;
    }

    @JsonProperty("CampaignId")
    public void setCampaignId(String CampaignId) {
        this.CampaignId = CampaignId;
    }

    private AbstractDescribedSObjectBase Campaign;

    @JsonProperty("Campaign")
    public AbstractDescribedSObjectBase getCampaign() {
        return this.Campaign;
    }

    @JsonProperty("Campaign")
    public void setCampaign(AbstractDescribedSObjectBase Campaign) {
        this.Campaign = Campaign;
    }
    private Boolean HasOpportunityLineItem;

    @JsonProperty("HasOpportunityLineItem")
    public Boolean getHasOpportunityLineItem() {
        return this.HasOpportunityLineItem;
    }

    @JsonProperty("HasOpportunityLineItem")
    public void setHasOpportunityLineItem(Boolean HasOpportunityLineItem) {
        this.HasOpportunityLineItem = HasOpportunityLineItem;
    }

    private String Pricebook2Id;

    @JsonProperty("Pricebook2Id")
    public String getPricebook2Id() {
        return this.Pricebook2Id;
    }

    @JsonProperty("Pricebook2Id")
    public void setPricebook2Id(String Pricebook2Id) {
        this.Pricebook2Id = Pricebook2Id;
    }

    private AbstractDescribedSObjectBase Pricebook2;

    @JsonProperty("Pricebook2")
    public AbstractDescribedSObjectBase getPricebook2() {
        return this.Pricebook2;
    }

    @JsonProperty("Pricebook2")
    public void setPricebook2(AbstractDescribedSObjectBase Pricebook2) {
        this.Pricebook2 = Pricebook2;
    }
    private AbstractDescribedSObjectBase Owner;

    @JsonProperty("Owner")
    public AbstractDescribedSObjectBase getOwner() {
        return this.Owner;
    }

    @JsonProperty("Owner")
    public void setOwner(AbstractDescribedSObjectBase Owner) {
        this.Owner = Owner;
    }
    private AbstractDescribedSObjectBase CreatedBy;

    @JsonProperty("CreatedBy")
    public AbstractDescribedSObjectBase getCreatedBy() {
        return this.CreatedBy;
    }

    @JsonProperty("CreatedBy")
    public void setCreatedBy(AbstractDescribedSObjectBase CreatedBy) {
        this.CreatedBy = CreatedBy;
    }
    private AbstractDescribedSObjectBase LastModifiedBy;

    @JsonProperty("LastModifiedBy")
    public AbstractDescribedSObjectBase getLastModifiedBy() {
        return this.LastModifiedBy;
    }

    @JsonProperty("LastModifiedBy")
    public void setLastModifiedBy(AbstractDescribedSObjectBase LastModifiedBy) {
        this.LastModifiedBy = LastModifiedBy;
    }
    private Integer PushCount;

    @JsonProperty("PushCount")
    public Integer getPushCount() {
        return this.PushCount;
    }

    @JsonProperty("PushCount")
    public void setPushCount(Integer PushCount) {
        this.PushCount = PushCount;
    }

    private java.time.ZonedDateTime LastStageChangeDate;

    @JsonProperty("LastStageChangeDate")
    public java.time.ZonedDateTime getLastStageChangeDate() {
        return this.LastStageChangeDate;
    }

    @JsonProperty("LastStageChangeDate")
    public void setLastStageChangeDate(java.time.ZonedDateTime LastStageChangeDate) {
        this.LastStageChangeDate = LastStageChangeDate;
    }

    private Integer FiscalQuarter;

    @JsonProperty("FiscalQuarter")
    public Integer getFiscalQuarter() {
        return this.FiscalQuarter;
    }

    @JsonProperty("FiscalQuarter")
    public void setFiscalQuarter(Integer FiscalQuarter) {
        this.FiscalQuarter = FiscalQuarter;
    }

    private Integer FiscalYear;

    @JsonProperty("FiscalYear")
    public Integer getFiscalYear() {
        return this.FiscalYear;
    }

    @JsonProperty("FiscalYear")
    public void setFiscalYear(Integer FiscalYear) {
        this.FiscalYear = FiscalYear;
    }

    private String Fiscal;

    @JsonProperty("Fiscal")
    public String getFiscal() {
        return this.Fiscal;
    }

    @JsonProperty("Fiscal")
    public void setFiscal(String Fiscal) {
        this.Fiscal = Fiscal;
    }

    private String ContactId;

    @JsonProperty("ContactId")
    public String getContactId() {
        return this.ContactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
    }

    private Boolean HasOpenActivity;

    @JsonProperty("HasOpenActivity")
    public Boolean getHasOpenActivity() {
        return this.HasOpenActivity;
    }

    @JsonProperty("HasOpenActivity")
    public void setHasOpenActivity(Boolean HasOpenActivity) {
        this.HasOpenActivity = HasOpenActivity;
    }

    private Boolean HasOverdueTask;

    @JsonProperty("HasOverdueTask")
    public Boolean getHasOverdueTask() {
        return this.HasOverdueTask;
    }

    @JsonProperty("HasOverdueTask")
    public void setHasOverdueTask(Boolean HasOverdueTask) {
        this.HasOverdueTask = HasOverdueTask;
    }

    private String LastAmountChangedHistoryId;

    @JsonProperty("LastAmountChangedHistoryId")
    public String getLastAmountChangedHistoryId() {
        return this.LastAmountChangedHistoryId;
    }

    @JsonProperty("LastAmountChangedHistoryId")
    public void setLastAmountChangedHistoryId(String LastAmountChangedHistoryId) {
        this.LastAmountChangedHistoryId = LastAmountChangedHistoryId;
    }

    private AbstractDescribedSObjectBase LastAmountChangedHistory;

    @JsonProperty("LastAmountChangedHistory")
    public AbstractDescribedSObjectBase getLastAmountChangedHistory() {
        return this.LastAmountChangedHistory;
    }

    @JsonProperty("LastAmountChangedHistory")
    public void setLastAmountChangedHistory(AbstractDescribedSObjectBase LastAmountChangedHistory) {
        this.LastAmountChangedHistory = LastAmountChangedHistory;
    }
    private String LastCloseDateChangedHistoryId;

    @JsonProperty("LastCloseDateChangedHistoryId")
    public String getLastCloseDateChangedHistoryId() {
        return this.LastCloseDateChangedHistoryId;
    }

    @JsonProperty("LastCloseDateChangedHistoryId")
    public void setLastCloseDateChangedHistoryId(String LastCloseDateChangedHistoryId) {
        this.LastCloseDateChangedHistoryId = LastCloseDateChangedHistoryId;
    }

    private AbstractDescribedSObjectBase LastCloseDateChangedHistory;

    @JsonProperty("LastCloseDateChangedHistory")
    public AbstractDescribedSObjectBase getLastCloseDateChangedHistory() {
        return this.LastCloseDateChangedHistory;
    }

    @JsonProperty("LastCloseDateChangedHistory")
    public void setLastCloseDateChangedHistory(AbstractDescribedSObjectBase LastCloseDateChangedHistory) {
        this.LastCloseDateChangedHistory = LastCloseDateChangedHistory;
    }
    private Opportunity_DeliveryInstallationStatusEnum DeliveryInstallationStatus__c;

    @JsonProperty("DeliveryInstallationStatus__c")
    public Opportunity_DeliveryInstallationStatusEnum getDeliveryInstallationStatus__c() {
        return this.DeliveryInstallationStatus__c;
    }

    @JsonProperty("DeliveryInstallationStatus__c")
    public void setDeliveryInstallationStatus__c(Opportunity_DeliveryInstallationStatusEnum DeliveryInstallationStatus__c) {
        this.DeliveryInstallationStatus__c = DeliveryInstallationStatus__c;
    }

    private String TrackingNumber__c;

    @JsonProperty("TrackingNumber__c")
    public String getTrackingNumber__c() {
        return this.TrackingNumber__c;
    }

    @JsonProperty("TrackingNumber__c")
    public void setTrackingNumber__c(String TrackingNumber__c) {
        this.TrackingNumber__c = TrackingNumber__c;
    }

    private String OrderNumber__c;

    @JsonProperty("OrderNumber__c")
    public String getOrderNumber__c() {
        return this.OrderNumber__c;
    }

    @JsonProperty("OrderNumber__c")
    public void setOrderNumber__c(String OrderNumber__c) {
        this.OrderNumber__c = OrderNumber__c;
    }

    private String CurrentGenerators__c;

    @JsonProperty("CurrentGenerators__c")
    public String getCurrentGenerators__c() {
        return this.CurrentGenerators__c;
    }

    @JsonProperty("CurrentGenerators__c")
    public void setCurrentGenerators__c(String CurrentGenerators__c) {
        this.CurrentGenerators__c = CurrentGenerators__c;
    }

    private String MainCompetitors__c;

    @JsonProperty("MainCompetitors__c")
    public String getMainCompetitors__c() {
        return this.MainCompetitors__c;
    }

    @JsonProperty("MainCompetitors__c")
    public void setMainCompetitors__c(String MainCompetitors__c) {
        this.MainCompetitors__c = MainCompetitors__c;
    }

    private String ExternalId__c;

    @JsonProperty("ExternalId__c")
    public String getExternalId__c() {
        return this.ExternalId__c;
    }

    @JsonProperty("ExternalId__c")
    public void setExternalId__c(String ExternalId__c) {
        this.ExternalId__c = ExternalId__c;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Opportunity ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("AccountId", "Account ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("IsPrivate", "Private", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("Name", "Name", "string", "xsd:string", 120, false, false, true, false, false, false, true);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("Description", "Description", "textarea", "xsd:string", 32000, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("StageName", "Stage", "picklist", "xsd:string", 255, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("Amount", "Amount", "currency", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("Probability", "Probability (%)", "percent", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("ExpectedRevenue", "Expected Amount", "currency", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("TotalOpportunityQuantity", "Quantity", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("CloseDate", "Close Date", "date", "xsd:date", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("Type", "Opportunity Type", "picklist", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("NextStep", "Next Step", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("LeadSource", "Lead Source", "picklist", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("IsClosed", "Closed", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("IsWon", "Won", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("ForecastCategory", "Forecast Category", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("ForecastCategoryName", "Forecast Category", "picklist", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("CampaignId", "Campaign ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField20);
        final SObjectField sObjectField21 = createField("HasOpportunityLineItem", "Has Line Item", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField21);
        final SObjectField sObjectField22 = createField("Pricebook2Id", "Price Book ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField22);
        final SObjectField sObjectField23 = createField("OwnerId", "Owner ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField23);
        final SObjectField sObjectField24 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField24);
        final SObjectField sObjectField25 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField25);
        final SObjectField sObjectField26 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField26);
        final SObjectField sObjectField27 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField27);
        final SObjectField sObjectField28 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField28);
        final SObjectField sObjectField29 = createField("LastActivityDate", "Last Activity", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField29);
        final SObjectField sObjectField30 = createField("PushCount", "Push Count", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField30);
        final SObjectField sObjectField31 = createField("LastStageChangeDate", "Last Stage Change Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField31);
        final SObjectField sObjectField32 = createField("FiscalQuarter", "Fiscal Quarter", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField32);
        final SObjectField sObjectField33 = createField("FiscalYear", "Fiscal Year", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField33);
        final SObjectField sObjectField34 = createField("Fiscal", "Fiscal Period", "string", "xsd:string", 6, false, true, false, false, false, false, false);
        fields1.add(sObjectField34);
        final SObjectField sObjectField35 = createField("ContactId", "Contact ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField35);
        final SObjectField sObjectField36 = createField("LastViewedDate", "Last Viewed Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField36);
        final SObjectField sObjectField37 = createField("LastReferencedDate", "Last Referenced Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField37);
        final SObjectField sObjectField38 = createField("HasOpenActivity", "Has Open Activity", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField38);
        final SObjectField sObjectField39 = createField("HasOverdueTask", "Has Overdue Task", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField39);
        final SObjectField sObjectField40 = createField("LastAmountChangedHistoryId", "Opportunity History ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField40);
        final SObjectField sObjectField41 = createField("LastCloseDateChangedHistoryId", "Opportunity History ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField41);
        final SObjectField sObjectField42 = createField("DeliveryInstallationStatus__c", "Delivery/Installation Status", "picklist", "xsd:string", 255, false, true, false, false, true, false, false);
        fields1.add(sObjectField42);
        final SObjectField sObjectField43 = createField("TrackingNumber__c", "Tracking Number", "string", "xsd:string", 12, false, true, false, false, true, false, false);
        fields1.add(sObjectField43);
        final SObjectField sObjectField44 = createField("OrderNumber__c", "Order Number", "string", "xsd:string", 8, false, true, false, false, true, false, false);
        fields1.add(sObjectField44);
        final SObjectField sObjectField45 = createField("CurrentGenerators__c", "Current Generator(s)", "string", "xsd:string", 100, false, true, false, false, true, false, false);
        fields1.add(sObjectField45);
        final SObjectField sObjectField46 = createField("MainCompetitors__c", "Main Competitor(s)", "string", "xsd:string", 100, false, true, false, false, true, false, false);
        fields1.add(sObjectField46);
        final SObjectField sObjectField47 = createField("ExternalId__c", "External Id", "string", "xsd:string", 255, true, false, false, true, true, false, true);
        fields1.add(sObjectField47);

        description.setLabel("Opportunity");
        description.setLabelPlural("Opportunities");
        description.setName("Opportunity");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setApprovalLayouts("/services/data/v53.0/sobjects/Opportunity/describe/approvalLayouts");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v53.0/sobjects/Opportunity/describe/compactLayouts");
        sObjectDescriptionUrls1.setDescribe("/services/data/v53.0/sobjects/Opportunity/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v53.0/sobjects/Opportunity/describe/layouts");
        sObjectDescriptionUrls1.setListviews("/services/data/v53.0/sobjects/Opportunity/listviews");
        sObjectDescriptionUrls1.setQuickActions("/services/data/v53.0/sobjects/Opportunity/quickActions");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v53.0/sobjects/Opportunity/{ID}");
        sObjectDescriptionUrls1.setSobject("/services/data/v53.0/sobjects/Opportunity");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://redhat-8b-dev-ed.my.salesforce.com/{ID}");
        sObjectDescriptionUrls1.setUiEditTemplate("https://redhat-8b-dev-ed.my.salesforce.com/{ID}/e");
        sObjectDescriptionUrls1.setUiNewRecord("https://redhat-8b-dev-ed.my.salesforce.com/006/e");
        description.setUrls(sObjectDescriptionUrls1);

        return description;
    }
}
