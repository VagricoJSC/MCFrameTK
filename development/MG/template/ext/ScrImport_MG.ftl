<#assign pkgList = pkgList()?word_list>
<@wrtAstImp pkg="mcframe.commonMA.constant"/>
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
<#if S("PACKAGE")!="mcframe.clientMAUC.MAUCP0010">
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
</#if>
<#if S("PACKAGE")!="mcframe.clientMAUC.MAUCP0020">
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
</#if>
<@wrtAstImp pkg="mcframe.commonMB.constant"/>
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
<#if S("PACKAGE")!="mcframe.clientMBUC.MBUCP0010">
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
</#if>
<#if S("PACKAGE")!="mcframe.clientMGUC.MGUCP0020">
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
<@wrtAstImp pkg="mcframe.common" + S("MODULE_ID") + ".constant"/>
import static mcframe.common${S("MODULE_ID")}.notice.${S("MODULE_ID")}_Msg.*;
</#if>
<#if S("PACKAGE")!="mcframe.clientMGUD.MGUDP0020">
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;
</#if>

<#macro wrtAstImp pkg>
<#if !pkgList?seq_contains(pkg)>
import ${pkg}.*;
</#if>
</#macro>

<#comment>FrameManagerが実装仕様書内容に応じて書き出すimportパッケージのリスト</#comment>
<#function pkgList>
<#assign pList="">
<#list A("IMPORT_PACKAGES") as aPkg>
<#assign pList = pList + " " + aPkg>
</#list>
<#return pList>
</#function>