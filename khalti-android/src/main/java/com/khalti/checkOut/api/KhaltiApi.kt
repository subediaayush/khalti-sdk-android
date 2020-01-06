package com.khalti.checkOut.api


import com.khalti.checkOut.banking.helper.BaseListPojo
import com.khalti.checkOut.form.helper.WalletConfirmPojo
import com.khalti.checkOut.form.helper.WalletInitPojo
import com.khalti.checkOut.helper.MerchantPreferencePojo
import retrofit2.Response
import retrofit2.http.*

@JvmSuppressWildcards
interface KhaltiApi {

    @GET
    suspend fun getBanks(@Url url: String, @QueryMap queryMap: Map<String, Any>): Response<BaseListPojo>

    @POST
    @FormUrlEncoded
    suspend fun initiatePayment(@Url url: String, @FieldMap dataMap: Map<String, Any>): Response<WalletInitPojo>

    @POST
    @FormUrlEncoded
    suspend fun confirmPayment(@Url url: String, @FieldMap dataMap: Map<String, Any>): Response<WalletConfirmPojo>
}