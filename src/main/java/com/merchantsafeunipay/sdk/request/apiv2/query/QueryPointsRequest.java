package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.apiv2.financial.DetachedRefundRequest;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryPointsResponse;

import java.math.BigDecimal;
import java.util.Map;

public class QueryPointsRequest extends ApiRequest<QueryPointsResponse> {
    private String merchantPaymentId;
    private String encryptedData;

    private BigDecimal amount;

    private String customer;

    private Currency currency;

    private String cardToken;

    private String cardPan;

    private String cardExpiry;

    private String nameOnCard;

    private String cardCvv;

    private String installments;

    private String paymentSystem;

    private boolean forGroup;

    private String dealerTypeName;

    private Map<String, String> extra;


    private QueryPointsRequest() {
    }

    public static QueryPointsRequestBuilder builder() {
        return new QueryPointsRequestBuilder();
    }

    @Override
    public Class<QueryPointsResponse> responseClass() {
        return QueryPointsResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.CARDPAN, this.cardPan);
        addToPayload(Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(Param.NAMEONCARD, this.nameOnCard);
        addToPayload(Param.CARDCVV, this.cardCvv);
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.FORGROUP, this.forGroup);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(Param.EXTRA, this.extra);
        addToPayload(Param.ENCRYPTEDDATA,this.encryptedData);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYPOINTS;
    }

    public static final class QueryPointsRequestBuilder {
        private String merchantPaymentId;
        private String encryptedData;
        private BigDecimal amount;

        private String customer;

        private Currency currency;

        private String cardToken;

        private String cardPan;

        private String cardExpiry;

        private String nameOnCard;

        private String cardCvv;

        private String installments;

        private String paymentSystem;

        private boolean forGroup;

        private String dealerTypeName;

        private Authentication authentication;

        private Map<String, String> extra;

        public QueryPointsRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryPointsRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public QueryPointsRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public QueryPointsRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryPointsRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public QueryPointsRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public QueryPointsRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public QueryPointsRequestBuilder withEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
            return this;
        }

        public QueryPointsRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public QueryPointsRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public QueryPointsRequestBuilder withCardCvv(String cardCvv) {
            this.cardCvv = cardCvv;
            return this;
        }

        public QueryPointsRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public QueryPointsRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryPointsRequestBuilder withForGroup(boolean forGroup) {
            this.forGroup = forGroup;
            return this;
        }

        public QueryPointsRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryPointsRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public QueryPointsRequest build() {
            QueryPointsRequest request = new QueryPointsRequest();
            request.authentication = this.authentication;
            request.merchantPaymentId = this.merchantPaymentId;
            request.amount = this.amount;
            request.customer = this.customer;
            request.currency = this.currency;
            request.cardToken = this.cardToken;
            request.cardPan = this.cardPan;
            request.cardExpiry = this.cardExpiry;
            request.nameOnCard = this.nameOnCard;
            request.cardCvv = this.cardCvv;
            request.installments = this.installments;
            request.paymentSystem = this.paymentSystem;
            request.forGroup = this.forGroup;
            request.dealerTypeName = this.dealerTypeName;
            request.extra = this.extra;
            request.encryptedData = this.encryptedData;
            return request;
        }
    }
}
