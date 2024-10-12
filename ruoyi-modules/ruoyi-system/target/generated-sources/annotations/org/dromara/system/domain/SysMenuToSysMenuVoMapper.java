package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig__66;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.bo.SysMenuBoToSysMenuMapper;
import org.dromara.system.domain.vo.SysMenuVo;
import org.dromara.system.domain.vo.SysMenuVoToSysMenuMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__66.class,
    uses = {SysMenuVoToSysMenuMapper.class,SysMenuBoToSysMenuMapper.class},
    imports = {}
)
public interface SysMenuToSysMenuVoMapper extends BaseMapper<SysMenu, SysMenuVo> {
}
