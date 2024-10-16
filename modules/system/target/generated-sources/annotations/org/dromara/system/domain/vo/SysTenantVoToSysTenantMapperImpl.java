package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysTenant;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T08:36:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class SysTenantVoToSysTenantMapperImpl implements SysTenantVoToSysTenantMapper {

    @Override
    public SysTenant convert(SysTenantVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysTenant sysTenant = new SysTenant();

        sysTenant.setId( arg0.getId() );
        sysTenant.setTenantId( arg0.getTenantId() );
        sysTenant.setContactUserName( arg0.getContactUserName() );
        sysTenant.setContactPhone( arg0.getContactPhone() );
        sysTenant.setCompanyName( arg0.getCompanyName() );
        sysTenant.setLicenseNumber( arg0.getLicenseNumber() );
        sysTenant.setAddress( arg0.getAddress() );
        sysTenant.setDomain( arg0.getDomain() );
        sysTenant.setIntro( arg0.getIntro() );
        sysTenant.setRemark( arg0.getRemark() );
        sysTenant.setPackageId( arg0.getPackageId() );
        sysTenant.setExpireTime( arg0.getExpireTime() );
        sysTenant.setAccountCount( arg0.getAccountCount() );
        sysTenant.setStatus( arg0.getStatus() );

        return sysTenant;
    }

    @Override
    public SysTenant convert(SysTenantVo arg0, SysTenant arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setContactUserName( arg0.getContactUserName() );
        arg1.setContactPhone( arg0.getContactPhone() );
        arg1.setCompanyName( arg0.getCompanyName() );
        arg1.setLicenseNumber( arg0.getLicenseNumber() );
        arg1.setAddress( arg0.getAddress() );
        arg1.setDomain( arg0.getDomain() );
        arg1.setIntro( arg0.getIntro() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setPackageId( arg0.getPackageId() );
        arg1.setExpireTime( arg0.getExpireTime() );
        arg1.setAccountCount( arg0.getAccountCount() );
        arg1.setStatus( arg0.getStatus() );

        return arg1;
    }
}
