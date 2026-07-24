<@REV.REV_IMPORT/>
<#if S("SORD")=="SCR"||S("SORD")=="OPE">
import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
</#if>
<#if S("SORD")=="SCR">
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
<#else>
import mcframe.commonCore.container.MCConstRow;
</#if>
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;
<#if B("IS_DAO")>

import mcframe.commonCore.container.MCList;
import mcframe.serverCore.database.container.MCDBRow;
import mcframe.serverCore.database.container.MCDBList;
import mcframe.serverCore.database.container.MCDMLAgent;
import mcframe.serverCore.database.MCLockTableMode;

import static mcframe.commonCore.lang.MCDataType.BOOLEAN;
import static mcframe.commonCore.lang.MCDataType.DATE;
import static mcframe.commonCore.lang.MCDataType.NUMBER;
import static mcframe.commonCore.lang.MCDataType.STRING;
<#-- import static mcframe.commonCore.lang.MCDataType.BINARY; -->
</#if>
