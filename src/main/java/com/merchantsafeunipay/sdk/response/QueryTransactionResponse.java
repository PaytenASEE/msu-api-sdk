package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Bin;
import com.merchantsafeunipay.sdk.response.model.Transaction;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryTransactionResponse extends ApiResponse {
    private String transactionCount;
    private String totalTransactionCount;
    @JsonProperty(value = "transactionList")
    @XmlElementWrapper(name = "transactionList")
    @XmlElement(name = "transaction")
    private List<TransactionList> transactionList;

    public String getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(String transactionCount) {
        this.transactionCount = transactionCount;
    }

    public String getTotalTransactionCount() {
        return totalTransactionCount;
    }

    public void setTotalTransactionCount(String totalTransactionCount) {
        this.totalTransactionCount = totalTransactionCount;
    }
    public List<TransactionList> getTransactionList (){return transactionList;}

    public void setTransactionList(List<TransactionList> transactionList){this.transactionList = transactionList;}

}
