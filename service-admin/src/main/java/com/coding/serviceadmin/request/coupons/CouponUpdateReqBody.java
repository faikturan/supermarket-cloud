package com.coding.serviceadmin.request.coupons;

import java.util.Date;
import java.util.List;

import com.coding.supermarket.domain.coupon.model.CouponApplyRange;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CouponUpdateReqBody {
    private Integer amount;
    private Integer amountUseLimit;
    private Integer useTimeType;
    private Date startTime;
    private Date endTime;
    private Integer daysAfterReceive;
    private List<CouponApplyRange> applyTo;
    private Boolean superpositionUse;
    private String description;
    private Long updatedBy;
}
