package com.ft.compose_online_shop.repositories

import com.ft.compose_online_shop.data.local.RoomDao
import com.ft.compose_online_shop.models.Advertisement
import com.ft.compose_online_shop.models.Manufacturer
import com.ft.compose_online_shop.sealed.DataResponse
import com.ft.compose_online_shop.sealed.Error
import com.ft.compose_online_shop.utils.getStructuredManufacturers
import javax.inject.Inject

class BrandsRepository @Inject constructor(
    private val dao: RoomDao,
) {
    suspend fun getBrandsAdvertisements(): DataResponse<List<Advertisement>> {
        /** First we should check the local storage */
        dao.getAdvertisements().let {
            return if (it.isNotEmpty()) {
                DataResponse.Success(data = it)
            } else {
                /** Now we should fetch from the remote server */
                DataResponse.Error(error = Error.Empty)
            }
        }
    }

    suspend fun getBrandsWithProducts(): DataResponse<List<Manufacturer>> {
        /** First we should check the local storage */
        dao.getManufacturersWithProducts().getStructuredManufacturers().let {
            return if (it.isNotEmpty()) {
                DataResponse.Success(data = it)
            } else {
                /** Now we should fetch from the remote server */
                DataResponse.Error(error = Error.Empty)
            }
        }
    }
}

